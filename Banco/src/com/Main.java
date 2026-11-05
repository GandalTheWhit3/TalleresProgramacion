package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("	REGISTRO");
        System.out.println("Banco Actual: " + CuentaBancaria.getNombreBanco());
 
        System.out.println("Ingrese el numero de cuenta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.println("Ingrese el saldo inicial: ");
        double saldo = sc.nextDouble();

        CuentaBancaria p1 = new CuentaBancaria(numero, titular, saldo);

        System.out.println("Datos de la Cuenta");
        System.out.println("Numero de Cuenta: " + p1.getNumeroCuenta());
        System.out.println("Titular: " + p1.getTitular());
        System.out.println("Saldo Final: $" + p1.getSaldo());
 
        System.out.println("Total de cuentas creadas en el sistema: " + CuentaBancaria.getTotalCuentasCreadas());

        sc.close();
    }
}
