
public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void checkLast() {
        int i = this.size - 1;
        System.out.println("Ostatnia dodana ocena: " + this.grades[i]);
    }

    public void average() {
        int result = 0;
        for (int i = 0; i < this.grades.length; i++) {
            result = result + grades[i]; }

        double avrgGrades = result / this.grades.length;
        System.out.println("Srednia ocen : " + avrgGrades);
    }



    public static void main(String[] args) {
        Grades myScoresheet = new Grades();
        myScoresheet.add(5);
        myScoresheet.add(4);
        myScoresheet.add(3);
        myScoresheet.add(4);
        myScoresheet.add(6);
        myScoresheet.add(5);
        myScoresheet.add(4);
        myScoresheet.add(3);
        myScoresheet.add(4);
        myScoresheet.add(6);
        myScoresheet.add(2);

        System.out.println(myScoresheet.grades.length);
        myScoresheet.checkLast();

        myScoresheet.average();






    }
}