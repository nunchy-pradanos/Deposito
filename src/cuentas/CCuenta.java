package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria. Define el objeto Ccuenta con
 * los atributos y métodos correspondientes La cuenta tiene un nombre, una
 * cadena que representa el número de cuenta ,un saldo y un tipo de interés Los
 * titulares pueden ingresar y retirar dinero de la cuenta.
 *
 * @author Nunchy Prádanos
 * @version 1.0
 */
public class CCuenta {

//Atributos de la clase
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase Ccuenta sin parámetros
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta con parámetros. Crea una nueva cuenta
     * bancaria con el nombre, el número de cuenta, el saldo y el tipo de
     * interés.
     *
     * @param nom el titular de la cuenta bancaria.
     * @param cue el número de cuenta bancaria.
     * @param sal el saldo de la cuenta bancaria.
     * @param tipo el tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método asignarNombre: recibe como parámetro un nombre y lo asigna al
     * atributo nombre de la instancia actual de la clase que la llama
     *
     * @param nom el nombre a asignar.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método obtenerNombre: devuelve el nombre de la instancia actual de la
     * clase que llama a la función.
     *
     * @return el nombre de la instancia actual.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Devuelve el saldo actual de la instancia actual de la clase que llama a
     * la función.
     *
     * @return el saldo actual de la instancia actual.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método ingresar: ingresa una cantidad al saldo de la instancia actual de
     * la clase que llama a la función.
     *
     * @param cantidad la cantidad a ingresar.
     * @throws Exception si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método retirar: retira una cantidad del saldo de la instancia actual de
     * la clase que llama a la función.
     *
     * @param cantidad la cantidad a retirar.
     * @throws Exception si la cantidad es menor o igual a cero, o si la
     * cantidad es mayor al saldo actual.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método obteberCuenta : devuelve el número de cuenta de la instancia actual de la clase que llama
     * a la función.    
     * @return el número de cuenta.
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * getter 
     * Devuelve el nombre de la instancia actual de la clase que llama a la función.
     * @return el nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter
     * Establece el nombre de la instancia actual de la clase que llama a la función.
     * @param nombre asigna el nombre al atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter 
     * Devuelve el tipo de interés de la instancia actual de la clase que llama a la función.
     * @return el tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * setter Establece el tipo de interés de la instancia actual de la clase
     * que llama a la función.
     * @param tipoInterés asigna el tipo de interés al atributo tipoInteres
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * getter 
     * Devuelve el número de cuenta de la instancia actual de la clase que llama a la función.
     * @return el número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter 
     * Establece el número de cuenta de la instancia actual de la clase que llama a la función.
     * @param cuenta asigna el número de cuenta al atributo cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * getter
     * Devuelve el saldo actual de la instancia actual de la clase que llama a la función.
     * @return saldo 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * setter 
     * Establece el saldo de la instancia actual de la clase que llama a la función.
     * @param saldo asigna el saldo a establecer al atributo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
