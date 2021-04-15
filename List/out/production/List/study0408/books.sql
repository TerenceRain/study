create table books(name varchar(30), author varchar(30), price decimal(5, 2), type varchar(30));

insert into books values ('百年孤独', '马尔克斯', 30.0, '小说');
insert into books values ('骆驼祥子', '老舍', 50.0, '小说');
insert into books values ('我与地坛', '史铁生', 80.0, '散文');
insert into books values ('乡愁', '余光中', 60.0, '诗歌');

create table teachers(name varchar(30),
age int,
height decimal(4,1),
weight decimal(4,1),
sex varchar(30),
degree varchar(30),
birthday timestamp ,
card_Id varchar(30));
insert into teachers values ('张老师', 30, 165.5, 70.0, '女', '博士', 19880702, '12456789455'),
insert into teachers values ('王老师', 35, 175.5, 70.0, '男', '硕士', 19900115, '12645754113');
insert into teachers values ('薛老师', 45, 186.3, 70.0, '男', '学士', 19950622, '48978786165');
insert into teachers values ('周老师', 32, 165.7, 70.0, '女', '硕士', 19940501, '15479656564');


create table goods(
name varchar(30),
 price decimal,
 nums int,
 express varchar(30));

insert into  goods values ('旺旺碎冰冰', 1.0, 50, '冷饮');
insert into  goods values ('卫龙', 2.0, 50, '辣条');
insert into  goods values ('拖把', 15.5, 30, '日用品');
insert into  goods values ('眼影盘', 80.0, 50, '化妆品');



insert into books values ('Java核心技术', 'Cay S. Horstman', 56.43, '计算机技术');