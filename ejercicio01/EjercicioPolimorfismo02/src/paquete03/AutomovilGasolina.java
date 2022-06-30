/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private double galonesM;
    private double costoG;
    private double iva;

    public AutomovilGasolina(double galonesM, double costoG, String nombre, String placa) {
        super(nombre, placa);
        this.galonesM = galonesM;
        this.costoG = costoG;
        calcularIVa();
        calcularValorCancelar();
    }

    public double getGalonesM() {
        return galonesM;
    }

    public void setGalonesM(double n) {
        this.galonesM = n;
    }

    public double getCostoG() {
        return costoG;
    }

    public void setCostoG(double c) {
        this.costoG = c;
    }

    public void calcularIVa() {
        iva = ((costoG * galonesM) * 10) / 100;
    }

    @Override
    public void calcularValorCancelar() {
        valorC = (costoG * galonesM) + iva;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("---Automoviles a Gasolina---\n"
                + "%s", super.toString());

        cadenaFinal = String.format("%s"
                + "Numero de Galones: %.2f\n"
                + "Costo de Galon: %.2f\n"
                + "Valor Total: %.2f\n",
                cadenaFinal,
                getGalonesM(),
                getCostoG(),
                valorC);

        return cadenaFinal;
    }
}
