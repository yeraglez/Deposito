/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * Permite realizar operaciones como retirar e ingresar dinero,
 * así como obtener el estado actual de la cuenta.
 * 
 * @author Yeray González Toledo
 
 * @see <a href="https://docs.oracle.com/en/java/">JavaDcoumentation</a>”)
*/

public class CCuenta {
    
    private String nombre;          // Nombre del titular de la cuenta
    private String cuenta;          // Número de cuenta
    private double saldo;           // Saldo actual de la cuenta
    private double tipoInterés;     // Tipo de interés de la cuenta
    
    /**
    * Constructor por defecto de la clase CCuenta.
    * Crea una instancia de CCuenta con valores predeterminados.
    */

    public CCuenta()
    { }
    
    /**
     * Constructor de la clase CCuenta.
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Obtiene el estado actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad La cantidad a retirar
     */
    
    public void retirar(double cantidad)
    {try {
        System.out.println("Retiro en cuenta:" + cantidad);
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
                setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {System.out.println(e);
        }
    }
    
    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad La cantidad a ingresar
     */    
    
    public void ingresar(double cantidad)
    {try {
        System.out.println("Ingreso en cuenta:" + cantidad);
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
                setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
        System.out.println(e);
        } 
    }

    // Getters y setters
    
    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular de la cuenta
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta El número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta.
     * 
     * @param saldo El saldo actual de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

