
//10 ocen ucznia. Klasa powinna zawierać 3 metody:
//
//dodającą przekazaną w argumencie ocenę do tablicy,
//zwracającą ostatnio dodaną ocenę,
//zwracającą średnią ocen.

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
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }
        int avrgGrades = result / grades.length;

        System.out.println("Grades' average: : " + avrgGrades);
    }

    public static void main(String[] args) {



    }
}