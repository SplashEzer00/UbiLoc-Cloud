package com.UbiLoc.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 监控中心
 *
 * @author UbiLoc
 */
@EnableAdminServer
@SpringCloudApplication
public class UbiLocMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UbiLocMonitorApplication.class, args);
        System.out.println ("      (♥◠‿◠)ﾉﾞ              监控中心启动成功               ლ(´ڡ`ლ)ﾞ  \n" +
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
