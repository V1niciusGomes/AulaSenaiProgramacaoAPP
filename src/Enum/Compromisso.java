package Enum;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Compromisso {
    private final String titulo;
    private final LocalTime inicio;
    private final LocalTime fim;

    public Compromisso(String titulo, LocalTime inicio, LocalTime fim) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título não pode ser vazio.");
        }
        if (inicio == null || fim == null) {
            throw new IllegalArgumentException("Horários não podem ser nulos.");
        }
        if (!fim.isAfter(inicio)) {
            throw new IllegalArgumentException("Horário final deve ser depois do inicial.");
        }

        this.titulo = titulo;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public LocalTime getFim() {
        return fim;
    }

    public int getDuracaoMinutos() {
        return (int) java.time.Duration.between(inicio, fim).toMinutes();
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        return String.format("%s (%s-%s, %d min)",
                titulo, inicio.format(fmt), fim.format(fmt), getDuracaoMinutos());
    }
}