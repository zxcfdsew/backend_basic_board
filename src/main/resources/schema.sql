create table board(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    writer_name VARCHAR(45) NOT NULL
);

create table `user`(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id VARCHAR(45) NOT NULL UNIQUE,
    name VARCHAR(45) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);