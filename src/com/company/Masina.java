package com.company;

public class Masina {
    private String marca;
    private String model;
    private String an_fab;
    private String combustibil;

    public Masina(String marca, String model, String an_fab, String combustibil) {
        this.marca = marca;
        this.model = model;
        this.an_fab = an_fab;
        this.combustibil = combustibil;
    }


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getAn_fab() {
        return an_fab;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void print()
    {
        System.out.println("Modelul si marca masinii : "+ model + " "+ marca);
        System.out.println("Anul fabricatiei si combustibilul : "+an_fab+ " " + combustibil);

    }

}
