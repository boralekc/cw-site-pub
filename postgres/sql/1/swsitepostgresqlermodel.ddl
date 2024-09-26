SET search_path = swsite

CREATE TABLE Technology (t_id SERIAL NOT NULL, t_name varchar(255) NOT NULL UNIQUE, t_description varchar(1000), t_slug varchar(20) NOT NULL UNIQUE, t_order int4 NOT NULL UNIQUE, t_createdate timestamp NOT NULL, t_editdate timestamp NOT NULL, t_active bool DEFAULT 'true' NOT NULL, s_st_id int4 NOT NULL, PRIMARY KEY (t_id));
CREATE TABLE Section (s_id SERIAL NOT NULL, s_name varchar(30) NOT NULL, s_slug varchar(20) NOT NULL, s_description varchar(1000) NOT NULL, s_order int4 NOT NULL, s_createdate timestamp NOT NULL, s_editdate timestamp NOT NULL, s_active bool DEFAULT 'true' NOT NULL, s_t_id int4 NOT NULL, s_s_id int4, PRIMARY KEY (s_id));
CREATE TABLE Article (a_id SERIAL NOT NULL, a_name varchar(255) NOT NULL, a_description varchar(1000), a_slug varchar(20) NOT NULL, a_order int4 NOT NULL, a_createdate timestamp NOT NULL, a_editdate timestamp NOT NULL, a_active bool DEFAULT 'true' NOT NULL, a_s_id int4 NOT NULL, PRIMARY KEY (a_id));
CREATE TABLE Element (e_id SERIAL NOT NULL, e_content jsonb NOT NULL, e_order int4 NOT NULL, e_createdate timestamp NOT NULL, e_editdate timestamp NOT NULL, e_active bool DEFAULT 'true' NOT NULL, e_a_id int4 NOT NULL, e_et_type int4 NOT NULL, PRIMARY KEY (e_id));
CREATE TABLE ElementType (et_type SERIAL NOT NULL, et_name varchar(100) NOT NULL UNIQUE, et_description varchar(1000), et_createdate timestamp NOT NULL, et_editdate timestamp NOT NULL, et_active bool DEFAULT 'true' NOT NULL, PRIMARY KEY (et_type));
CREATE TABLE Site (st_id SERIAL NOT NULL, st_name varchar(100) NOT NULL UNIQUE, st_url varchar(100) NOT NULL UNIQUE, st_description varchar(1000), st_createdate timestamp NOT NULL, st_editdate timestamp NOT NULL, st_active bool DEFAULT 'true' NOT NULL, PRIMARY KEY (st_id));
CREATE UNIQUE INDEX Technology_t_id ON Technology (t_id);
CREATE UNIQUE INDEX Section_s_id ON Section (s_id);
CREATE UNIQUE INDEX Article_a_id ON Article (a_id);
CREATE UNIQUE INDEX Element_e_id ON Element (e_id);
CREATE UNIQUE INDEX ElementType_et_type ON ElementType (et_type);
CREATE UNIQUE INDEX Site_st_id ON Site (st_id);
ALTER TABLE Section ADD CONSTRAINT FKSection714716 FOREIGN KEY (s_t_id) REFERENCES Technology (t_id);
ALTER TABLE Section ADD CONSTRAINT FKSection984630 FOREIGN KEY (s_s_id) REFERENCES Section (s_id);
ALTER TABLE Article ADD CONSTRAINT FKArticle962423 FOREIGN KEY (a_s_id) REFERENCES Section (s_id);
ALTER TABLE Element ADD CONSTRAINT FKElement628473 FOREIGN KEY (e_a_id) REFERENCES Article (a_id);
ALTER TABLE Element ADD CONSTRAINT FKElement675208 FOREIGN KEY (e_et_type) REFERENCES ElementType (et_type);
ALTER TABLE Technology ADD CONSTRAINT FKTechnology264974 FOREIGN KEY (s_st_id) REFERENCES Site (st_id);
