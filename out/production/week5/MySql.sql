#1
CREATE TABLE cqupt_student(
studentid VARCHAR(10),
NAME	VARCHAR(20),
sex 	VARCHAR(2),
age	INT,
Fee	DECIMAL(10,2),
address VARCHAR(50),
memo    VARCHAR(300)
);
#2
CREATE TABLE CourseAa(
Aa1 VARCHAR(20),
Aa2 INTEGER,
Aa3 DECIMAL(10)
);
#3
CREATE TABLE ChooseBe(
Bb1 VARCHAR(30),
Bb2 INTEGER,
Bb3 DECIMAL(6)
);
#4
ALTER TABLE ChooseBe ADD Bb4 VARCHAR(20) NOT NULL DEFAULT'系统测试值';
#5
ALTER TABLE ChooseBe ADD Bb5 VARCHAR(10) PRIMARY KEY;
#6
CREATE VIEW Choosebb (View_bb1，View_bb2，view_bb3) AS
SELECT (Bb1,Bb4,Bb5) FROM ChooseBb;
#7
DROP VIEW Choosebb;
#8
CREATE INDEX index_bb2
ON ChooseBb(Bb2) ;
CREATE INDEX index_bb4
ON ChooseBb(Bb4 DESC) ;
#9
DROP INDEX index_bb2 ON ChooseBb;
#10
CREATE TABLE test(
NAME VARCHAR(20),
Age  INTEGER,
Score NUMERIC(10,2),
Address VARCHAR(60)
);
#11
INSERT INTO test SET NAME='赵一' ,age=20, Score=580.00,Address='重邮宿舍 12-3-5';
INSERT INTO test SET NAME='赵二' ,age=19, Score=540.00,Address='南福苑 5-2-9';
INSERT INTO test SET NAME='孙三' ,age=21, Score=555.50,Address='学生新区 21-5-15';
INSERT INTO test SET NAME='李四' ,age=22, Score=505.00,Address='重邮宿舍 8-9-22';
INSERT INTO test SET NAME='周五' ,age=20, Score=495.50,Address='学生新区 23-4-8';
INSERT INTO test SET NAME='吴六' ,age=19, Score=435.00,Address='南福苑 2-5-12';
#12
CREATE TABLE test_temp (
NAME VARCHAR(20),
Age INTEGER,
Score NUMERIC(10,2),
Address VARCHAR(60)
);
#13
INSERT INTO test_temp (NAME,Age,Score,Address) VALUES
('郑七',21 ,490.50 ,'重邮宿舍 11-2-1'),
('张八',20 ,560.00 ,'南福苑 3-3-3'),
('王九',10 ,515.00 ,'学生新区 19-7-1');
#14
INSERT INTO test SELECT * FROM test_temp;
#15
UPDATE test SET Score=Score+5 WHERE age<=20;
#16
UPDATE test SET age=age-1 WHERE Address LIKE '%南福苑%';
#17
DELETE FROM test WHERE age>21 AND Score>=500;
#18
DELETE FROM test WHERE score<550 AND address LIKE '%重邮宿舍%';
#19
CREATE TABLE Student (
SNO VARCHAR(20),
NAME VARCHAR(10),
Age INTEGER,
college VARCHAR(30)
);
#20
CREATE TABLE Course(
CourseID VARCHAR(15),
CourseName VARCHAR(30),
CourseBeforeID VARCHAR(15)
);
#21
CREATE TABLE Choose(
SNO VARCHAR(20),
CourseID VARCHAR((30),
Score DECIMAL(5,2)
);
#22
INSERT INTO Student(SNO,NAME,Age,College) VALUES
('S00001','张三',20,'计算机学院'),
('S00002','李四',19,'通信学院'),
('S00003','王五',21,'计算机学院')
;
#23
INSERT Course(CourseID,CourseName,CourseBeforeID) VALUES
('C1','计算机导论',NULL),
('C2','C语言','C1'),
('C3','数据结构','C2');
#24
INSERT Choose(SNO,CourseID,Score) VALUES
('S00001','C1',95),
('S00001','C2',80),
('S00001','C3',84),
('S00002','C1',80),
('S00002','C2',85),
('S00003','C1',78),
('S00003','C3',70);

#25
SELECT SNO,NAME FROM Student;
#26
SELECT * FROM Student WHERE age BETWEEN 20 AND 23;
#27
SELECT COUNT(*) FROM Student;
#28
SELECT MAX(C1),MIN(C1),SUM(C1),AVG(C1) FROM Choose;
#29
SELECT CourseID,CourseName FROM Course WHERE CourseBeforeID IS NULL;
#30
SELECT
	Student.`SNO`,Student.`Name`,Course.`CourseName`,Choose.`Score`
FROM
	Student JOIN Choose,Course
WHERE
	Student.`SNO`=Choose.`SNO` AND Course.`CourseID`=Choose.`CourseID`
;
#31
SELECT * FROM Student WHERE Student.`college`='计算机学院'
AND  EXISTS(SELECT * FROM Student WHERE college='计算机学院')
AND NAME <> '张三';
#32
SELECT SNO,Score FROM Choose WHERE
Score <(SELECT score FROM Choose WHERE SNO='S00001' AND CourseID='C1')
AND CourseID='C1';
#33
SELECT SNO FROM Choose WHERE CourseID='C1'
UNION
SELECT SNO FROM Choose WHERE CourseID='C3';
#34
SELECT DISTINCT SNO FROM choose WHERE CourseID='C1' OR CourseID='C3';