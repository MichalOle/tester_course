package secend_Package.exerciseCashMachineTestSuite;

import com.secend_Package.exerciseCashMachine.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransactionTest {
    @Test
    void assertThatTransactionAmountIsNotEmpty(){
        //given
        Transaction transaction = new Transaction(1);
        //then
        int amount = transaction.getAmount();
        Assertions.assertEquals(1,amount);
    }




}
