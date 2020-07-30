import java.util.Scanner;

public class Color {
        public static String  getColor() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("What is your favourite colour?\nA-auburn,\t B-black,\t C-citron,\nD-denim,\t E-ecru,\t F-fuchsia\nEnter your choice --> ");
                String colorFirstLetter = scanner.nextLine().trim().toUpperCase();
                switch (colorFirstLetter) {
                    case "A":
                        return "auburn";
                    case "B":
                        return "black";
                    case "C":
                        return "citron";
                    case "D":
                        return "denim";
                    case "E":
                        return "ecru";
                    case "F":
                        return "fuchsia";
                    default:
                        System.out.println("Choose one from the provided options. Try again.");
                }
            }

        }

    public static void main(String[] args) {
        Color color = new Color();
        String userColor = Color.getColor();
        System.out.println("The color you picked up: " + userColor);

    }
}