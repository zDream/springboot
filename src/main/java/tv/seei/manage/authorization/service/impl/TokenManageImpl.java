package tv.seei.manage.authorization.service.impl;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import tv.seei.manage.authorization.entity.TokenModel;
import tv.seei.manage.authorization.service.TokenManage;
import tv.seei.manage.common.constants.ManageConstant;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class TokenManageImpl implements TokenManage {

    private RedisTemplate<Long, String> redis;

    @Override
    public TokenModel createToken(long userId) {

        //使用uuid作为源token
        String token = UUID.randomUUID().toString().replace("-", "");
        TokenModel model = new TokenModel(userId, token);
        //存储到redis并设置过期时间
        redis.boundValueOps(userId).set(token, ManageConstant.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return model;
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
