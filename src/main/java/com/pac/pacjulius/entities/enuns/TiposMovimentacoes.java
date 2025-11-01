package com.pac.pacjulius.entities.enuns;

public enum TiposMovimentacoes {

    SAIDA(1),
    ENTRADA(2);

    private int code;

    private TiposMovimentacoes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static TiposMovimentacoes valuesOf(int code) {
        for (TiposMovimentacoes value : TiposMovimentacoes.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Tipo de movimentacao " + code + " nao encontrado");
    }

}
