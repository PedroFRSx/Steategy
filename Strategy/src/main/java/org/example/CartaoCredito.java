package org.example;

public class CartaoCredito implements FormaPagamento {
    private static final float TAXA = 0.05f;
    @Override
    public float processar(float valor) {
        return valor + (valor * TAXA);
    }
}