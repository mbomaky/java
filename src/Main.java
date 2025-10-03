import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Transaction transaction1 = new Transaction("T001", 50000, "salary", LocalDate.of(2025, 1, 5));
    Transaction transaction2 = new Transaction("T002", 1200, "product", LocalDate.of(2025, 1, 10));
    Transaction transaction3 = new Transaction("T003", 500, "transport", LocalDate.of(2025, 1, 15));

    List<Transaction> transactions = new ArrayList<>(List.of(transaction1, transaction2, transaction3));

    TransactionAnalyzer transactionAnalyzer = new TransactionAnalyzer();
    System.out.println("All balance is " + transactionAnalyzer.calculateBalance(transactions));
    System.out.println(
        "Max transaction is " +
            transactionAnalyzer.findLargestTransaction(transactions).id() +
            " (" +
            transactionAnalyzer.findLargestTransaction(transactions).amount() +
            ")"
    );

    List<Transaction> byCategory = transactionAnalyzer.getTransactionsByCategory(transactions, "product");
    System.out.println("Transaction category \"" + byCategory.getFirst().category() + "\": ");

    StringBuilder sb = new StringBuilder();
    for (Iterator<Transaction> iterator = byCategory.iterator(); iterator.hasNext(); ) {
      Transaction next = iterator.next();
      if (!sb.isEmpty()) {
        sb.append(", ");
      }
      sb.append(next.id());
    }
    System.out.println(sb);
  }
}