package tv.seei.manage.authorization.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import tv.seei.manage.authorization.dao.UserDao;
import tv.seei.manage.authorization.entity.User;

@Component
public class UserDaoImpl implements UserDao{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }
}
