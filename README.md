# Transaction Analyzer

A simple Java application for analyzing financial transactions with basic reporting capabilities.

## Project Structure

```
├── src/
│   ├── Main.java                  # Application entry point
│   ├── Transaction.java           # Transaction record class
│   └── TransactionAnalyzer.java   # Transaction analysis logic
├── .gitignore
└── java.iml
```

## Features

- **Calculate Total Balance** - Sum all transaction amounts
- **Find Largest Transaction** - Identify the transaction with the highest amount
- **Filter by Category** - Retrieve transactions by specific category

## Classes

### Transaction (Record)

Represents a financial transaction with the following fields:

- `id` - Unique transaction identifier
- `amount` - Transaction amount (double)
- `category` - Transaction category (e.g., "flat", "product", "transport")
- `date` - Transaction date (LocalDate)

### TransactionAnalyzer

Provides analysis methods:

- `calculateBalance(List<Transaction>)` - Returns total of all transactions
- `findLargestTransaction(List<Transaction>)` - Returns the transaction with maximum amount
- `getTransactionsByCategory(List<Transaction>, String)` - Filters transactions by category

## Usage

```java
// Create transactions
Transaction t1 = new Transaction("T001", 50000, "flat", LocalDate.of(2025, 1, 5));
Transaction t2 = new Transaction("T002", 1200, "product", LocalDate.of(2025, 1, 10));
Transaction t3 = new Transaction("T003", 500, "transport", LocalDate.of(2025, 1, 15));

List<Transaction> transactions = new ArrayList<>(List.of(t1, t2, t3));

// Analyze transactions
TransactionAnalyzer analyzer = new TransactionAnalyzer();
double total = analyzer.calculateBalance(transactions);
Transaction largest = analyzer.findLargestTransaction(transactions);
List<Transaction> products = analyzer.getTransactionsByCategory(transactions, "product");
```

## Requirements

- Java 17 or higher (uses Records feature)
- No external dependencies required (remove JetBrains annotations or add dependency)

## Running the Application

1. Compile the Java files:

```bash
javac src/*.java
```

2. Run the main class:

```bash
java -cp src Main
```

## Expected Output

```
All purchase is 51700.0
Max transaction is T001 (50000.0)
Transaction category "product": 
T002
```