package Enum;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class AgendaSemanal {
    private final Map<EnumDiaSemana, List<Compromisso>> agenda = new EnumMap<>(EnumDiaSemana.class);

    public AgendaSemanal() {
        for (EnumDiaSemana dia : EnumDiaSemana.values()) {
            agenda.put(dia, new ArrayList<>());
        }
    }

    public void adicionarCompromisso(EnumDiaSemana dia, Compromisso compromisso) {
        List<Compromisso> lista = agenda.get(dia);
        lista.add(compromisso);
        lista.sort(Comparator.comparing(Compromisso::getInicio));
    }

    public List<Compromisso> listarDia(EnumDiaSemana dia) {
        return List.copyOf(agenda.get(dia));
    }

    public int totalMinutosSemana() {
        int total = 0;
        for (List<Compromisso> lista : agenda.values()) {
            for (Compromisso c : lista) {
                total += c.getDuracaoMinutos();
            }
        }
        return total;
    }

    public Compromisso proximoCompromisso(EnumDiaSemana diaAtual, LocalTime horaAtual) {
        EnumDiaSemana dia = diaAtual;

        for (int i = 0; i < 7; i++) {
            List<Compromisso> lista = agenda.get(dia);
            for (Compromisso c : lista) {
                if (i > 0 || !c.getInicio().isBefore(horaAtual)) {
                    return c;
                }
            }
            dia = dia.proximoDia();
        }
        return null;
    }

    public void imprimirRelatorio() {
        System.out.println("=== AGENDA SEMANAL ===");
        for (EnumDiaSemana dia : EnumDiaSemana.values()) {
            System.out.println("\n" + dia + (dia.ehFimDeSemana() ? " (fim de semana)" : " (dia útil)"));
            List<Compromisso> lista = agenda.get(dia);
            if (lista.isEmpty()) {
                System.out.println("  - sem compromissos");
            } else {
                for (Compromisso c : lista) {
                    System.out.println("  - " + c);
                }
            }
        }
        System.out.println("\nTotal da semana: " + totalMinutosSemana() + " minutos");
    }
}