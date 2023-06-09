## 平台简介
* 采用前后端分离的模式，微服务版本前端(基于 [RuoYi-Vue](https://gitee.com/y_project/RuoYi-Vue))。
* 后端采用Spring Boot、Spring Cloud & Alibaba。
* 注册中心、配置中心选型Nacos，权限认证使用Redis。

## 运行
* 基本配置：mysql，redis，nodejs，nacos

* 启动redis（eg：F:\redis\redis-server.exe redis.windows.conf）
* 启动nacos：配置完双击startup.cmd
* 运行后端基本：Gateway、System、Auth Application运行才能正常运行管理系统
* 运行前端ui：npm run dev（首次需安装：npm install）

* 账号密码：
    超级管理员：admin/admin123
    普通用户：user/123456

参考教程：https://blog.csdn.net/m0_64210833/article/details/126683097?ops_request_misc=&request_id=&biz_id=102&utm_term=ruoyi-cloud&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-1-126683097.142^v76^insert_down38,201^v4^add_ask,239^v2^insert_chatgpt&spm=1018.2226.3001.4187

## 系统模块

~~~
com.MotCap     
├── MotCap-ui              // 前端框架 [80]
├── MotCap-gateway         // 网关模块 [8080]
├── MotCap-auth            // 认证中心 [9200]
├── MotCap-api             // 接口模块
│       └── MotCap-api-system                          // 系统接口
├── MotCap-common          // 通用模块
│       └── MotCap-common-core                         // 核心模块
│       └── MotCap-common-datascope                    // 权限范围
│       └── MotCap-common-log                          // 日志记录
│       └── MotCap-common-redis                        // 缓存服务
│       └── MotCap-common-security                     // 安全模块
│       └── MotCap-common-swagger                      // 系统接口
├── MotCap-modules         // 业务模块
│       └── MotCap-system                              // 系统模块 [9201]
│       └── MotCap-gen                                 // 代码生成 [9202]
├── MotCap-visual          // 图形化管理模块
│       └── MotCap-visual-monitor                      // 监控中心 [9100]
├──pom.xml                // 公共依赖
~~~

## 架构图

<img src="https://oscimg.oschina.net/oscnet/up-63c1c1dd2dc2b91d498164d9ee33682a32a.png"/>

## 内置功能

1.  数据管理：数据是软件所展示数据，该功能包括客户信息、客户数据存储，以及球星数据存储等。
2.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
3.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
4.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
5.  参数管理：对系统动态配置常用参数。
6.  通知公告：系统通知公告信息发布维护。
7.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
8.  登录日志：系统登录日志记录查询包含登录异常。
9.  在线用户：当前系统中活跃用户状态监控。
10. 系统接口：根据业务代码自动生成相关的api接口文档。
11. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。账号：MotCap 密码：123456
12. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 开发参考

- admin/admin123  


演示地址：http://ruoyi.vip  
文档地址：http://doc.ruoyi.vip

## 演示图

<table>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/cd1f90be5f2684f4560c9519c0f2a232ee8.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-8074972883b5ba0622e13246738ebba237a.png"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-39bf2584ec3a529b0d5a3b70d15c9b37646.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-4148b24f58660a9dc347761e4cf6162f28f.png"/></td>
    </tr>
</table>
