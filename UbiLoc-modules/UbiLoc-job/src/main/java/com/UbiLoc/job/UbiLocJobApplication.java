package com.UbiLoc.job;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.UbiLoc.common.security.annotation.EnableCustomConfig;
import com.UbiLoc.common.security.annotation.EnableRyFeignClients;
import com.UbiLoc.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 *
 * @author UbiLoc
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class UbiLocJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UbiLocJobApplication.class, args);
        System.out.println ("      (♥◠‿◠)ﾉﾞ              定时任务模块启动成功               ლ(´ڡ`ლ)ﾞ  \n" +
                "        ___           ___                       ___       ___           ___     \n" +
                "       /\\__\\         /\\  \\          ___        /\\__\\     /\\  \\         /\\  \\    \n" +
                "      /:/  /        /::\\  \\        /\\  \\      /:/  /    /::\\  \\       /::\\  \\   \n" +
                "     /:/  /        /:/\\:\\  \\       \\:\\  \\    /:/  /    /:/\\:\\  \\     /:/\\:\\  \\  \n" +
                "    /:/  /  ___   /::\\~\\:\\__\\      /::\\__\\  /:/  /    /:/  \\:\\  \\   /:/  \\:\\  \\ \n" +
                "   /:/__/  /\\__\\ /:/\\:\\ \\:|__|  __/:/\\/__/ /:/__/    /:/__/ \\:\\__\\ /:/__/ \\:\\__\\\n" +
                "   \\:\\  \\ /:/  / \\:\\~\\:\\/:/  / /\\/:/  /    \\:\\  \\    \\:\\  \\ /:/  / \\:\\  \\  \\/__/\n" +
                "    \\:\\  /:/  /   \\:\\ \\::/  /  \\::/__/      \\:\\  \\    \\:\\  /:/  /   \\:\\  \\      \n" +
                "     \\:\\/:/  /     \\:\\/:/  /    \\:\\__\\       \\:\\  \\    \\:\\/:/  /     \\:\\  \\     \n" +
                "      \\::/  /       \\::/__/      \\/__/        \\:\\__\\    \\::/  /       \\:\\__\\    \n" +
                "       \\/__/         ~~                        \\/__/     \\/__/         \\/__/    ");
    }
}
