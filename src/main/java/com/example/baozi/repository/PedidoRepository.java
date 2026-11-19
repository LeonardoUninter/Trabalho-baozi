package com.example.baozi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.baozi.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
