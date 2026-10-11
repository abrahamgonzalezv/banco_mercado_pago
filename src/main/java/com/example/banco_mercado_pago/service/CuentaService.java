package com.example.banco_mercado_pago.service;



import com.example.banco_mercado_pago.model.CuentaBancaria;
import com.example.banco_mercado_pago.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    public List<CuentaBancaria> obtenerTodasLasCuentas() {
        return cuentaRepository.findAll();
    }

    public CuentaBancaria crearCuenta(CuentaBancaria cuenta) {
        return cuentaRepository.save(cuenta);
    }

    // Filtrado usando Java Streams
    public List<CuentaBancaria> filtrarCuentasConSaldoMayorA(Double saldoMinimo) {
        List<CuentaBancaria> cuentas = cuentaRepository.findAll();

        return cuentas.stream()
                .filter(c -> c.getSaldo() > saldoMinimo)
                .collect(Collectors.toList());
    }
}