public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Area of the circle with radius 10 equals: " + area);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);

    }

    }
