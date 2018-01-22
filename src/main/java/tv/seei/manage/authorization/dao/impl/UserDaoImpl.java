package tv.seei.manage.authorization.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import tv.seei.manage.authorization.dao.UserDao;
import tv.seei.manage.authorization.entity.User;
import tv.seei.manage.base.dao.impl.BaseDaoImpl;

@Component
public class UserDaoImpl {

    @Autowired
    private MongoTemplate mongoTemplate;

//    @Override
    public void save(User user) {
        mongoTemplate.save(user);
    }

//    @Override
    public User get(int id) {
        Criteria criteria = Criteria.where("id").in(id);
        Query query = new Query(criteria);
        return mongoTemplate.findOne(query, User.class);
    }
}
