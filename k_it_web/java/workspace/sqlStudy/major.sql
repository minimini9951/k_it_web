INSERT INTO
	major_mst (
		major_name,
		create_date,
		update_date
		)
VALUES
		('컴퓨터공학과',
		NOW(),
		NOW()
		),
		('전자공학과',
		NOW(),
		NOW()
		),
		('기계공학과',
		NOW(),
		NOW()
		),
		('화학공학과',
		NOW(),
		NOW()
		),
		('토목공학과',
		NOW(),
		NOW()
		),
		('국어국문학과',
		NOW(),
		NOW()
		),
		('영어영문학과',
		NOW(),
		NOW()
		),
		('유아교육학과',
		NOW(),
		NOW()
		),
		('경영학과',
		NOW(),
		NOW()
		),
		('정치외교학과',
		NOW(),
		NOW()
		);


SELECT
	major_name
FROM
	major_mst
WHERE
	major_name = '토목공학과'
	OR
	major_name = '컴퓨터공학과'
	OR
	major_name = '기계공학과'
ORDER BY
	major_name desc;
	
SELECT
	major_name
FROM
	major_mst
WHERE
	major_name IN ('토목공학과', '컴퓨터공학과', '기계공학과')
ORDER BY
	major_name desc;
	
SELECT
	*
FROM
	major_mst
WHERE
	# major_name IN ('토목공학과', '컴퓨터공학과', '기계공학과')
	major_name LIKE '%공학%'
ORDER BY
	major_name desc;