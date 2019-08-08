CREATE TABLE instituicao(
cnpj varchar(15) PRIMARY KEY,
nome_instituicao varchar(200) NOT NULL)

CREATE TABLE curso(
id_curso int IDENTITY(1,1) PRIMARY KEY,
nome_curso varchar(150) NOT NULL,
cnpj_instituicao varchar(15) 
CONSTRAINT cnpj_instituicao FOREIGN KEY (cnpj_instituicao) REFERENCES instituicao (cnpj))

CREATE TABLE materia(
id_materia int IDENTITY(1,1) PRIMARY KEY,
nome_materia varchar(150) NOT NULL,
id_curso int 
CONSTRAINT id_curso FOREIGN KEY (id_curso) REFERENCES curso (id_curso))

CREATE TABLE tipo_usuario(
id_tipoUusario int PRIMARY KEY,
nome_tipoUusario varchar(25))


CREATE TABLE usuario(
id_usuario int IDENTITY(1,1) PRIMARY KEY,
nome_usuario varchar(150) NOT NULL,
id_tipoUsuario int
CONSTRAINT id_tipoUusario FOREIGN KEY (id_tipoUsuario) REFERENCES tipo_usuario (id_tipoUusario),
id_cursoUsuario int
CONSTRAINT id_cursoUsuario FOREIGN KEY (id_cursoUsuario) REFERENCES curso (id_curso) 
)

CREATE TABLE questoes(
id_questoes int IDENTITY(1,1) PRIMARY KEY,
questao text,
resposta nchar(5),
usuario_id int
CONSTRAINT usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario (id_usuario),
id_tipo int
CONSTRAINT id_tipo FOREIGN KEY (id_tipo) REFERENCES tipo_usuario (id_tipoUusario))
