public class Grades {
    private int[] grades;
    private int size;
    private double average;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.average = 0;

    }
    public void add(int value) {
        if (this.size ==10) {
            return;
        }
        else if (value <= 0 || value > 6){
            System.out.println("Taka ocena nie istnieje. Spróbuj ponownie dodać ocenę.");
            return;
        }
        this.grades[this.size]= value;
        this.size++;

    }
    public void lastGrade(){
        System.out.println(this.grades[this.size - 1]);

    }
    public void aritmeticAverage(){

    double sum = 0;
    for (int i =0; i < this.size; i++){
        sum = sum + this.grades[i];
        }
    this.average = sum/this.size;
        System.out.printf("%.2f",this.average);

    }
}
