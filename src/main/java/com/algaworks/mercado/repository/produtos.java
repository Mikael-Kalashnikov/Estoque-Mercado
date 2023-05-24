package com.algaworks.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.mercado.model.produto;

public interface produtos extends JpaRepository<produto, Long>{

}
