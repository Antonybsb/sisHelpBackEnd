package com.antony.sishelp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antony.sishelp.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
