package bank;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;
    private CashMachine cashMachine;
    private CashMachine cashMachine1;

    @BeforeEach
    void setUp() {
        bank = new Bank();
        cashMachine = new CashMachine();
        cashMachine1 = new CashMachine();
    }

    @Test
    void assertThatBankObjectIsNotCreated() {
        Bank bank1 = null;
        Assertions.assertNull(bank1);
    }

    @Test
    void assertThatBankObjectCreated() {
        Assertions.assertNotNull(bank);
    }

    @Test
    @DisplayName("Sample Name")
    void assertThatCashMachineIsAdded() {
        //given
        //when
        bank.addCashMachine(cashMachine);
        //then
        int result = bank.getListOfCashMachines().length;
        assertEquals(1, result);
    }
    @Test
    @DisplayName("Sample Name")
    void assertThatListOfCashMachinesIsEmptyWhileATMIsNotAdded() {
        //given
        //when
        int result = bank.getListOfCashMachines().length;
        //then
        assertEquals(0, result);
    }

    @Test
    void assertThatTransactionIsAddedToCashMachine() {
        //given
        //when
        cashMachine.addTransaction(100);
        //then
        int result = cashMachine.getSize();
        assertEquals(1, result);

    }

    @Test
    void assertThatValueBelowZeroIsAddedToTransaction() {
        //given
        bank.addCashMachine(cashMachine);
        //when
        cashMachine.addTransaction(-1);

        //then
        int result = cashMachine.getSize();
        int result2 = bank.numberOfWithdraws();
        int result3 = bank.numberOfDeposits();
        assertEquals(1, result);
        assertEquals(1, result2);
        assertEquals(0, result3);
    }

    @Test
    void assertThatTransactionWithZeroAsValueIsNotAdded() {
        //given
        //when
        cashMachine.addTransaction(0);
        //then
        int result = cashMachine.getSize();
        assertEquals(0, result);
    }

    @Test
    void assertThatTransactionAverageIsCountedCorrectly() {
        //given
        bank.addCashMachine(cashMachine);
        cashMachine.addTransaction(1);
        cashMachine.addTransaction(1);
        //when
        bank.averageOfDeposits();
        //then
        double result = bank.averageOfDeposits();
        assertEquals(1, result);
    }

    @Test
    void assertThatWithdrawsAvarageIsCountedCorrectly() {
        //given
        bank.addCashMachine(cashMachine);
        cashMachine.addTransaction(-1);
        cashMachine.addTransaction(-1);
        //when
        bank.averageOfDeposits();
        //then
        double result = bank.averageOfWithdraws();
        assertEquals(-1, result);
    }

    @Test
    void testMethodTotalSaldoOfAllCashMachines() {
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
        double initialSaldo = 2 * 10000;
        assertEquals(-100 + initialSaldo, result);
    }


}
