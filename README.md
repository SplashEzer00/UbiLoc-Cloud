## 平台简介

若依是一套全部开源的快速开发平台，毫无保留给个人及企业免费使用。

* 采用前后端分离的模式，微服务版本前端(基于 [RuoYi-Vue](https://gitee.com/y_project/RuoYi-Vue))。
* 后端采用Spring Boot、Spring Cloud & Alibaba。
* 注册中心、配置中心选型Nacos，权限认证使用Redis。
* 流量控制框架选型Sentinel。

## 运行
* 基本配置：mysql，redis，nodejs，nacos

* 启动redis（eg：F:\redis\redis-server.exe redis.windows.conf）
* 启动nacos：配置完双击startup.cmd
* 运行后端基本：Gateway、System、Auth Application，其余可根据自行需求选择
* 运行前端ui：npm run dev（首次需安装：npm install）

* 账号密码：
    超级管理员：admin/admin123
    普通用户：user/123456

参考教程：https://blog.csdn.net/m0_64210833/article/details/126683097?ops_request_misc=&request_id=&biz_id=102&utm_term=ruoyi-cloud&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-1-126683097.142^v76^insert_down38,201^v4^add_ask,239^v2^insert_chatgpt&spm=1018.2226.3001.4187

## 系统模块

~~~
com.UbiLoc     
├── UbiLoc-ui              // 前端框架 [80]
├── UbiLoc-gateway         // 网关模块 [8080]
├── UbiLoc-auth            // 认证中心 [9200]
├── UbiLoc-api             // 接口模块
│       └── UbiLoc-api-system                          // 系统接口
├── UbiLoc-common          // 通用模块
│       └── UbiLoc-common-core                         // 核心模块
│       └── UbiLoc-common-datascope                    // 权限范围
│       └── UbiLoc-common-log                          // 日志记录
│       └── UbiLoc-common-redis                        // 缓存服务
│       └── UbiLoc-common-security                     // 安全模块
│       └── UbiLoc-common-swagger                      // 系统接口
├── UbiLoc-modules         // 业务模块
│       └── UbiLoc-system                              // 系统模块 [9201]
│       └── UbiLoc-gen                                 // 代码生成 [9202]
│       └── UbiLoc-job                                 // 定时任务 [9203]
│       └── UbiLoc-file                                // 文件服务 [9300]
├── UbiLoc-visual          // 图形化管理模块
│       └── UbiLoc-visual-monitor                      // 监控中心 [9100]
├──pom.xml                // 公共依赖
~~~

## 架构图

<img src="https://oscimg.oschina.net/oscnet/up-63c1c1dd2dc2b91d498164d9ee33682a32a.png"/>

## 内置功能

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 在线构建器：拖动表单元素生成相应的HTML代码。
17. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 开发参考

- admin/admin123  


演示地址：http://ruoyi.vip  
文档地址：http://doc.ruoyi.vip

## 演示图

<table>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/cd1f90be5f2684f4560c9519c0f2a232ee8.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/1cbcf0e6f257c7d3a063c0e3f2ff989e4b3.jpg"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-8074972883b5ba0622e13246738ebba237a.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-9f88719cdfca9af2e58b352a20e23d43b12.png"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-39bf2584ec3a529b0d5a3b70d15c9b37646.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-4148b24f58660a9dc347761e4cf6162f28f.png"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-b2d62ceb95d2dd9b3fbe157bb70d26001e9.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-d67451d308b7a79ad6819723396f7c3d77a.png"/></td>
    </tr>	 
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/5e8c387724954459291aafd5eb52b456f53.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/644e78da53c2e92a95dfda4f76e6d117c4b.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-8370a0d02977eebf6dbf854c8450293c937.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-49003ed83f60f633e7153609a53a2b644f7.png"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/up-d4fe726319ece268d4746602c39cffc0621.png"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/up-c195234bbcd30be6927f037a6755e6ab69c.png"/></td>
    </tr>
</table>
