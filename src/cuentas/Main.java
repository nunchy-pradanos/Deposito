package cuentas;


/**
 * Clase Main: contenedora del método main se encarga de la operativa a realizar en la cuenta
 * @author Nunchy Pradanos
 * @version 1.0
 */

public class Main {
/**
 * método main que se ejecuta al lanzar el programa. Contiene el método operativa_cuenta() encargado de realizar las operaciones.
 * @param arg Matriz String que recoge los valores introducidos
 */
    public static void main(String[] args) {
        //una instancia de la clase "CCuenta" que representa una cuenta bancaria.
        CCuenta cuenta1;
        //variable de tipo "double" represente el saldo actual de una cuenta bancaria
        double saldoActual;
        /* variable que contiene una instancia de la clase "CCuenta" con los valores de propiedades 
        y atributos especificados en el constructor.*/
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        // llamada a la función  "operativa_cuenta" y le pasa como argumentos la variable "cuenta1" y el valor 0.
        operativa_cuenta(cuenta1, 0);
    }
/**
 * Método "operativa_cuenta": realiza  operaciones en una cuenta bancaria representada por el objeto "cuenta1",
 * incluyendo la obtención del saldo actual, la retirada de una cantidad y el ingreso de una cantidad en la cuenta.
 * Las excepciones se manejan de manera que si alguna operación falla, se imprime un mensaje de error en la consola.
 * @param cuenta1 objeto de la clase CCuenta que representa la cuenta bancaria a operar.
 * @param cantidad cantidad de dinero a retirar o ingresar en la cuenta bancaria.
*/
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
