package com.farmacia.Farmacia.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public long id;
@NotNull
@Size(min = 5)
public String nomecategoria;

public String descricao;
@ManyToOne
@JsonIgnoreProperties("categoria")
public Produto produto;
public String getNomecategoria() {
	return nomecategoria;
}
public void setNomecategoria(String nomecategoria) {
	this.nomecategoria = nomecategoria;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}

}
