package interviews.remotebase.domain_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
 * Create TransactionException, DigitalWallet, and DigitalWalletTransaction classes here.
 */
class TransactionException extends Throwable {
    String errorMessage, errorCode;

    TransactionException(String errorMessage, String errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

class DigitalWallet {
    String walletId, userName, userAccessCode;
    int walletBalance;

    public DigitalWallet(String walletId, String userName) {
        this.walletId = walletId;
        this.userName = userName;
    }

    public DigitalWallet(String walletId, String userName, String userAccessCode) {
        this.walletId = walletId;
        this.userName = userName;
        this.userAccessCode = userAccessCode;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getUsername() {
        return userName;
    }

    public String getUserAccessToken() {
        return userAccessCode;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }
}

class DigitalWalletTransaction {
    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if (digitalWallet.getUserAccessToken() == null) {
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        } else if (amount <= 0) {
            throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
        } else {
            digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() + amount);
        }
    }

    public void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if (digitalWallet.getUserAccessToken() == null) {
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        } else if (digitalWallet.getWalletBalance() < amount) {
            throw new TransactionException("Insufficient balance", "INSUFFICIENT_BALANCE");
        } else if (amount <= 0) {
            throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
        } else {
            digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() - amount);
        }
    }
}


/**
 * Sample Test case : 1
 * 2
 * 1 Julia bff834a2c117a76d9ceb782f98e428686ca3c4ea
 * 2 Samantha
 * 10
 * 1 pay 50
 * 1 add 100
 * 1 add 0
 * 1 pay 30
 * 2 add 500
 * 1 add -5
 * 1 add 1000
 * 1 pay -20
 * 1 pay 100
 * 1 add 720
 * Output:
 * INSUFFICIENT_BALANCE: Insufficient balance.
 * Wallet successfully credited.
 * INVALID_AMOUNT: Amount should be greater than zero.
 * Wallet successfully debited.
 * USER_NOT_AUTHORIZED: User not authorized.
 * INVALID_AMOUNT: Amount should be greater than zero.
 * Wallet successfully credited.
 * INVALID_AMOUNT: Amount should be greater than zero.
 * Wallet successfully debited.
 * Wallet successfully credited.
 * 1 Julia 1690
 * 2 Samantha 0
 *
 * Sample Test Case : 2
 * 3
 * 1 Julia b580e520dc492b15d7d8da3d595b0d106726bddd
 * 2 Samantha 5ab0c88f2a2b7bb2dd72865fe8b90792a694e075
 * 3 Monica 0b7fa5287a3a6cf656dee5cd04f736abd7d8938f
 * 6
 * 1 add 100
 * 2 add 100
 * 3 add 100
 * 1 pay 50
 * 3 pay 40
 * 2 add 90
 * Output:
 * Wallet successfully credited.
 * Wallet successfully credited.
 * Wallet successfully credited.
 * Wallet successfully debited.
 * Wallet successfully debited.
 * Wallet successfully credited.
 * 1 Julia 50
 * 2 Samantha 190
 * 3 Monica 60
 *
 * Sample Test Case : 3
 * 3
 * 1 Julia b580e520dc492b15d7d8da3d595b0d106726bddd
 * 2 Samantha 5ab0c88f2a2b7bb2dd72865fe8b90792a694e075
 * 3 Monica 0b7fa5287a3a6cf656dee5cd04f736abd7d8938f
 * 6
 * 1 add 500
 * 2 add 0
 * 3 add 1000
 * 3 pay 1000
 * 3 pay 40
 * 2 add 90
 * Output:
 * Wallet successfully credited.
 * INVALID_AMOUNT: Amount should be greater than zero.
 * Wallet successfully credited.
 * Wallet successfully debited.
 * INSUFFICIENT_BALANCE: Insufficient balance.
 * Wallet successfully credited.
 * 1 Julia 500
 * 2 Samantha 90
 * 3 Monica 0
 */
public class Question1 {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    private static final DigitalWalletTransaction DIGITAL_WALLET_TRANSACTION = new DigitalWalletTransaction();

    private static final Map<String, DigitalWallet> DIGITAL_WALLETS = new HashMap<>();

    public static void main(String[] args) {
        int numberOfWallets = Integer.parseInt(INPUT_READER.nextLine());
        while (numberOfWallets-- > 0) {
            String[] wallet = INPUT_READER.nextLine().split(" ");
            DigitalWallet digitalWallet;

            if (wallet.length == 2) {
                digitalWallet = new DigitalWallet(wallet[0], wallet[1]);
            } else {
                digitalWallet = new DigitalWallet(wallet[0], wallet[1], wallet[2]);
            }

            DIGITAL_WALLETS.put(wallet[0], digitalWallet);
        }

        int numberOfTransactions = Integer.parseInt(INPUT_READER.nextLine());
        while (numberOfTransactions-- > 0) {
            String[] transaction = INPUT_READER.nextLine().split(" ");
            DigitalWallet digitalWallet = DIGITAL_WALLETS.get(transaction[0]);

            if (transaction[1].equals("add")) {
                try {
                    DIGITAL_WALLET_TRANSACTION.addMoney(digitalWallet, Integer.parseInt(transaction[2]));
                    System.out.println("Wallet successfully credited.");
                } catch (TransactionException ex) {
                    System.out.println(ex.getErrorCode() + ": " + ex.getMessage() + ".");
                }
            } else {
                try {
                    DIGITAL_WALLET_TRANSACTION.payMoney(digitalWallet, Integer.parseInt(transaction[2]));
                    System.out.println("Wallet successfully debited.");
                } catch (TransactionException ex) {
                    System.out.println(ex.getErrorCode() + ": " + ex.getMessage() + ".");
                }
            }
        }

        System.out.println();

        DIGITAL_WALLETS.keySet()
                .stream()
                .sorted()
                .map((digitalWalletId) -> DIGITAL_WALLETS.get(digitalWalletId))
                .forEachOrdered((digitalWallet) -> {
                    System.out.println(digitalWallet.getWalletId()
                            + " " + digitalWallet.getUsername()
                            + " " + digitalWallet.getWalletBalance());
                });
    }
}
