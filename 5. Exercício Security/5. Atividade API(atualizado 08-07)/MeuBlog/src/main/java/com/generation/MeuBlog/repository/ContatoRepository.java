package com.generation.MeuBlog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.MeuBlog.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
public Contato findFirstByNome(String nome);
public List<Contato> findAllByNomeIgnoreCaseContaining(String nome);
}