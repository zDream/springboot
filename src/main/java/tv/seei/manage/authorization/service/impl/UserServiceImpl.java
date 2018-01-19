package tv.seei.manage.authorization.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tv.seei.manage.authorization.dao.UserDao;
import tv.seei.manage.authorization.entity.User;
import tv.seei.manage.authorization.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.saveUser(user);
    }
}
