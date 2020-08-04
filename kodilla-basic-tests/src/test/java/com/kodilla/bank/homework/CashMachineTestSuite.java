package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CashMachineTestSuite {
    @Test
    public void shouldReturnBalance(){
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.transaction(100);
        cashMachine.transaction(-1050);
        cashMachine.transaction(-260);
        assertEquals(9840, cashMachine.getBalance(), 0.01);
    }
    @Test
    public void shouldReturnFalseIfTransactionBeyondEdgeValues(){
        CashMachine cashMachine = new CashMachine(10000);
        boolean actualWithdraw = cashMachine.transaction(-400);
        boolean actualPayIn = cashMachine.transaction(1100);
        assertFalse(actualWithdraw);
        assertFalse(actualPayIn);
    }
    @Test
    public void shouldReturnTrueIfTransactionWithinEdgeValues(){
        CashMachine cashMachine = new CashMachine(10000);
        boolean actualWithdraw = cashMachine.transaction(-300);
        boolean actualPayIn = cashMachine.transaction(1000);
        assertTrue(actualWithdraw);
        assertTrue(actualPayIn);
    }
    @Test
    public void returnFalseIfWithdrawAmountIsHigherThanCashMachineBalance(){
        CashMachine cashMachine = new CashMachine(250);
        boolean actualWithdraw = cashMachine.transaction(-251);
        assertFalse(actualWithdraw);
    }
    @Test
    public void shouldReturnNumberOfTransactions(){
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.transaction(-300); // true  , balance 700
        cashMachine.transaction(-600); // false
        cashMachine.transaction(-200); // true , balance 500
        cashMachine.transaction(300); // true balance 800
        cashMachine.transaction(1200); // false,  max 1000 pay in
        cashMachine.transaction(-301); // false , max (-)300 withdraw
        assertEquals(3, cashMachine.getTransactions().length);
    }
    @Test // only multiply of 10 can be used as amount for transaction
    // [lowest banknotes denomination]
    public void returnFalseIfTransactionNotMadeAsMultiplyOf10(){
        CashMachine cashMachine = new CashMachine(1000);
        boolean t1 = cashMachine.transaction(105);
        boolean t2 = cashMachine.transaction(-955);
        assertFalse(t1);
        assertFalse(t2);
    }
    @Test
    public void shouldReturnTwoAsArrayTransactionsLength(){
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.transaction(105);
        cashMachine.transaction(30);
        cashMachine.transaction(-110);
        cashMachine.transaction(-955);
        assertEquals(2, cashMachine.getTransactions().length);
    }
    @Test
    public void returnFalseIfTransactionValueIsZero(){
        CashMachine cashMachine = new CashMachine(1000);
        boolean t1 = cashMachine.transaction(0);
        assertFalse(t1);
    }
    @Test
    public void returnZerofTransactionValueIsZero(){
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.transaction(0);
        assertEquals(0, cashMachine.getTransactions().length);
    }
    @Test
    public void shouldReturnFalseIfAttemptOfGoingBelowBalance(){
        CashMachine cashMachine = new CashMachine(200);
        boolean t1 = cashMachine.transaction(-100);
        boolean t2 = cashMachine.transaction(-100);
        boolean t3 = cashMachine.transaction(-20);
        cashMachine.transaction(50);
        boolean t5 = cashMachine.transaction(-60);
        assertTrue(t1);
        assertTrue(t2);
        assertFalse(t3);
        assertFalse(t5);
    }
    @Test
    public void shouldReturn4AsNumberOfPayInTransactions(){
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.transaction(100);  // true
        cashMachine.transaction(210);  // true
        cashMachine.transaction(155);  // false
        cashMachine.transaction(50);  // true
        cashMachine.transaction(-200);  // fasle
        cashMachine.transaction(1200); // false
        cashMachine.transaction(-220);  // false
        cashMachine.transaction(0); // false
        cashMachine.transaction(1000); // true
        assertEquals(4, cashMachine.getNumberOfPayInTransactions());
    }
    @Test
    public void shouldReturn4AsNumberOfWithdrawTransactions(){
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.transaction(-100);  // true
        cashMachine.transaction(-210);  // true
        cashMachine.transaction(-155);  // false
        cashMachine.transaction(50);  // false
        cashMachine.transaction(-200);  // true
        cashMachine.transaction(-320); // false
        cashMachine.transaction(-220);  // true
        cashMachine.transaction(0); // false
        cashMachine.transaction(20); // false
        assertEquals(4, cashMachine.getNumberOfWithdrawTransactions());
    }
    @Test
    public void shouldCalculateBalance(){
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.transaction(-500);
        cashMachine.transaction(-200);
        cashMachine.transaction(-100);
        cashMachine.transaction(50);
        cashMachine.transaction(-130);
        cashMachine.transaction(80);
        cashMachine.transaction(-60);
        assertEquals(640, cashMachine.getBalance());
    }
    @Test
    public void shouldReturnAveragePayInValue(){
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.transaction(200);
        cashMachine.transaction(110);
        cashMachine.transaction(10);
        assertEquals(106.66, cashMachine.getAveragePayInValue(), 0.01);
        cashMachine.transaction(50);
        cashMachine.transaction(10);
        cashMachine.transaction(200);
        assertEquals(96.66, cashMachine.getAveragePayInValue(), 0.01);
    }
    @Test
    public void shouldReturnAverageWithdrawValue(){
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.transaction(-200);
        cashMachine.transaction(-110);
        cashMachine.transaction(-10);
        assertEquals(106.66, cashMachine.getAverageWithdrawValue(), 0.01);
        cashMachine.transaction(-50);
        cashMachine.transaction(-10);
        cashMachine.transaction(-200);
        assertEquals(96.66, cashMachine.getAverageWithdrawValue(), 0.01);
    }

    @Test
    public void shouldReturnSumOfAllWithdraws(){
        CashMachine cashMachine =  new CashMachine(1000);

        cashMachine.transaction(-100);
        cashMachine.transaction(0);
        cashMachine.transaction(-400);
        cashMachine.transaction(-290);
        cashMachine.transaction(-10);
        cashMachine.transaction(-35);

        assertEquals(400, cashMachine.getSumOfAllWithdraws());
    }

    @Test
    public void shouldReturnSumOfAllPayIns(){
        CashMachine cashMachine =  new CashMachine(1000);

        cashMachine.transaction(100);
        cashMachine.transaction(0);
        cashMachine.transaction(400);
        cashMachine.transaction(1290);
        cashMachine.transaction(1010);
        cashMachine.transaction(35);
        cashMachine.transaction(350);

        assertEquals(850, cashMachine.getSumOfAllPayIn());
    }


}