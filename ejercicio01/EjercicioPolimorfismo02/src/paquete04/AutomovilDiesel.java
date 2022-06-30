/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private double litrosM;
    private double costoL;
    private double descuento;
    private int porcentajeD;

    public AutomovilDiesel(int pd, int g, double c, String nombre, String placa) {
        super(nombre, placa);
        this.litrosM = g;
        this.costoL = c;
        this.porcentajeD = pd;
        calcularIVa();
        calcularValorCancelar();
    }

    public double getLitrosM() {
        return litrosM;
    }

    public void setLitrosM(double litrosM) {
        this.litrosM = litrosM;
    }

    public double getCostoL() {
        return costoL;
    }

    public void setCostoL(double costoL) {
        this.costoL = costoL;
    }

    public void calcularIVa() {
        descuento = (litrosM * porcentajeD) / 100;
    }

    @Override
    public void calcularValorCancelar() {
        valorC = costoL * (litrosM - descuento);
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("---Automoviles a Diesel---\n"
                + "%s", super.toString());

        cadenaFinal = String.format("%s"
                + "Numero de Litros: %.2f\n"
                + "Costo de Litros: %.2f\n"
                + "Porcentaje de Descuento: %.2f\n"
                + "Total a cancelar: %.2f\n",
                cadenaFinal,
                getLitrosM(),
                getCostoL(),
                descuento,
                valorC);

        return cadenaFinal;
    }
}
