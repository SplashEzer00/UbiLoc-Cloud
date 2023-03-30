package com.UbiLoc.system.api.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.UbiLoc.common.core.domain.R;
import com.UbiLoc.system.api.RemoteUserService;
import com.UbiLoc.system.api.model.LoginUser;
import feign.hystrix.FallbackFactory;

/**
 * 用户服务降级处理
 *
 * @author UbiLoc
 */
@Component
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService>
{
    private static final Logger log = LoggerFactory.getLogger(RemoteUserFallbackFactory.class);

    @Override
    public RemoteUserService create(Throwable throwable)
    {
        log.error("用户服务调用失败:{}", throwable.getMessage());
        return new RemoteUserService()
        {
            @Override
            public R<LoginUser> getUserInfo(String username)
            {
                return R.fail("获取用户失败:" + throwable.getMessage());
            }
        };
    }
}
