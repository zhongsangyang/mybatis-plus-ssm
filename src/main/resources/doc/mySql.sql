CREATE TABLE user(
  id BIGINT AUTO_INCREMENT,
  name varchar(15),
  age INT,
  sex int COMMENT  '0男1女',
  height int,
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户表';

 CREATE TABLE shop (
  id BIGINT AUTO_INCREMENT,
   des VARCHAR(20) COMMENT '描述',
   price DECIMAL COMMENT '价格',
   shop_start_time DATETIME COMMENT '生产开始时期',
   shop_end_time DATETIME COMMENT '生产结束时期',
   shop_type VARCHAR(10) COMMENT '商品类型',
   PRIMARY KEY (id)
)ENGINE =InnoDB DEFAULT CHARSET=utf8 COMMENT='系统商品表';

insert into shop(des, price, shop_start_time, shop_end_time, shop_type)VALUES ('西瓜','3.5',now() ,now()+20,'水果')
SELECT * from shop;

select * from shop s WHERE s.shop_type='水果';
