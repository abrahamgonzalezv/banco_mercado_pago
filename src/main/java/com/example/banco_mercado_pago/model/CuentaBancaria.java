package com.example.banco_mercado_pago.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cuentas_bancarias")
@Data
public class CuentaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCuenta;
    private String titular;
    private Double saldo;
    private String tipoMoneda;
}