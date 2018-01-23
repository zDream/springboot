package tv.seei.manage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tv.seei.manage.authorization.dao.TestUserDao;
import tv.seei.manage.authorization.dao.UserDao;
import tv.seei.manage.authorization.entity.TestUser;
import tv.seei.manage.authorization.entity.TokenModel;
import tv.seei.manage.authorization.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {

	@Autowired
	private UserDao userDao;

	@Autowired
	private TestUserDao testUserDao;

	@Test
	public void contextLoads() {
        User zhangsan = new User("zhangsan111", "1234565");

        TestUser demoInfo = new TestUser();
        demoInfo.setName("lisi");
        demoInfo.setAge(20);
        testUserDao.save(demoInfo);

        TestUser user = testUserDao.getTestUserByName("张三");
        System.out.println(user.toString());
    }

}
