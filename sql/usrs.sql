-- ----------------------------
-- 1、客户信息表
-- ----------------------------
drop table if exists users_peoples;
create table usrs_peoples (
  user_id           bigint(20)      not null auto_increment    comment '用户ID',
  user_name         varchar(30)     not null                   comment '用户账号',
  nick_name         varchar(30)     not null                   comment '用户昵称',
  email             varchar(50)     default ''                 comment '用户邮箱',
  phonenumber       varchar(11)     default ''                 comment '手机号码',
  sex               char(1)         default '0'                comment '用户性别（0男 1女 2未知）',
  avatar            varchar(100)    default ''                 comment '头像地址',
  password          varchar(100)    default ''                 comment '密码',
  status            char(1)         default '0'                comment '帐号状态（0正常 1停用）',
  vip               char(1)         default '0'                comment '会员（0不是 1是）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  login_ip          varchar(50)     default ''                 comment '最后登录IP',
  login_date        datetime                                   comment '最后登录时间',
  create_time       datetime                                   comment '创建时间',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (user_id)
) engine=innodb auto_increment=100 comment = '客户信息表';

-- ----------------------------
-- 初始化-客户信息表数据
-- ----------------------------
insert into usrs_peoples values(1,  'ez', '伊泽',  'ez@163.com', '15888888888', '0', '', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2', '0', '0', '0', '127.0.0.1', '2018-03-16 11-33-00',  '2018-03-16 11-33-00',  '2018-03-16 11-33-00', '普通用户');
insert into usrs_peoples values(2,  'sh', '水花',  'sh@qq.com',  '15666666666', '1', '', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2', '0', '1', '0', '127.0.0.1', '2018-03-16 11-33-00',  '2018-03-16 11-33-00',  '2018-03-16 11-33-00', '会员用户');

-- ----------------------------
-- 2、客户数据表
-- ----------------------------
drop table if exists usrs_data;
create table usrs_data (
  data_id           bigint(20)      not null auto_increment    comment '数据ID',
  user_id           bigint(30)      not null                   comment '用户ID',
  user_name         varchar(30)     not null                   comment '用户账号',
  nick_name         varchar(30)     not null                   comment '用户昵称',
  data1             varchar(50)     default '0'                comment '数据1',
  data2             varchar(50)     default '0'                comment '数据2',
  data3             varchar(50)     default '0'                comment '数据3',
  data4             varchar(50)     default '0'                comment '数据4',
  data5             varchar(50)     default '0'                comment '数据5',
  data6             varchar(50)     default '0'                comment '数据6',
  status            char(1)         default '0'                comment '数据状态（0正常 1停用）',
  create_time       datetime                                   comment '创建时间',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (data_id)
) engine=innodb auto_increment=100 comment = '客户数据表';

-- ----------------------------
-- 初始化-客户数据表数据
-- ----------------------------
insert into usrs_data values(1,  '1', 'ez', '伊泽',  '132', '53', '0', '523', '35','85', '0', '2023-03-16 11-33-00',  '2023-03-16 11-33-00', '普通用户');
insert into usrs_data values(2,  '2', 'sh', '水花',  '4213',  '1111', '1', '423', '2', '3', '0', '2023-03-16 11-33-00',  '2023-03-16 11-33-00', '会员用户');

-- ----------------------------
-- 3、球星数据表
-- ----------------------------
drop table if exists players_data;
create table players_data (
  player_id         bigint(20)      not null auto_increment    comment '球星ID',
  player_name       varchar(30)     not null                   comment '球星名',
  sex               char(1)         default '0'                comment '球星性别（0男 1女 2未知）',
  avatar            varchar(100)    default ''                 comment '头像地址',
  data1             varchar(50)     default '0'                comment '数据1',
  data2             varchar(50)     default '0'                comment '数据2',
  data3             varchar(50)     default '0'                comment '数据3',
  data4             varchar(50)     default '0'                comment '数据4',
  data5             varchar(50)     default '0'                comment '数据5',
  data6             varchar(50)     default '0'                comment '数据6',
  status            char(1)         default '0'                comment '状态（0正常 1停用）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_time       datetime                                   comment '创建时间',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (user_id)
) engine=innodb auto_increment=100 comment = '球星数据表';
-- ----------------------------
-- 初始化-球星数据表数据
-- ----------------------------
insert into players_data values(1,  '泰格-伍兹', '0', null,  '132', '53', '0', '523', '35','85', '0', '0', '2023-04-16 11-33-00',  '2023-04-16 11-33-00', '泰格·伍兹（Eldrick Tont Woods，1975年12月30日-），绰号“Tiger”、“老虎伍兹”，出生于加利福尼亚塞普雷斯，美国职业高尔夫球运动员。

1996年，泰格·伍兹开始高尔夫球职业生涯，之后多次拿下美国名人赛冠军，他曾入围2019福布斯100名人榜，获得过由美国总统特朗普授予的“总统自由勋章”。2019年12月，泰格·伍兹获ESPN2019年年度最出名运动员。[1]2022年3月10日，泰格·伍兹正式入选高尔夫名人堂。');
insert into players_data values(2,  '亚当-斯科特', '0', null,  '4213',  '1111', '1', '423', '2', '3', '0', '0', '2023-04-16 11-33-00',  '2023-04-16 11-33-00', '亚当·斯科特（Adam Scott，1980年7月16日-），出生于澳大利亚阿德莱德，毕业于内华达州拉斯维加斯大学，澳大利亚职业高尔夫球员。

斯科特拥有英俊的外表，沉稳的气质、全面的技巧和轻松的心态。其于2000年6月正式转为职业球员，2014年5月，斯科特的世界排名上升到第一位，曾获得PGA巡回赛冠军、欧巡赛冠军、澳大利亚PGA锦标赛冠军等奖项。');
