-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('球星数据', '2000', '1', 'datas', 'system/datas/index', 1, 0, 'C', '0', '0', 'system:datas:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '球星数据菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('球星数据查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:datas:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('球星数据新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:datas:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('球星数据修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:datas:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('球星数据删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:datas:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('球星数据导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:datas:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');