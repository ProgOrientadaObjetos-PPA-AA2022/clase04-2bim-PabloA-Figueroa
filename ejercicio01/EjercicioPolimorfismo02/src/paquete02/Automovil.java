/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String nombre;
    protected String placa;
    protected double valorC;

    public Automovil(String nombre, String placa) {
        this.nombre = nombre;
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }

    public abstract void calcularValorCancelar();

    @Override

    public String toString() {
        //Genero una cadena que contenga los atributos de la clase Estudiante
        String cadena = String.format("Nombre: %s\n"
                + "Placa: %s\n",
                nombre,
                placa);

        return cadena;
    }
}
