public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 900, 2018);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.yearVsPrice();

        Notebook heavyNotebook = new Notebook("2000g", 1500, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.yearVsPrice();

        Notebook oldNotebook = new Notebook("1600g", 500, 2019);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.yearVsPrice();

    }
}