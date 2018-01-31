package tv.seei.manage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;
import tv.seei.manage.authorization.dao.TestUserDao;
import tv.seei.manage.authorization.dao.UserDao;
import tv.seei.manage.authorization.entity.TestUser;
import tv.seei.manage.authorization.entity.TokenModel;
import tv.seei.manage.authorization.entity.User;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {

	@Autowired
	private UserDao userDao;

	@Autowired
	private TestUserDao testUserDao;

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
//        stringRedisTemplate.opsForValue().set("aaa", "111");
//        System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
//        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));

        User user=new User("aa@126.com", "aa");
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        operations.set("com.neox", user);
        operations.set("com.neo.f", user,1, TimeUnit.SECONDS);
    }

}
