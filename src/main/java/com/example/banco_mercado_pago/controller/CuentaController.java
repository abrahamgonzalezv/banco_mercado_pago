package com.example.banco_mercado_pago.controller;


import com.example.banco_mercado_pago.model.CuentaBancaria;
import com.example.banco_mercado_pago.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banco/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    public List<CuentaBancaria> listarCuentas() {
        return cuentaService.obtenerTodasLasCuentas();
    }

    @PostMapping
    public CuentaBancaria registrarCuenta(@RequestBody CuentaBancaria cuenta) {
        return cuentaService.crearCuenta(cuenta);
    }

    @GetMapping("/filtrar-saldo")
    public List<CuentaBancaria> filtrarPorSaldo(@RequestParam Double min) {
        return cuentaService.filtrarCuentasConSaldoMayorA(min);
    }
}