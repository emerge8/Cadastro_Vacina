package com.emersonluiz.cadastroVacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonluiz.cadastroVacina.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
