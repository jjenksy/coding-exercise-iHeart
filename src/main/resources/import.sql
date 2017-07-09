/*
* Engine: H2
* Version: 0.0.1
* Description: Initial DB structure
 */


CREATE TABLE ADVERTISER (
  id int primary key auto_increment,
  name varchar not null,
  contactName varchar not null,
  creditLimit int not null);
