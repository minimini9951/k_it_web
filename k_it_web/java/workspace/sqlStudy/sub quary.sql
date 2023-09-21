SELECT
	school_code
FROM
	school_mst
WHERE
	school_name = '부산대학교';
	
SELECT
	*
FROM
	student_mst
WHERE
	school_code = (SELECT
						school_code
					FROM
						school_mst
					WHERE
						school_name = '부산대학교');
# 서브쿼리는 무조건 소괄호로 감쌀 것

SELECT
	student_code,
	student_name,
	(SELECT
		COUNT(*)
	FROM
		student_mst) AS student_count
FROM
	student_mst
WHERE
	student_name LIKE '홍길%';
	
	
SELECT
	sm.student_name,
	sm.school_code,
	scm.school_name
FROM
	(SELECT
		*
	FROM
		student_mst
	WHERE
		school_code = (SELECT
							school_code
						FROM
							school_mst
						where
							school_name = '부산대학교')) sm
	LEFT OUTER JOIN school_mst scm ON(scm.school_code = sm.school_code);
	
# 공학이 들어있는 전공을 찾고 그 중에서 부산대학교, 부경대학교 학생들의 이름, 학년, 전공명을 출력
# (page - 1) * num = index
SELECT * FROM student_mst LIMIT 4, 2;

UPDATE student_mst SET student_year = 3 WHERE school_code = 1;

UPDATE major_mst SET major_name = '중어중문학과' WHERE major_name = '영어영문학과';

# 홍길동7이 속한 전공을 데이터분석학과로 바꾸기
UPDATE 
	major_mst 
SET 
	major_name = '데이터분석학과' 
WHERE 
	major_code = (
				SELECT 
					student_code 
				FROM 
					student_mst 
				WHERE 
					student_name = '홍길동7');

UPDATE
	student_mst
SET
	student_year = student_year + 1
WHERE
	student_code = 1;
			