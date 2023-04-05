public class CalculateSum {
    CalculateSum() {
        System.out.println("--- Calculate Sum ---");
    }

    CalculateSum(int a, int b) {
        System.out.println("--- Calculate Sum of 2 integers ---");
    }

    CalculateSum(double a, double b) {
        System.out.println("--- Calculate Sum of 2 double numbers ---");
    }

    CalculateSum(int a, double b) {
        System.out.println("--- Calculate Sum of an integer and a double number ---");
    }

    CalculateSum(double a, int b) {
        System.out.println("--- Calculate Sum of a double number and an integer ---");
    }
    
    int addition(int a, int b) {
        return a + b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    double addition(double a, double b) {
        return a + b;
    }

    double addition(int a, double b) {
        return a + b;
    }

    double addition(double a, int b) {
        return a + b;
    }
}
