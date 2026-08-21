package java_question5;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        AccountHolder[] accountHolderArr = new AccountHolder[10];
        Scanner sc = new Scanner(System.in);

        int choice, accountCount = 0;

        while (true) {

            System.out.println("\n--- Menu ---");
            System.out.println("1. Add record for account holder");
            System.out.println("2. Display details of all account holders");
            System.out.println("3. Deposit an amount into a particular account");
            System.out.println("4. Withdraw an amount from a particular account");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1: {

                // 1. Add record for account holder

                if (accountCount < accountHolderArr.length) {

                    System.out.print("Enter account number: ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter account holder name: ");
                    String accountHolderName = sc.next();

                    System.out.print("Enter initial deposit amount: ");
                    double accountBalance = sc.nextDouble();

                    AccountHolder newAccount =
                            new AccountHolder(
                                    accountNumber,
                                    accountHolderName,
                                    accountBalance
                            );

                    accountHolderArr[accountCount++] = newAccount;

                    System.out.println("Account is created....");

                } else {

                    System.out.println("Account Array is Full...");
                }

                break;
            }

            case 2: {

                // 2. Display details of all account holders

                if (accountCount == 0) {

                    System.out.println("No Account found...");

                } else {

                    for (int i = 0; i < accountCount; i++) {

                        System.out.println(accountHolderArr[i]);
                        System.out.println("------------------------");
                    }
                }

                break;
            }

            case 3: {

                // 3. Deposit an amount into a particular account

                System.out.println(
                        "Enter account number for deposit amount:"
                );

                int accountNumber = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < accountCount; i++) {

                    if (accountHolderArr[i].getAccountNumber()
                            == accountNumber) {

                        System.out.println("Enter amount to deposit");

                        double amount = sc.nextDouble();

                        accountHolderArr[i].deposit(amount);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account Not found...");
                }

                break;
            }

            case 4: {

                // 4. Withdraw an amount from a particular account

                System.out.println(
                        "Enter account number for withdrawal:"
                );

                int accountNumber = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < accountCount; i++) {

                    if (accountHolderArr[i].getAccountNumber()
                            == accountNumber) {

                        System.out.print("Enter amount to withdraw: ");

                        double amount = sc.nextDouble();

                        accountHolderArr[i].withdraw(amount);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account Not found...");
                }

                break;
            }

            case 5: {

                // Exit

                System.out.println("Exiting...");

                sc.close();

                return;
            }

            default: {

                System.out.println(
                        "Invalid choice. Please try again."
                );

                break;
            }
            }
        }
    }
}