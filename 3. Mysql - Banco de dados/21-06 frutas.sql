CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;
CREATE TABLE tb_categoria(
id1 int auto_increment,
Vegetais varchar(255) not null, 
Legumes varchar(255) not null,
Frutas varchar(255) not null,
doces varchar (255) not null,
sementes varchar (255) not null,

primary key(id1)
);
CREATE TABLE tb_produto(
id2 bigint auto_increment primary key,
nome varchar(255) not null, 
peso varchar(255) not null,
preco decimal(10,2),
quantidade int,
tamanho int ,
fk_categoria int not null,
foreign key (fk_categoria) references tb_categoria (id1)
);

insert into tb_categoria (Vegetais, Legumes, Frutas, sementes, doces)
values ("Vegetais", "","","", "");
insert into tb_categoria (Vegetais, Legumes, Frutas, sementes, doces)
values ("","Legumes","","","");
insert into tb_categoria (Vegetais, Legumes, Frutas, sementes, doces)
values ("","","Frutas","","");
insert into tb_categoria (Vegetais, Legumes, Frutas, sementes, doces)
values ("","","", "","doces");
insert into tb_categoria (sementes,doces,Vegetais, Legumes, Frutas)
values ("sementes","","", "","");


Select * from tb_categoria;

insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("Maçã", "200g", 20.0, 3, 5, 3);
insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("Banana", "500g", 20.0, 12, 10, 3);
insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("Pera", "50g", 5.0, 3, 5, 3);
insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("figo em conserva", "500g", 65.0, 3, 4, 4);
insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("Brócolis", "500mg", 20.0, 1, 5, 1);
insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("Rosas", "50mg", 5.0, 3, 1, 5);
insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("Alface", "100g", 8.0, 2, 2, 1);
insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("Uva", "1kg", 30.0, 1, 1, 3);
insert into tb_produto (nome,peso, preco, quantidade,tamanho,fk_categoria)
values ("Limão", "80g", 8.0, 3, 5, 3);

select*from tb_produto where preco > 50;

SELECT* from  tb_produto
inner join tb_categoria on tb_categoria.id1 =  tb_produto.fk_categoria
where  tb_produto.nome Like "%C%" and  tb_produto.preco > 3  and  tb_produto.preco < 60 ;

SELECT* from  tb_produto
inner join tb_categoria on tb_categoria.id1 =  tb_produto.fk_categoria
where tb_categoria.Frutas Like "%C%";



