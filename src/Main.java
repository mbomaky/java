import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Transaction transaction1 = new Transaction("T001", 50000, "flat", LocalDate.of(2025, 1, 5));
    Transaction transaction2 = new Transaction("T002", 1200, "product", LocalDate.of(2025, 1, 10));
    Transaction transaction3 = new Transaction("T003", 500, "transport", LocalDate.of(2025, 1, 15));

    List<Transaction> transactions = new ArrayList<>(List.of(transaction1, transaction2, transaction3));

    TransactionAnalyzer transactionAnalyzer = new TransactionAnalyzer();
    System.out.println("Total amount is " + transactionAnalyzer.calculateBalance(transactions));
    System.out.println(
        "Max transaction is " +
            transactionAnalyzer.findLargestTransaction(transactions).id() +
            " (" +
            transactionAnalyzer.findLargestTransaction(transactions).amount() +
            ")"
    );

    List<Transaction> byCategory = transactionAnalyzer.getTransactionsByCategory(transactions, "product");
    System.out.println("Transaction category \"" + byCategory.getFirst().category() + "\": ");

    String ids = byCategory.stream()
        .map(Transaction::id)
        .collect(Collectors.joining(", "));
    System.out.println(ids);
  }
}