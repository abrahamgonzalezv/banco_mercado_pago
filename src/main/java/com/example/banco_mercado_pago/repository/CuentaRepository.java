package com.example.banco_mercado_pago.repository;



import com.example.banco_mercado_pago.model.CuentaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository<CuentaBancaria, Long> {
    // Métodos CRUD automáticos
}