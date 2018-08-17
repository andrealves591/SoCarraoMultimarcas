create database revenda;
use revenda;
CREATE TABLE veiculo(
    idveiculo bigint auto_increment,
    nome varchar(100) not null,
    marca varchar(20) not null,
    ano int not null,
    modelo int not null,
    valorcusto double not null,
    cor varchar(20) not null,
    combustivel varchar(10) not null,
    portas char(1) not null,
    arcondicionado char(15),
    direcaohidraulica char(18),
    airbag char(6),    
    primary key(idveiculo)
);

CREATE TABLE endereco(
    idendereco bigint auto_increment,
    rua varchar(100) not null,
    numero int not null,
    bairro varchar(80) not null,
    cidade varchar(50) not null,
    estado varchar(5) not null,
    primary key(idendereco)
);

CREATE TABLE cliente(
    idcliente bigint auto_increment,
    nome varchar(100) not null,
    cpf bigint not null,
    sexo varchar(9) not null,
    idade tinyint not null,
    idendereco bigint not null,
    primary key(idcliente),
    foreign key(idendereco) references endereco(idendereco)
    ON DELETE CASCADE
);

CREATE TABLE usuario(
    idusuario bigint auto_increment,
    login varchar(50) not null,
    senha varchar(50) not null,
    primary key(idusuario));

INSERT INTO usuario (idusuario, login, senha)
VALUES (null,'root','root'),
(null,'admin','admin');

INSERT INTO veiculo (idveiculo, nome, marca, ano, modelo, valorcusto, cor, combustivel, portas, arcondicionado, direcaohidraulica,airbag)
VALUES (null, "Palio", "Fiat", 2003, 2004, 15900, "Bege", "Gasolina", "2", "Não", "Sim", "Não"),
(null, "Uno Mille", "Fiat", 2006, 2007, 17900, "Vinho", "Flex", "4", "Sim", "Sim", "Não"),
(null, "Onix", "Cheverolet", 2016, 2017, 33000, "Branco", "Gasolina", "4", "Sim", "Sim", "Sim"),
(null, "Fusca", "Volksvagen", 1993, 1994, 4500, "Vermelho", "Etanol", "2", "Não", "Não", "Não"),
(null, "Veloster", "Hyundai", 2017, 2018, 45600, "Prata", "Flex", "3", "Sim", "Sim", "Sim");

INSERT INTO endereco (idendereco, rua, numero, bairro, cidade, estado)
values (1, "R. Simões Lopes", 91, "Morada do Vale II", "Gravataí", "RS"),
(2, "R. Edu Chaves", 107, "Morada do Vale II", "Gravataí", "RS"),
(3, "R. Albino Nunez Ayala", 100, "Morada do Bosque", "Cachoeirinha", "RS"),
(4, "ERS-118", 1500, "Neópolis", "Gravataí", "RS"),
(5, "AV dos Estados", 526, "Bom Sucesso", "Viamão", "SC");

INSERT INTO cliente (idcliente, nome, cpf, sexo, idade, idendereco)
values (1, "André Alves", 99999999999, "Masculino", 18, 1),
(2, "Matheus Araujo", 8888888888, "Outros", 17, 2),
(3, "Eduardo Gautier", 77777777777, "Masculino", 21, 3),
(4, "Tiffany", 66666666666, "Feminino", 23, 4),
(5, "Thiago Cury", 12345678910, "Outros", 42, 5);