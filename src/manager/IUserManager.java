package manager;

import entity.IbmEntity;

import java.util.List;

/**
 * Created by killeryuan on 2016/11/15.
 */
public interface IUserManager {
    void save(IbmEntity ibmEntity);
    List<IbmEntity> list(String club);
}
