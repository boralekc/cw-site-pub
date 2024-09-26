
	INSERT INTO swsite.Site(st_id, st_name, st_url, st_description, st_createdate, st_editdate, st_active) VALUES (DEFAULT, 'Курс по регулярным выражениям', 'http://courseway.ru/', 'Курс по регулярным выражениям', '2023-10-01 13:22:41', '2023-10-01 13:22:41', true);
	
	INSERT INTO swsite.Technology(t_id, t_name, t_description, t_slug, t_order, t_createdate, t_editdate, t_active, s_st_id) VALUES (DEFAULT, 'Регулярные выражения', 'Регулярные выражения', 'regex', '1', '2023-10-01 13:22:41', '2023-10-01 13:22:41', true, 1);

	INSERT INTO swsite.Section(s_id, s_name, s_slug, s_description, s_order, s_createdate, s_editdate, s_active, s_t_id, s_s_id) VALUES (DEFAULT, 'Справочник', 'guide', 'Справочник регулярных выражений', '1', '2023-10-01 13:22:41', '2023-10-01 13:22:41', true, 1, null);

	INSERT INTO swsite.Article(a_id, a_name, a_description, a_slug, a_order, a_createdate, a_editdate, a_active, a_s_id) VALUES (DEFAULT, 'Регулярные выражения', 'Что такое регулярные выражения?', 'regex', 1, '2023-10-01 13:22:41', '2023-10-01 13:22:41', true, 1);
	
	INSERT INTO swsite.ElementType(et_type, et_name, et_description, et_createdate, et_editdate, et_active) VALUES (DEFAULT, 'HTML', 'HTML', '2023-10-01 13:22:41', '2023-10-01 13:22:41', true);

	INSERT INTO swsite.Element(e_id, e_content, e_order, e_createdate, e_editdate, e_active, e_a_id, e_et_type) VALUES (DEFAULT, '{"html": "HTML"}', 1, '2023-10-01 13:22:41', '2023-10-01 13:22:41', true, 1, 1);