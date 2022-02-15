

INSERT INTO author (name,email,phone,birth_date) VALUES ('david','@correo.com','962382415','30/01/2020');
INSERT INTO author (name,email,phone,birth_date) VALUES ('juanito','@correo.com','962382415','30/01/2020');
INSERT INTO blog (name,description,url,status,author_id) VALUES ('davidBlog','blog de david','http','activo',1);
INSERT INTO blog (name,description,url,status,author_id) VALUES ('davidBlog2','blog de david3','http','inactivo',1);
INSERT INTO post (title,date,status,content,blog_id) VALUES ('bloddelDia','30/01/2020','borrador/publicado','variedad',1);
INSERT INTO comment (date,name,estado) VALUES ('2020-01-30T11:00','comentario','publicado');