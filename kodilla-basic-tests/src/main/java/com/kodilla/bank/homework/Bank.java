package com.kodilla.bank.homework;
public class Bank {
    private CashMachine[] cashMachines;
    //private int cashMachinesCount = 0;
    public Bank() {
        this.cashMachines = new CashMachine[0];

    }
    public void addCashMachine(CashMachine cashMachine){
        CashMachine[] bankomat = new CashMachine[this.cashMachines.length + 1];
        System.arraycopy(this.cashMachines,0 , bankomat, 0, this.cashMachines.length);
        bankomat[this.cashMachines.length] = cashMachine;
        this.cashMachines = bankomat;
    }
    /*
    public int getNumberOfCashMachines(){
        return this.cashMachines.length;
    }
    public int getBalanceOfAllCashMachines(){
        int sum = 0;
        for(CashMachine cm : this.cashMachines){
            sum += cm.getBalance();
        }
        return sum;
    }
    public int getNumberOfAllWithdrawTransactions(){
        int sum = 0;
        for(CashMachine cm : this.cashMachines){
            sum += cm.getNumberOfWithdrawTransactions();
        }
        return sum;
    }
    public int getNumberOfAllPayInTransactions(){
        int sum = 0;
        for(CashMachine cm : this.cashMachines){
            sum += cm.getNumberOfPayInTransactions();
        }
        return sum;
    }

    public double getAverageWithdrawValueForAllCashMachines(){
        double sumFromTransactions = 0;
        int numberOfTransactions = 0;
        for(CashMachine cm : this.cashMachines){
            sumFromTransactions += cm.getSumOfAllWithdraws();
            numberOfTransactions += cm.getNumberOfWithdrawTransactions();
        }
        return sumFromTransactions / numberOfTransactions;
    }

    public double getAveragePayInValueForAllCashMachines(){
        double sumFromTransactions = 0;
        int numberOfTransactions = 0;
        for(CashMachine cm : this.cashMachines){
            sumFromTransactions += cm.getSumOfAllPayIn();
            numberOfTransactions += cm.getNumberOfPayInTransactions();
        }
        return sumFromTransactions / numberOfTransactions;
    } */
}