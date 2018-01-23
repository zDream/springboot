package tv.seei.manage.authorization.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import tv.seei.manage.authorization.entity.User;

public interface UserDao extends MongoRepository<User ,String> {
//    void save(User user);
    User findUserByUsernameAndPassword(String username,String password);
    User getByUsername(String username);
}
