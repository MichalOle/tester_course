package bank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {


    Bank bank = new Bank();
    CashMachine cashMachine = new CashMachine();
    CashMachine cashMachine1 = new CashMachine();


    @Test
    @DisplayName("Sample Name")
    void testAddCashMachineToList() {
        //given
        //when
        bank.addCashMachine(cashMachine);
        bank.addCashMachine(cashMachine1);
        //then
        int result = bank.getListOfCashMachines().length;
        assertEquals(2, result);
    }

    @Test
    void testAddToCashMachineTransaction(){
        //given
        //when
        cashMachine.addTransaction(100);
        //then
        int result = cashMachine.getSize();
        assertEquals(1,result);

    }
    @Test
    void testAddToCashMachineTransactionUnder0(){
        //given
        bank.addCashMachine(cashMachine);
        //when
        cashMachine.addTransaction(-100);

        //then
        int result = cashMachine.getSize();
        int result2 = bank.numberOfWithdraws();
        int result3 = bank.numberOfDeposits();
        assertEquals(1,result);
        assertEquals(1,result2);
        assertEquals(0,result3);
    }
    @Test
    void testAddToCashMachineTransactionEqualsZero(){
        //given
        //when
        cashMachine.addTransaction(0);
        //then
        int result = cashMachine.getSize();
        assertEquals(0,result);
    }
     @Test
    void testMethodAverageOfDeposits(){
        //given
         bank.addCashMachine(cashMachine);
         cashMachine.addTransaction(300);
         cashMachine.addTransaction(200);
        //when
        bank.averageOfDeposits();
        //then
        double result = bank.averageOfDeposits();
        assertEquals(250,result);
    }
    @Test
    void testMethodAverageOfWithdraws(){
        //given
        bank.addCashMachine(cashMachine);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(-200);
        //when
        bank.averageOfDeposits();
        //then
        double result = bank.averageOfWithdraws();
        assertEquals(-250,result);
    }
    @Test
    void testMethodTotalSaldoOfAllCashMachines(){
        //given
        bank.addCashMachine(cashMachine);
        bank.addCashMachine(cashMachine1);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(-200);
        cashMachine1.addTransaction(200);
        cashMachine1.addTransaction(200);
        //when
        bank.totalSaldoOfAllCashMachines();
        //then
        double result = bank.totalSaldoOfAllCashMachines();
        //jest to suma sald(dwa bankomaty) poczatkowych, zdeklarowanych dla bankomatow w klasie CashMachine
        double initialSaldo = 2*10000;
        assertEquals(-100+initialSaldo,result);
    }

    @Test
    @DisplayName("Sample Name")
    void testGetListOfCashMachinesWhenListIsEmpty() {
        //given
        //when
        int result = bank.getListOfCashMachines().length;
        //then
        assertEquals(0, result);
    }

}
