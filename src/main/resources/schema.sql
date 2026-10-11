CREATE TABLE IF NOT EXISTS cuentas_bancarias (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    numero_cuenta VARCHAR(255),
    titular VARCHAR(255),
    saldo DOUBLE,
    tipo_moneda VARCHAR(50)
);

INSERT INTO cuentas_bancarias (id,numero_cuenta, titular, saldo, tipo_moneda) VALUES 
('1234567890', 'Juan Pérez', 1500.50, 'USD'),
('0987654321', 'María Gómez', 3250.00, 'MXN'),
('1122334455', 'Carlos López', 450.75, 'EUR'),
('2233445566', 'Ana Martínez', 12000.00, 'USD'),
('3344556677', 'Luis Rodríguez', 850.20, 'MXN'),
('4455667788', 'Sofía Hernández', 5400.00, 'USD'),
('5566778899', 'Pedro Sánchez', 930.10, 'EUR'),
('6677889900', 'Lucía Díaz', 2100.00, 'MXN'),
('7788990011', 'Jorge Ramírez', 670.50, 'USD'),
('8899001122', 'Elena Torres', 4150.80, 'MXN');