package com.antony.sishelp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antony.sishelp.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
