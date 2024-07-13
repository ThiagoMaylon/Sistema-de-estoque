package com.mercado.Sistema_de_estoque.domain.repository;

import com.mercado.Sistema_de_estoque.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Produto, Long> {
}
