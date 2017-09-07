package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.IbmEntity;
import manager.IUserManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by tend on 2017/9/7.
 */
@Controller
@RequestMapping("club")
public class Handler {

    @Resource(name = "userManager")
    private IUserManager userManager;

    @Resource(name = "objectMapper")
    private ObjectMapper objectMapper;

    @RequestMapping("test")
    public String test(String test) {
        System.out.println(test);
        return "index";
    }

    @RequestMapping("sign_ibm")
    public void ibm(IbmEntity ibmEntity, HttpServletResponse response, HttpServletRequest request) {
        crossDomainSetting(response, request);
        ibmEntity.setClub("ibm");
        userManager.save(ibmEntity);
        System.out.println(ibmEntity.getCollege() + " " + ibmEntity.getStuName());
    }
    @RequestMapping("sign_csdn")
    public void csdn(IbmEntity ibmEntity, HttpServletResponse response, HttpServletRequest request) {
        crossDomainSetting(response, request);
        ibmEntity.setClub("csdn");
        userManager.save(ibmEntity);
    }

    @RequestMapping("list_ibm")
    public void ibm(HttpServletResponse response,  HttpServletRequest request) throws Exception {
        crossDomainSetting(response, request);
        response.getWriter().print( objectMapper.writeValueAsString(userManager.list("ibm")));
    }
    @RequestMapping("list_csdn")
    public void csdn(HttpServletResponse response, HttpServletRequest request) throws Exception {
        crossDomainSetting(response, request);
        response.getWriter().print( objectMapper.writeValueAsString(userManager.list("csdn")));
    }

    private void crossDomainSetting(HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods","POST");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,content-type");
        response.setHeader("Access-Control-Allow-Credentials","true"); //�Ƿ�֧��cookie����

    }

}
