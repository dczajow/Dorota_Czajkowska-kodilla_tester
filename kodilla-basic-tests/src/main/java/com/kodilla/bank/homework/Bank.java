package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getBalance() {
        double sum = 0;

        for (CashMachine cashMachine : cashMachines) {
            sum = sum + cashMachine.getBalance();
        }

        return sum;
    }

    public int getPayoutsCount() {
        int payoutsCount = 0;

        for (CashMachine cashMachine : cashMachines) {
            payoutsCount = payoutsCount + cashMachine.getPayoutsCount();
        }
        return payoutsCount;
    }

    public int getPaymentsCount() {
        int paymentsCount = 0;

        for (CashMachine cashMachine : cashMachines) {
            paymentsCount = paymentsCount + cashMachine.getPaymentsCount();
        }
        return paymentsCount;
    }

    public double getPayoutsAverage() {
        double payoutsSum = 0;

        for (CashMachine cashMachine : cashMachines) {
            payoutsSum = payoutsSum + cashMachine.getPayoutsSum();
        }
        if (getPayoutsCount() == 0) {
            return 0;
        }
        return payoutsSum / getPayoutsCount();
    }

    public double getPaymentsAverage() {
        double paymentsSum = 0;

        for (CashMachine cashMachine : cashMachines) {
            paymentsSum = paymentsSum + cashMachine.getPaymentsSum();
        }
        if (getPaymentsCount() == 0) {
            return 0;
        }
        return paymentsSum / getPaymentsCount();
    }
}