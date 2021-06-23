CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;
CREATE TABLE tb_categoria(
id1 int auto_increment,
medicamento varchar(255) not null, 
beleza varchar(255) not null,
Vitaminas varchar(255) not null,
mamaeebb varchar(255) not null,

primary key(id1)
);
CREATE TABLE tb_produto(
id2 bigint auto_increment primary key,
nome varchar(255) not null, 
peso varchar(255) not null,
preco decimal(10,2),
quantidade int,
estrelas int ,
fk_categoria int not null,
foreign key (fk_categoria) references tb_categoria (id1)
);

insert into tb_categoria (medicamento,beleza, Vitaminas, mamaeebb )
values ("Medicamento","","", "");
insert into tb_categoria (medicamento,beleza, Vitaminas, mamaeebb)
values ("Medicamento com receita", "","", "");
insert into tb_categoria (medicamento,beleza, Vitaminas, mamaeebb)
values ("Beleza","", "","");
insert into tb_categoria (medicamento,beleza, Vitaminas, mamaeebb)
values ("Vitaminas","","", "");
insert into tb_categoria (medicamento,beleza, Vitaminas, mamaeebb)
values ("mamaeebb","","", "");


Select * from tb_categoria;

insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Aspirina", "50mg", 20.0, 3, 5, 1);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Especial", "60mg", 80.0, 3, 5, 2);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Protetor solar com base", "80mg", 79.0, 1, 3, 3);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Centrum", "50mg", 50.0, 1, 5, 1);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Shampoo Johnsons baby", "50mg", 20.0, 1, 5, 1);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Aspirina", "50mg", 10.0, 1, 5, 1);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Oleo de rícino", "10ml", 4.5, 3, 5, 1);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Creme hidrante", "50mg", 50.0, 3, 5, 1);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Aspirina", "50mg", 20.0, 3, 5, 1);
insert into tb_produto (nome,peso, preco, quantidade,estrelas,fk_categoria)
values ("Baton", "15mg", 90.0, 1, 3, 1);

select*from tb_personagem where ataque > 50;

SELECT* from  tb_produto
inner join tb_categoria on tb_categoria.id1 =  tb_produto.fk_categoria
where  tb_produto.nome Like "%B%" and  tb_produto.preco > 3  and  tb_produto.preco < 60 ;

SELECT* from  tb_produto
inner join tb_categoria on tb_categoria.id1 =  tb_produto.fk_categoria
where tb_categoria.medicamento Like "%medicamento%";



