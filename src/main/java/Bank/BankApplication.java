package Bank;

import java.util.Arrays;

public class BankApplication {
    public static void main(String[] args) {

        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();

        cashMachine.addTransaction(-1000);
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(1000);
        cashMachine.getSaldoOfCashMachine();
        cashMachine.getNumberOfTransactions();
        System.out.println(Arrays.toString(cashMachine.getListOfTransactions()));
        System.out.println("---------------");

        cashMachine1.addTransaction(2000);
        cashMachine1.addTransaction(2000);
        cashMachine1.addTransaction(-300);
        cashMachine1.getSaldoOfCashMachine();
        cashMachine1.getNumberOfTransactions();
        System.out.println(Arrays.toString(cashMachine1.getListOfTransactions()));
        System.out.println("--------------");
        bank.addCashMachine(cashMachine);
        bank.addCashMachine(cashMachine1);
        bank.getNumberOfDeposits();
        bank.getNumberOfWithdraws();
        bank.getTotalSaldoOfAllCashMachines();
        bank.getAverageOfDeposits();
        bank.getAverageOfWithdraws();
    }
}
