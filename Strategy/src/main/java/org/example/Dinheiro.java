package org.example;

public class Dinheiro implements FormaPagamento {
    @Override
    public float processar(float valor) {
        return valor;
    }
}