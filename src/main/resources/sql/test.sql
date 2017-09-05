CREATE TABLE `book` (
  `isbn` bigint(19) NOT NULL COMMENT 'ISBN',
  `title` varchar(128) NOT NULL COMMENT 'タイトル',
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='書籍';

INSERT INTO sastruts_sample.book (isbn, title) VALUES (1, 'test');
INSERT INTO sastruts_sample.book (isbn, title) VALUES (2, 'hoge');
INSERT INTO sastruts_sample.book (isbn, title) VALUES (3, 'fuga');
INSERT INTO sastruts_sample.book (isbn, title) VALUES (4, 'piyo');
