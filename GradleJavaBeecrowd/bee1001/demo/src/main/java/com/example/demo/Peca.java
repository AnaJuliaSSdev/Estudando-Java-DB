package com.example.demo;

public class Peca {
    private int codigo;
    private int numeroPecas;
    private double valorUnitario;

    public Peca(int codigo, int numeroPecas, double valorUnitario) {
        this.codigo = codigo;
        this.numeroPecas = numeroPecas;
        this.valorUnitario = valorUnitario;
    }

    public int getCodigo() {
        return this.codigo; 
    }

    public int getnumeroPecas(){
        return this.numeroPecas;
    }

     public double getvalorUnitario(){
        return this.valorUnitario;
    }
}
