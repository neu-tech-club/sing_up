package manager;

import DAO.IUserDAO;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.IbmEntity;

import java.util.List;


/**
 * Created by killeryuan on 2016/11/15.
 */
public class UserManager implements IUserManager{
    private IUserDAO userDAO ;

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    private ObjectMapper objectMapper;

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void save(IbmEntity ibmEntity) {
        userDAO.save( ibmEntity );
    }

    public List<IbmEntity> list( String club ) {
        return userDAO.list( club );
    }
}
