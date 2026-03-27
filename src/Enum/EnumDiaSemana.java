package Enum;

public enum EnumDiaSemana {
    DOMINGO(1, false),
    SEGUNDA(2, true),
    TERCA(3, true),
    QUARTA(4, true),
    QUINTA(5, true),
    SEXTA(6, true),
    SABADO(7, false);

    private final int numero;
    private final boolean diaUtil;

    EnumDiaSemana(int numero, boolean diaUtil) {
        this.numero = numero;
        this.diaUtil = diaUtil;
    }

    public int getNumero() {
        return numero;
    }

    public boolean ehFimDeSemana() {
        return !diaUtil;
    }

    public boolean ehDiaUtil() {
        return diaUtil;
    }

    public EnumDiaSemana proximoDia() {
        int proximoIndice = (this.ordinal() + 1) % values().length;
        return values()[proximoIndice];
    }

    public EnumDiaSemana diaAnterior() {
        int anteriorIndice = (this.ordinal() - 1 + values().length) % values().length;
        return values()[anteriorIndice];
    }

    public static EnumDiaSemana deNumero(int numero) {
        for (EnumDiaSemana dia : values()) {
            if (dia.numero == numero) {
                return dia;
            }
        }
        throw new IllegalArgumentException("Número inválido: " + numero + " (use 1 a 7)");
    }

    public static EnumDiaSemana deTexto(String texto) {
        return EnumDiaSemana.valueOf(texto.trim().toUpperCase());
    }
}


