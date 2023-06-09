package com.MotCap.gateway.service;

import java.io.IOException;
import com.MotCap.common.core.exception.CaptchaException;
import com.MotCap.common.core.web.domain.AjaxResult;

/**
 * 验证码处理
 *
 * @author Spez
 */
public interface ValidateCodeService
{
    /**
     * 生成验证码
     */
    public AjaxResult createCapcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCapcha(String key, String value) throws CaptchaException;
}
