create database if not exists `hb_student_tracker`;
use `hb_student_tracker`;

drop table if exists `student`;
create table `student`(
	`id` int(11) not null auto_increment,
    `first_name` varchar(45) default null,
    `last_name` varchar(45) default null,
    `email` varchar(45) default null,
    primary key(`id`)
    )engine= InnoDB auto_increment=6 default charset=latin1;