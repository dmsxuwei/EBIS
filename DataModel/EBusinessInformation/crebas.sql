/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/5/17 0:06:44                            */
/*==============================================================*/


drop table if exists a_role;

drop table if exists a_role_resources;

drop table if exists a_user;

drop table if exists a_user_role;

drop table if exists advertising;

drop table if exists community;

drop table if exists merchant;

drop table if exists monitor;

drop table if exists resources;

/*==============================================================*/
/* Table: a_role                                                */
/*==============================================================*/
create table a_role
(
   roleid               varchar(50) not null,
   rolename             varchar(50),
   primary key (roleid)
);

alter table a_role comment '角色表';

/*==============================================================*/
/* Table: a_role_resources                                      */
/*==============================================================*/
create table a_role_resources
(
   roleresourceid       varchar(50) not null,
   roleid               varchar(50),
   resourceid           varchar(32),
   primary key (roleresourceid)
);

alter table a_role_resources comment '角色资源表';

/*==============================================================*/
/* Table: a_user                                                */
/*==============================================================*/
create table a_user
(
   userid               varchar(50) not null,
   username             varchar(50),
   password             varchar(50),
   gender               varchar(1),
   name                 varchar(20),
   phone                varchar(15),
   email                varchar(50),
   QQ                   varchar(15),
   wechat               varchar(15),
   primary key (userid)
);

alter table a_user comment '用户表';

/*==============================================================*/
/* Table: a_user_role                                           */
/*==============================================================*/
create table a_user_role
(
   userroleid           varchar(50) not null,
   userid               varchar(50),
   roleid               varchar(50),
   primary key (userroleid)
);

alter table a_user_role comment '用户角色表';

/*==============================================================*/
/* Table: advertising                                           */
/*==============================================================*/
create table advertising
(
   advertisingid        varchar(32) not null,
   companyid            varchar(32),
   image                varchar(100),
   location             varchar(100),
   rank                 int default 0,
   createtime           datetime,
   policy               varchar(255),
   culture              varchar(255),
   price                varchar(255),
   primary key (advertisingid)
);

alter table advertising comment 'advertising';

/*==============================================================*/
/* Table: community                                             */
/*==============================================================*/
create table community
(
   communityid          varchar(32) not null,
   companyid            varchar(32),
   image                varchar(100),
   policy               varchar(255),
   rank                 int default 0,
   createtime           datetime,
   primary key (communityid)
);

alter table community comment '社区表';

/*==============================================================*/
/* Table: merchant                                              */
/*==============================================================*/
create table merchant
(
   merchantid           varchar(32) not null,
   merchantname         varchar(50),
   type                 varchar(20) comment '淘宝，京东',
   image                varchar(100),
   tel                  varchar(20),
   createtime           datetime,
   url                  varchar(100),
   ishome               varchar(10),
   rank                 int,
   advertising          varchar(50),
   servertype           varchar(50) comment '流量优化，爆款打造',
   price                int,
   qualification        varchar(255),
   popularity           int,
   reputation           int,
   policy               varchar(255),
   culture              varchar(255),
   primary key (merchantid)
);

alter table merchant comment '商家信息表';

/*==============================================================*/
/* Table: monitor                                               */
/*==============================================================*/
create table monitor
(
   monitorid            varchar(32) not null,
   userid               varchar(50),
   eventtype            varchar(10),
   ipadress             varchar(32),
   isregister           varchar(10),
   eventtime            datetime,
   primary key (monitorid)
);

alter table monitor comment 'monitor';

/*==============================================================*/
/* Table: resources                                             */
/*==============================================================*/
create table resources
(
   resourceid           varchar(32) not null,
   resourcename         varchar(32),
   addr                 varchar(32),
   parentid             varchar(32),
   isend                int,
   catagory             int,
   state                varchar(32),
   iconCls              varchar(32),
   sort                 int,
   primary key (resourceid)
);

alter table resources comment 'resources';

alter table a_role_resources add constraint FK_Reference_3 foreign key (roleid)
      references a_role (roleid) on delete restrict on update restrict;

alter table a_role_resources add constraint FK_Reference_4 foreign key (resourceid)
      references resources (resourceid) on delete restrict on update restrict;

alter table a_user_role add constraint FK_Reference_1 foreign key (userid)
      references a_user (userid) on delete restrict on update restrict;

alter table a_user_role add constraint FK_Reference_2 foreign key (roleid)
      references a_role (roleid) on delete restrict on update restrict;

alter table advertising add constraint FK_Reference_6 foreign key (companyid)
      references merchant (merchantid) on delete restrict on update restrict;

alter table monitor add constraint FK_Reference_5 foreign key (userid)
      references a_user (userid) on delete restrict on update restrict;

