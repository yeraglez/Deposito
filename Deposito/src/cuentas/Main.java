/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author MF-YG
 */

public class Main {
    public static void main(String[] args) {

        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        saldoActual = operaciones(cuenta1);

        System.out.println("El saldo actual es "+ saldoActual );
    }

    private static double operaciones(CCuenta cuenta1) {
        double saldoActual;
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
        saldoActual = cuenta1.estado();
        return saldoActual;
    }
}
