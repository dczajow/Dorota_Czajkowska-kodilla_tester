package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;

    public CashMachine(double[] transactions) {
        this.transactions = transactions;
    }

    public double getBalance() {
        double sum = 0;

        for (double transaction : transactions) {
            sum = sum + transaction;
        }

        return sum;
    }

    public int getTransactionsCount() {
        return transactions.length;
    }

    public int getPayoutsCount() {
        int count = 0;

        for (double transaction : transactions) {
            if (transaction < 0) {
                count++;
            }
        }

        return count;
    }

    public int getPaymentsCount() {
        int count = 0;

        for (double transaction : transactions) {
            if (transaction > 0) {
                count++;
            }
        }
        return count;
    }

    public double getPayoutsSum() {
        double sum = 0;

        for (double transaction : transactions) {
            if (transaction < 0) {
                sum = sum - transaction;
            }
        }

        return sum;
    }

    public double getPaymentsSum() {
        double sum = 0;

        for (double transaction : transactions) {
            if (transaction > 0) {
                sum = sum + transaction;
            }
        }

        return sum;
    }
}