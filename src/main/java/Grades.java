
public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        grades = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == 10) {
            return;
        }
        grades[size] = value;
        size++;
    }

    public void checkLast() {
        int i = size - 1;
        System.out.println("Ostatnia dodana ocena: " + grades[i]);
    }

    public void average() {
        double result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }

        double avrgGrades = (double) result / size;
        System.out.println("Srednia ocen : " + avrgGrades);
    }

    public static void main(String[] args) {
        Grades myScoresheet = new Grades();
        myScoresheet.add(5);
        myScoresheet.add(3);
        myScoresheet.add(6);

        System.out.println(myScoresheet.size);
        myScoresheet.checkLast();

        myScoresheet.average();
    }
}