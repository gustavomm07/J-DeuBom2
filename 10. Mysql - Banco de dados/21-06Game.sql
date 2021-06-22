CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;
CREATE TABLE tb_classe(
idclasse int auto_increment,
classe varchar(255) not null, 
equipamentos varchar(255) not null,
atributo varchar(255) not null,

primary key(idclasse)
);
CREATE TABLE tb_personagem(
idpersonagem bigint auto_increment primary key,
nomepersonagem varchar(255) not null, 
altura decimal(10,2),
peso decimal(10,2),
ataque int,
defesa int,
fk_classe int not null,
foreign key (fk_classe) references tb_classe (idclasse)
);

insert into tb_classe (classe, equipamentos, atributo)
values ("bruxo", "livro", "inteligencia");

insert into tb_classe (classe, equipamentos, atributo)
values ("Feiticeira", "livro", "inteligencia");

insert into tb_classe (classe, equipamentos, atributo)
values ("Guerreiro", "Espada", "Força");

insert into tb_classe (classe, equipamentos, atributo)
values ("Gatuno", "Lamina", "Agilidade");

insert into tb_classe (classe, equipamentos, atributo)
values ("Curandeiro", "Poção", "Constituição");

Select * from tb_classe;

insert into tb_personagem (nomepersonagem, altura, peso, ataque, defesa,fk_classe)
values ("A",1.73, 50, 2500,3000,1);
insert into tb_personagem (nomepersonagem, altura, peso, ataque, defesa,fk_classe)
values ("B",1.60, 50, 1000,2000,2);
insert into tb_personagem (nomepersonagem, altura, peso, ataque, defesa,fk_classe)
values ("C",1.70, 50, 500,500,2);
insert into tb_personagem (nomepersonagem, altura, peso, ataque, defesa,fk_classe)
values ("D",1.73, 50, 1000,1000,1);
insert into tb_personagem (nomepersonagem, altura, peso, ataque, defesa,fk_classe)
values ("E",1.73, 50, 2000,3000,2);
insert into tb_personagem (nomepersonagem, altura, peso, ataque, defesa,fk_classe)
values ("F",1.50, 50, 1000,1000,3);
insert into tb_personagem (nomepersonagem, altura, peso, ataque, defesa,fk_classe)
values ("G",1.72, 50, 2500,2000,4);
insert into tb_personagem (nomepersonagem, altura, peso, ataque, defesa,fk_classe)
values ("H",1.73, 50, 2500,3000,5);

select*from tb_personagem where ataque > 2000;

SELECT* from tb_personagem
inner join tb_classe on tb_classe.idclasse = tb_personagem.fk_classe
where tb_personagem.nomepersonagem Like "%C%" and tb_personagem.defesa > 1000 and tb_personagem.defesa < 2000;

SELECT* from tb_personagem
inner join tb_classe on tb_classe.idclasse = tb_personagem.fk_classe
where tb_classe.classe Like "%Feiticeira%";



