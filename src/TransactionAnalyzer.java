import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class TransactionAnalyzer {
  public double calculateBalance(@NotNull List<Transaction> transactions) {
    return transactions.stream().mapToDouble(Transaction::amount).sum();
  }

  public Transaction findLargestTransaction(@NotNull List<Transaction> transactions) {
    double maxTransaction = transactions.stream().mapToDouble(Transaction::amount).max().orElse(0.0);
    return transactions.stream().filter(t -> t.amount() == maxTransaction).findFirst().orElse(null);
  }

  public List<Transaction> getTransactionsByCategory(@NotNull List<Transaction> transactions, String category) {
    return transactions.stream().filter(t -> Objects.equals(t.category(), category)).toList();
  }
}
