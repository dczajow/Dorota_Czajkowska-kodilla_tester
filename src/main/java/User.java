public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        User bond = new User("James Bond", 45);
        User bourne = new User("Jason Bourne", 38);
        User reacher = new User("Jack Reacher", 48);
        User hunt = new User("Ethan Hunt", 39);
        User ryan = new User("Jack Ryan", 46);
        User salt = new User("Evelyn Salt", 40);

        User[] users = {bond, bourne, reacher, hunt, ryan, salt};
        //int avrgAge = (Bond.age + Bourne.age + Reacher.age + Hunt.age + Ryan.age + Salt.age) / users.length;
        //System.out.println("Average age: " + avrgAge);

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        int avrgAge = result / users.length;

        System.out.println("Average age: " + avrgAge + "\nBelow the group average age are:");

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < avrgAge) {
                System.out.println(users[i].name);
            }
        }
    }
}