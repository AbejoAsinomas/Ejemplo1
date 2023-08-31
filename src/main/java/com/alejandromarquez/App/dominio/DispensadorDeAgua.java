package com.alejandromarquez.App.dominio;

import javax.swing.*;

public class DispensadorDeAgua {
    public long serial;
    public String marca;
    public byte cantidadMaxima = 10;
    public byte cantidadActual;
    public String temperatura;
    public void servir(int cantidad) {
        if (cantidad > 0 && cantidad <= cantidadActual) {
            cantidadActual -= cantidad;
            System.out.println("Se dispensaron " + cantidad + "ml de agua.");
        } else if (cantidad > cantidadActual) {
            System.out.println("Agua insuficiente. Se dispensarán " + cantidadActual + "ml.");
            cantidadActual = 0;
        } else {
            System.out.println("Cantidad inválida. No se dispensa agua.");
        }
    }
    public void llenar(int cantidad) {
        if (cantidad > 0) {
            cantidadActual += cantidad;
            System.out.println("Dispensador llenado con " + cantidad + "ml de agua.");
        } else {
            System.out.println("Cantidad inválida, Nivel de agua sin cambios.");
        }
    }
    public void vaciar(float quitarAgua) {
        if (this.cantidadActual > 0) {
            quitarAgua -= this.cantidadActual ;
        }
    }
}
