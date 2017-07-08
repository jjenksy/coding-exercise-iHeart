--
--    import.sql is used to drop any existing tables and create new tables in database
-- so we can have our mapper interface with the table
--

drop table if exists advertiser;

create table advertiser (id int primary key auto_increment, name varchar, contactName varchar,  creditLimit int);

insert into advertiser (name, address, creditLimit) values ('John', 'Foo bar', 800);