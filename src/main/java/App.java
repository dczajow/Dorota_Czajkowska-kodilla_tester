class Person {
    String name;
    double age;
    double height;

    void speak(double age, double height) {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }

}
public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Adam";
        person1.speak(40.5, 178);


        }
    }

