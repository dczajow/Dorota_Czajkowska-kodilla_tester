public class SimpleArray {
    public static void main(String[] args) {
String[] booksToRead = new String [6];
booksToRead[0] = "Dialog zamiast kar";
booksToRead[1] = "Nowe cyfrowe wychowanie";
booksToRead[2] = "Płomienna korona";
booksToRead[3] = "Mit pracy domowej";
booksToRead[4] = "Z nienawiści do kobiet";
booksToRead[5] = "Potęga kiedy";

        String booksTop3 = booksToRead[3];
        System.out.println(booksTop3);

        int numberOfElements = booksToRead.length;
        System.out.println(numberOfElements);
        System.out.println( "Moja tablica zawiera 6 elementów.");

    }

}