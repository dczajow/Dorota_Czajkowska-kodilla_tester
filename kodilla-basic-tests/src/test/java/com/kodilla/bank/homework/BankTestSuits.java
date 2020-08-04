package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankTestSuite {
    @Test
    public void shouldReturnCashMachinesNumber(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine(1000);
        bank.addCashMachine(cashMachine1);
        assertEquals(1, bank.getCashMachinesNumber());
    }
    @Test
    public void shouldReturnBalanceForAllCashMachines(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine(1000);
        CashMachine cashMachine2 = new CashMachine(1000);
        CashMachine cashMachine3 = new CashMachine(1000);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        cashMachine1.transaction(-100);
        cashMachine1.transaction(-50);
        cashMachine1.transaction(-1200);
        cashMachine1.transaction(1000);
        cashMachine1.transaction(-450);
        cashMachine2.transaction(-100);
        cashMachine2.transaction(-220);
        cashMachine3.transaction(1200);
        cashMachine3.transaction(640);
        cashMachine3.transaction(335);
        cashMachine3.transaction(-275);
        cashMachine3.transaction(0);
        cashMachine3.transaction(-230);
        assertEquals(3940, bank.getBalanceOfAllCashMachines() );
    }
    @Test
    public void shouldReturnZeroForNumberOfWithdrawTransactions(){
        Bank bank = new Bank();
        assertEquals(0, bank.getNumberOfAllWithdrawTransactions());
    }
    @Test
    public void shouldReturnNumberOfAllWithdrawTransactionsForAllCashMachines(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine(1000);
        CashMachine cashMachine2 = new CashMachine(1000);
        CashMachine cashMachine3 = new CashMachine(1000);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        cashMachine1.transaction(-100);
        cashMachine1.transaction(-50);
        cashMachine1.transaction(-1200);
        cashMachine1.transaction(1000);
        cashMachine1.transaction(-450);
        cashMachine2.transaction(-100);
        cashMachine2.transaction(-220);
        cashMachine3.transaction(1200);
        cashMachine3.transaction(640);
        cashMachine3.transaction(335);
        cashMachine3.transaction(-275);
        cashMachine3.transaction(0);
        cashMachine3.transaction(-230);
        cashMachine3.transaction(-0); // silly test but just wanted to check for any inconvenient error
        assertEquals(5, bank.getNumberOfAllWithdrawTransactions());
    }
    @Test
    public void shouldReturnZeroForNumberOfPayInTransactions(){
        Bank bank = new Bank();
        assertEquals(0, bank.getNumberOfAllWithdrawTransactions());
    }
    @Test
    public void shouldReturnNumberOfAllPayInTransactionsForAllCashMachines(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine(1000);
        CashMachine cashMachine2 = new CashMachine(1000);
        CashMachine cashMachine3 = new CashMachine(1000);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        cashMachine1.transaction(335);
        cashMachine1.transaction(-50);
        cashMachine1.transaction(750);
        cashMachine1.transaction(1000);
        cashMachine1.transaction(-1270);
        cashMachine2.transaction(150);
        cashMachine2.transaction(1010);
        cashMachine3.transaction(1000);
        cashMachine3.transaction(0);
        cashMachine3.transaction(130);
        cashMachine3.transaction(310);
        cashMachine3.transaction(-100);
        cashMachine3.transaction(224);
        assertEquals(6, bank.getNumberOfAllPayInTransactions());

    }

    @Test
    public void shouldReturnAverageWithdrawValueForAllCashMachines(){
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine(1000);
        CashMachine cashMachine2 = new CashMachine(1000);
        CashMachine cashMachine3 = new CashMachine(1000);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.transaction(-100);
        cashMachine1.transaction(-20);
        cashMachine1.transaction(-55);

        cashMachine2.transaction(-200);
        cashMachine2.transaction(-320);
        cashMachine2.transaction(0);
        cashMachine2.transaction(100);
        cashMachine2.transaction(-50);

        assertEquals(92.50, bank.getAverageWithdrawValueForAllCashMachines(),0.01);

    }

    @Test
    public void shouldReturnAveragePayInValueForAllCashMachines(){
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine(1000);
        CashMachine cashMachine2 = new CashMachine(1000);
        CashMachine cashMachine3 = new CashMachine(1000);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.transaction(100);
        cashMachine1.transaction(20);
        cashMachine1.transaction(55);

        cashMachine2.transaction(200);
        cashMachine2.transaction(320);
        cashMachine2.transaction(0);
        cashMachine2.transaction(100);
        cashMachine2.transaction(1100);

        cashMachine3.transaction(10);

        assertEquals(125, bank.getAveragePayInValueForAllCashMachines(),0.01);

    }
}