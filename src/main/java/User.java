public class User {
    String name;
    int age;

    int getAge() {
        return this.age;
    }

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User Bond  = new User("James Bond", 45);
        User Bourne = new User("Jason Bourne", 38);
        User Reacher = new User("Jack Reacher", 48);
        User Hunt = new User("Ethan Hunt", 42);
        User Ryan = new User("Jack Ryan", 36);
        User Salt = new User("Evelyn Salt", 40);

        User[] users = {Bond, Bourne, Reacher, Hunt, Ryan, Salt};

        int avrgAge = (Bond.age + Bourne.age + Reacher.age + Hunt.age + Ryan.age + Salt.age) / users.length;
        System.out.println(avrgAge);

        /* Za pomocą pętli for musimy z każdego obiektu typu User
        wyciągnąć wartość pola, w którym zapisany jest wiek,
        zsumować wszystkie te wartości, a na końcu sumę
        podzielić przez liczbę użytkowników (czyli przez długość tablicy,
         w której się znajdują).
         */



    }
}