package tv.seei.manage.authorization.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import tv.seei.manage.authorization.entity.TokenModel;
import tv.seei.manage.authorization.service.TokenManage;
import tv.seei.manage.common.constants.ManageConstant;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class TokenManageImpl implements TokenManage {

    private static final Logger logger = LoggerFactory.getLogger(TokenManageImpl.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public TokenModel createToken(long userId) {
        String token = String.valueOf(userId) + System.currentTimeMillis()+new Random().nextLong()+"";
        logger.info("token = "+token);
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            byte[] digest = md5.digest(token.getBytes());
            BASE64Encoder ba = new BASE64Encoder();
            token = ba.encode(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        logger.info(" 加密 token "+token);
        if (!this.stringRedisTemplate.hasKey(userId+"")) {
            ops.set(userId+"", token);
            System.out.println("set key success");
        } else {
            // 存在则打印之前的value值
            System.out.println("this key = " + ops.get(userId+""));
        }

        //存储到redis并设置过期时间
//        redis.boundValueOps(userId).set(token, ManageConstant.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return new TokenModel(userId, token);
    }

    @Override
    public boolean checkToken(TokenModel model) {
        return false;
    }

    @Override
    public TokenModel getToken(String authentication) {
        return null;
    }

    @Override
    public void deleteToken(long userId) {

    }
}
