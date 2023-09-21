INSERT INTO
	school_mst (
		school_code,
		school_name,
		create_date,
		update_date
		)
VALUES
		(0,
		"부산대학교",
		NOW(),
		NOW()
		),
		(0,
		"부경대학교",
		NOW(),
		NOW()
		),
		(0,
		"동아대학교",
		NOW(),
		NOW()
		),
		(0,
		"경성대학교",
		NOW(),
		NOW()
		),
		(0,
		"동명대학교",
		NOW(),
		NOW()
		),
		(0,
		"동서대학교",
		NOW(),
		NOW()
		),
		(0,
		"동의대학교",
		NOW(),
		NOW()
		),
		(0,
		"부산외국어대학교",
		NOW(),
		NOW()
		);
		
SELECT
	school_code,
	school_name,
	create_date,
	update_date
FROM
	school_mst
WHERE
	school_name = "부산대학교"
	AND
	school_code = 2;
	
SELECT
	school_code,
	school_name,
	create_date,
	update_date
FROM
	school_mst
WHERE
	school_name = "부산대학교"
	OR
	school_code = 2;
	
SELECT
	school_code,
	school_name,
	create_date,
	update_date
FROM
	school_mst
WHERE
	school_name = "부산대학교"
	OR
	school_code = 2
ORDER BY
	school_code desc;
	
# desc 내림차순 asc 오름차순
# select 동작순서
# from - where - select - order by 순으로 쿼리 동작