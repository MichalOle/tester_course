package Bank;

public class Bank {
    private CashMachine[] listOfCashMachines;
    private int size;

    public Bank() {
        this.listOfCashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        size++;
        CashMachine[] tempListOfCashMachines = new CashMachine[this.size];
        System.arraycopy(listOfCashMachines, 0, tempListOfCashMachines, 0, listOfCashMachines.length);
        tempListOfCashMachines[this.size - 1] = cashMachine;
        this.listOfCashMachines = tempListOfCashMachines;
    }

    public void getTotalSaldoOfAllCashMachines() {
        int total = 0;
        for (CashMachine listOfCashMachine : listOfCashMachines) {
            double initialSaldo = 10000;
            double result = 0;
            for (double listOfTransaction : listOfCashMachine.getListOfTransactions()) {
                result += listOfTransaction;
            }
            total += initialSaldo + result;
        }
        System.out.println("Saldo wszystkich bankomatów wnosi łącznie " + total + " PLN.");
    }

    public void getNumberOfDeposits() {
        int total = 0;
        for (CashMachine listOfCashMachine : listOfCashMachines) {
            double[] listOfTransactions = listOfCashMachine.getListOfTransactions();
            for (double tempListOfTransaction : listOfTransactions) {
                if (tempListOfTransaction > 0)
                    total++;
            }
        }
        System.out.println("Dokonano " + total + " wpłat.");
    }

    public void getNumberOfWithdraws() {
        int total = 0;
        for (CashMachine listOfCashMachine : listOfCashMachines) {
            double[] listOfTransactions = listOfCashMachine.getListOfTransactions();
            for (double tempListOfTransaction : listOfTransactions) {
                if (tempListOfTransaction < 0)
                    total++;
            }
        }
        System.out.println("Dokonano " + total + " wypłat.");
    }
        public void getAverageOfDeposits(){
            int total = 0;
            double sum= 0;
            for (CashMachine listOfCashMachine : listOfCashMachines) {
                double[] listOfTransactions = listOfCashMachine.getListOfTransactions();
                for (double tempListOfTransaction : listOfTransactions) {
                    if (tempListOfTransaction > 0) {
                        total++;
                        sum += tempListOfTransaction;
                    }
                }
            }
            System.out.println("Średnia wpłata do bankomatu to " + (sum/total) + " PLN.");
        }
    public void getAverageOfWithdraws(){
        int total = 0;
        double sum= 0;
        for (CashMachine listOfCashMachine : listOfCashMachines) {
            double[] listOfTransactions = listOfCashMachine.getListOfTransactions();
            for (double tempListOfTransaction : listOfTransactions) {
                if (tempListOfTransaction < 0) {
                    total++;
                    sum += tempListOfTransaction;
                }
            }
        }
        System.out.println("Średnia wypłata z bankomatu to " + (sum/total) + " PLN.");
    }

}
