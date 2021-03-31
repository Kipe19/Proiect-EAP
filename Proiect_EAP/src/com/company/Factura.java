package com.company;


import java.util.Date;

public class Factura {
    private String cod_factura;
    private String data_emitere;
    private String emitent;
    private int total;

    public Factura(String cod_factura, String data_emitere, String emitent , int total) {
        this.cod_factura = cod_factura;
        this.data_emitere = data_emitere;
        this.emitent = emitent;
        this.total = total;
    }

    public void print()
    {
        System.out.println("Numar factura : " + cod_factura +" Total : "+ total +  " Data emiterii" + data_emitere + " Emitent" + emitent);
    }
}
