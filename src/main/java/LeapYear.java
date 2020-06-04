public class LeapYear {
    public static void main(String[] args) {
        int Year = 1329;
        String leapYear = " was a leap year.";
        String notALeapYear = " was not a leap year.";


        System.out.print(Year);

        if (Year%4 != 0) {
            System.out.println(notALeapYear);
        } else {
            if (Year%100 != 0) {
                System.out.println(leapYear);
            } else {
                if (Year % 400 == 0) {
                    System.out.println(leapYear);
                } else {
                    System.out.println(notALeapYear);

                }
            }
        }
    }
}
