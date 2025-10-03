import java.time.LocalDate;

public record Transaction(String id, double amount, String category, LocalDate date) {
}
