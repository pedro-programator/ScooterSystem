package model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Rental {
    private LocalDateTime start;
    private LocalDateTime end;
    private Scooter scooter;

    //aktywne wypożyczenie
    public Rental(LocalDateTime start, Scooter scooter) {
        this.start = start;
        this.scooter = scooter;
    }

    //zakończone "wypożyczenie" (hulajnoga oddana) - do przekazania do historii wypożyczeń usera oraz rachunku
    public Rental(LocalDateTime start, LocalDateTime end, Scooter scooter) {
        this.start = start;
        this.end = end;
        this.scooter = scooter;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Scooter getScooter() {
        return scooter;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "start=" + start +
                ", end=" + end +
                ", scooter=" + scooter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return start.equals(rental.start) &&
                end.equals(rental.end) &&
                scooter.equals(rental.scooter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, scooter);
    }
}
