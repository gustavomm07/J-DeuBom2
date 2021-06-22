CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;
CREATE TABLE tb_categoria(
idcategora int auto_increment,
tipo varchar(255) not null, 
Esfirra varchar(255) not null,
Bebidas varchar(255) not null,

primary key(idcategora)
);
CREATE TABLE tb_pizza(
idpizza bigint auto_increment primary key,
sabor varchar(255) not null, 
tamanho varchar(255) not null,
preco decimal(10,2),
quantidade int,
bordarecheada varchar(255) not null,
fk_categoria int not null,
foreign key (fk_categoria) references tb_categoria (idcategora)
);

insert into tb_categoria (tipo, bebidas, esfirra)
values ("doce","","");
insert into tb_categoria (tipo, bebidas, esfirra)
values ("salgada","coca-cola","");
insert into tb_categoria (tipo, bebidas, esfirra)
values ("Esfirra","coca-cola","");
insert into tb_categoria (tipo, bebidas, esfirra)
values ("tradicionais","coca-cola","");
insert into tb_categoria (tipo, bebidas, esfirra)
values ("especiais","coca-cola","");


Select * from tb_categoria;

insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Morango e chocolate", "pequena", 15.0, 1, "não", 1);
insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Banana e canela", "média", 30.0, 1, "não", 1);
insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Brócolis, queijo e bacon", "grande", 62.00, 1, "sim", 2);
insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Mussarela", "grande", "30.0", 1, "não", 4);
insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Peperoni", "grande", "40.0", 1, "não", 2);
insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Marguerita", "grande", "45.0", 1, "não", 1);
insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Calabresa", "média", "30.0", 1, "não", 4);
insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Mussarela", "pequena", "25.0", 20, "não", 3);
insert into tb_pizza (sabor, tamanho, preco, quantidade, bordarecheada, fk_categoria)
values ("Pizza da Mama", "grande", "65.0", 1, "não", 5);
select*from tb_personagem where ataque > 2000;

SELECT* from tb_pizza
inner join tb_categoria on tb_categoria.idcategora = tb_pizza.fk_categoria
where tb_pizza.sabor Like "%C%" and tb_pizza.preco > 29  and tb_pizza.preco < 60 ;

SELECT* from tb_pizza
inner join tb_categoria on tb_categoria.idcategora = tb_pizza.fk_categoria
where tb_categoria.tipo Like "%doce%";



