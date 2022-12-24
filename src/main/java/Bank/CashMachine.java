package Bank;

public class CashMachine {
    private double[] listOfTransactions;
    private int size;

    public CashMachine() {
        this.listOfTransactions= new double[0];
        this.size = 0;
    }

    public void  addTransaction(double transaction){
        this.size++;
        double tempTransaction[] = new double[this.size];
        System.arraycopy(listOfTransactions,0,tempTransaction,0,listOfTransactions.length);
        tempTransaction[this.size -1] = transaction;
        this.listOfTransactions = tempTransaction;
    }

    public void getSaldoOfCashMachine(){
        double initialSaldo = 10000;
        double result = 0;
        for (double listOfTransaction : listOfTransactions) {
             result += listOfTransaction;
        }
        System.out.println("Saldo bankomatu wynosi obecnie: "+(initialSaldo+result)+" PLN.");
    }
    public  void getNumberOfTransactions(){
        int numberOfTransactions = listOfTransactions.length;
        System.out.println("W bankomacie dokonano " + numberOfTransactions + " transakcji.");
    }

    public double[] getListOfTransactions() {
        return listOfTransactions;
    }

    public int getSize() {
        return size;
    }
}
