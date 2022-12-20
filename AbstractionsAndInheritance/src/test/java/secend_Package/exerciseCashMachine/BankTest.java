package secend_Package.exerciseCashMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {
    private Bank bank;
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;



    @BeforeEach
    void setUp() {

        cashMachine1 = new CashMachine(1000);
        cashMachine1.executeTransaction(1000);
        System.out.println(cashMachine1.getTotalSumOfTrans());
        cashMachine2 = new CashMachine(2000);
        cashMachine2.executeTransaction(1000);
        cashMachine2.executeTransaction(1000);
        bank = new Bank();
        bank.add(cashMachine1);
        bank.add(cashMachine2);

    }

    @Test
    void checkNumberOfCashMachines(){
        int numb = bank.getActualAtmNumb();
        Assertions.assertEquals(2,numb);
    }
    @Test
    void checkTotalNumberOfDepositsAndWithdrawsAndTogether() {
        int dep = bank.getTotalNumbOfDeposits();
        int withdraws = bank.getTotalNumbOfWithdraws();
        int total = dep + withdraws;
        Assertions.assertEquals(3,dep);
        Assertions.assertEquals(0,withdraws);
        Assertions.assertEquals(3,total);

    }
    @Test
    void itIsCorrectAverageOfDepositsAndWithdraws(){
        int avgDeposits = bank.getAverageTotalOfDeposits();


        Assertions.assertEquals(1000,avgDeposits);
    }
}