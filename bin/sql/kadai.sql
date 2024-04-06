-- （1）kadaidb データベースを作成するSQL文
CREATE DATABASE kadaidb CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;

-- （2）person テーブルを作成するSQL文
CREATE TABLE person (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name VARCHAR(50),
    age INT(11)
);

-- （3）データを1件保存するSQL文
INSERT INTO person (name, age) VALUES ("飯塚翔太", 26);