-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户数据', '2000', '1', 'data', 'system/data/index', 1, 0, 'C', '0', '0', 'system:data:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '客户数据菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户数据查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:data:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户数据新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:data:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户数据修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:data:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户数据删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:data:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户数据导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:data:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');