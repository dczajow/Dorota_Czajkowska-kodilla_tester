public class Application {

        public static void main(String[] args) {
            Person person = new Person("Adam", 40.5, 178);
            PersonValidator personValidator = new PersonValidator(person);

            System.out.println("I am " + person);
            if (personValidator.validateName()) {
                if (personValidator.validateAge(30) && personValidator.validateHeight(160)) {
                    System.out.println("User is older than 30 and higher then 160cm");
                } else {
                    System.out.println("User is younger than 30 or lower than 160cm");
                }
            } else {
                System.out.println("Person without name");
            }
        }

    }

    class PersonValidator {

        private Person person;

        public PersonValidator(Person person) {
            this.person = person;
        }

        public boolean validateName() {
            return person.getName() != null;
        }

        public boolean validateAge(double age) {
            return person.getAge() > age;
        }

        public boolean validateHeight(double height) {
            return person.getHeight() > height;
        }
    }

    class Person {
        private String name;
        private double age;
        private double height;

        public Person(String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public double getAge() {
            return age;
        }

        public double getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return this.name + ": age = " + this.age + ", height  = " + this.height;
        }
    }
