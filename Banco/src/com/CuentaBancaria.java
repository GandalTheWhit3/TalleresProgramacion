package com;

public class CuentaBancaria {
	private final int numeroCuenta;
	private String titular;
	private double saldo;
	private static String nombreBanco = "Banco Pichincha";
	 private static int totalCuentasCreadas = 0;
public CuentaBancaria (int numeroCuenta, String titular, double saldo) {
	this.numeroCuenta = numeroCuenta;
	 if (titular == null || titular.equals("")) {
	        System.out.println("El titular no puede estar vacio");
	    } else {
	        this.titular = titular;
	    }
	if (saldo < 0) {
        System.out.println("No se permiten Saldos negativos");
        this.saldo = 0.0;
    } else {
        this.saldo = saldo;
    }
	 totalCuentasCreadas = totalCuentasCreadas + 1;
	
}
	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}
	 public String getTitular() {
	        return this.titular;
	    }
	public double getSaldo() {
		return this.saldo;
	}
	

	 public static String getNombreBanco() {
	        return nombreBanco;
	    }
	 public static int getTotalCuentasCreadas() {
	        return totalCuentasCreadas;
	    }
	 public void setSaldo(double saldo) {
	        if (saldo < 0) {
	            System.out.println("Error: El saldo no puede ser negativo.");
	        } else {
	            this.saldo = saldo;
	        }
	    }
	 public void setTitular(String titular) {
		    if (titular == null || titular.equals("")) {
		        System.out.println("Error: El titular no puede estar vacío.");
		    } else {
		        this.titular = titular;
		    }
		}
	
}
