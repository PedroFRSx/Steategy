package org.example;

public class Pix implements FormaPagamento {
    @Override
    public float processar(float valor) {
        return valor;
    }
}