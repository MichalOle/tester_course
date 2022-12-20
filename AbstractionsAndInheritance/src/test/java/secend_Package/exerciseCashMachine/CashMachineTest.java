package secend_Package.exerciseCashMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {
    private CashMachine cashMachine;

    @BeforeEach
    void setUp() {
        cashMachine = new CashMachine(10000);
        cashMachine.executeTransaction(1000);
    }

    @Test
    void assertThatCashMachineListIsNotEmpty() {
        //given
        //when
        int numberOfAtms = cashMachine.getTransactions().length;
        //then
        assertEquals(1, numberOfAtms);
        assertNotNull(cashMachine.getTransactions());

    }
    @Test
    void assertThatSumOfWitdrawsAndDepositsWorksCorrectly(){
        //given - w BeforeEach
        //when
        int sumOfDeposits = cashMachine.sumOfDepositsInAtm();
        int sumOfWithdraws = cashMachine.sumOfDWithdrawsInAtm();
        //then
        assertEquals(1000,sumOfDeposits);
        assertEquals(0,sumOfWithdraws);
    }
}