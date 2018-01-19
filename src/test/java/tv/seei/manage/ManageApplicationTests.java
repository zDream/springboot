package tv.seei.manage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tv.seei.manage.authorization.dao.UserDao;
import tv.seei.manage.authorization.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	public void contextLoads() {
        User zhangsan = new User(12L, "zhangsan111", "1234565");
        userDao.saveUser(zhangsan);
	}

}
