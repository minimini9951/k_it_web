SELECT
	*
FROM
	student_mst;
	
SELECT
	student_name "이름",
	student_year "학년",
	sm.school_code,
	school_name "대학명",
	major_name "전공"
FROM
	student_mst sm
	LEFT OUTER JOIN school_mst scm ON(sm.school_code = scm.school_code)
	LEFT OUTER JOIN major_mst mm ON(sm.major_code = mm.major_code)
WHERE
	(school_name LIKE '부산%' OR school_name LIKE '부경%')
	AND
	(major_name LIKE '전자%' OR major_name LIKE '화학%' OR major_name LIKE '기계%');
ORDER BY
	student_year
	sm.school_code desc;


