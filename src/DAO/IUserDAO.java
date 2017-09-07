package DAO;

import entity.IbmEntity;

import java.util.List;

/**
 * Created by tend on 2017/9/7.
 */
public interface IUserDAO {
    void save( IbmEntity ibmEntity );
    List<IbmEntity> list(String club );
}
