create table T_CUST(
   C_ID VARCHAR(100) NOT NULL PRIMARY KEY COMMENT '主键(自增长)',
   C_CODE VARCHAR(64) NOT NULL UNIQUE COMMENT '客户编码',
   C_CATEGORY VARCHAR(32) NULL COMMENT '客户类别',
   C_STATUS VARCHAR(32) NULL COMMENT '客户状态',
   C_ORIGIN VARCHAR(32) NULL COMMENT '客户来源',
   C_ISVIP CHAR(1) NULL COMMENT '是否VIP',
   C_ISINPOOL CHAR(1) NULL COMMENT '是否掉公',
   C_ISIMPORT CHAR(1) NULL COMMENT '是否导入客',
   C_REMARK VARCHAR(300) NULL COMMENT '备注',
   C_CREATE_USER VARCHAR(32) NOT NULL COMMENT '创建人',
   C_UPDATE_USER VARCHAR(32) NULL COMMENT '更新人',
   C_CREATE_TIME datetime COMMENT '创建时间',
   C_UPDATE_TIME datetime COMMENT '更新时间',
   C_DEL CHAR(1) NOT NULL COMMENT '删除标记 是否删除  Y是 N 否',
   C_VERSION VARCHAR(10)  NULL COMMENT '版本号',
   C_SORT INT NULL COMMENT '排序'
)COMMENT = '客户信息表';

create table T_CUST_HOLDER(
   C_ID VARCHAR(100) NOT NULL PRIMARY KEY COMMENT '主键(自增长)',
   C_CODE VARCHAR(64) NOT NULL UNIQUE COMMENT '客户编码',
   C_AGENTID VARCHAR(64) NULL COMMENT '经纪人',
   C_GROUPID VARCHAR(32) NULL COMMENT '所属店组',
   C_AREAID VARCHAR(32) NULL COMMENT '所属片区',
   C_WARZONEID VARCHAR(32) NULL COMMENT '所属战区',
   C_BIGAREAID VARCHAR(32) NULL COMMENT '所属大区',
   C_POOLLEVEL CHAR(1) NULL COMMENT '共享池层级 0: 非共享池客户， 1 ：店组共享池客户， 2： 片区共享池客户  ，3：战区共享池客户 4：大区共享池客户 ',
   C_ISORICUST CHAR(1) NULL COMMENT '是否原经纪人：Y 是 N 否',
   C_REMARK VARCHAR(300) NULL COMMENT '备注',
   C_CREATE_USER VARCHAR(32) NOT NULL COMMENT '创建人',
   C_UPDATE_USER VARCHAR(32) NULL COMMENT '更新人',
   C_CREATE_TIME datetime COMMENT '创建时间',
   C_UPDATE_TIME datetime COMMENT '更新时间',
   C_DEL CHAR(1) NOT NULL COMMENT '删除标记 是否删除  Y是 N 否',
   C_VERSION VARCHAR(10)  NULL COMMENT '版本号',
   C_SORT INT NULL COMMENT '排序'
)COMMENT = '客户权属表';

create table T_CUST_CONTACT(
   C_ID VARCHAR(100) NOT NULL PRIMARY KEY COMMENT '主键(自增长)',
   C_CODE VARCHAR(64) NOT NULL UNIQUE COMMENT '客户编码',
   C_CONTACT_TYPE VARCHAR(32) NULL COMMENT '联系人类型',
   C_NAME VARCHAR(64) NULL COMMENT '姓名',
   C_TITLE VARCHAR(32) NULL COMMENT '称谓',
   C_TELE VARCHAR(32) NULL COMMENT '固话',
   C_MOBILE VARCHAR(32) NULL COMMENT '手机',
   C_WECHAT VARCHAR(32) NULL COMMENT '微信',
   C_EMAIL VARCHAR(64) NULL COMMENT '电邮',
   C_ADDRESS VARCHAR(64) NULL COMMENT '通讯地址',
   C_ZIPCODE VARCHAR(32) NULL COMMENT '邮政编码',
   C_RESIDENT_ADDRESS VARCHAR(64) NULL COMMENT '户口所在地',
   C_SOURCE_TYPE VARCHAR(32) NULL COMMENT '信息来源',
   C_REMARK VARCHAR(300) NULL COMMENT '备注',
   C_CREATE_USER VARCHAR(32) NOT NULL COMMENT '创建人',
   C_UPDATE_USER VARCHAR(32) NULL COMMENT '更新人',
   C_CREATE_TIME datetime COMMENT '创建时间',
   C_UPDATE_TIME datetime COMMENT '更新时间',
   C_DEL CHAR(1) NOT NULL COMMENT '删除标记 是否删除  Y是 N 否',
   C_VERSION VARCHAR(10)  NULL COMMENT '版本号',
   C_SORT INT NULL COMMENT '排序',
   C_SPELL VARCHAR(32)  NULL COMMENT '拼音码'
)COMMENT = '客户联系人表';