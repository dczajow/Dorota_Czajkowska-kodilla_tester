import java.sql.SQLOutput;

public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if(this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    /* public void checkWeight() {
       if (this.weight.equals("600g")) {
            System.out.println("This notebook is very light.");
        } else if(this.weight == "2000g") {
            System.out.println("This notebook is damn heavy.");
        }
        else {
            System.out.println("This notebook is rather light.");
        }
    }

    public void yearVsPrice() {
        if(this.year <2020 && this.price < 1000) {
            System.out.println("It has been released a while ago but it is afordable");
        } else if(this.year <2020 && this.price > 1000) {
            System.out.println("It has been released a while ago, yet it is quite expensive");
        } else if(this.price < 1000){
            System.out.println("It is a latest release. Great price");
        } else {
            System.out.println("It is a latest release. Quite expensive though.");
        }
    }*/
}