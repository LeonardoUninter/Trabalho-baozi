package com.example.baozi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.baozi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
