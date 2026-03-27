package Enum;


import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        AgendaSemanal agenda = new AgendaSemanal();

        agenda.adicionarCompromisso(EnumDiaSemana.SEGUNDA,
                new Compromisso("Reunião de planejamento", LocalTime.of(9, 0), LocalTime.of(10, 0)));
        agenda.adicionarCompromisso(EnumDiaSemana.SEGUNDA,
                new Compromisso("Codar feature X", LocalTime.of(10, 30), LocalTime.of(12, 0)));
        agenda.adicionarCompromisso(EnumDiaSemana.QUARTA,
                new Compromisso("Review de PR", LocalTime.of(14, 0), LocalTime.of(15, 0)));
        agenda.adicionarCompromisso(EnumDiaSemana.SEXTA,
                new Compromisso("Deploy", LocalTime.of(16, 0), LocalTime.of(17, 30)));
        agenda.adicionarCompromisso(EnumDiaSemana.SABADO,
                new Compromisso("Treino", LocalTime.of(8, 0), LocalTime.of(9, 0)));

        agenda.imprimirRelatorio();

        EnumDiaSemana hoje = EnumDiaSemana.SEGUNDA;
        LocalTime agora = LocalTime.of(10, 0);

        Compromisso proximo = agenda.proximoCompromisso(hoje, agora);
        System.out.println("\nPróximo compromisso após " + hoje + " " + agora + ":");
        System.out.println(proximo != null ? proximo : "Nenhum compromisso encontrado.");
    }
}