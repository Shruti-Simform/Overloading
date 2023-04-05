public class Main {
    public static void main(String[] args) {
        int res;
        double result;

        CalculateSum c1 = new CalculateSum(2, 3);
        res = c1.addition(2, 3);
        System.out.println("Addition of 1 and 2 : " + res + "\n");

        CalculateSum c2 = new CalculateSum(1.1, 2.2);
        result = c2.addition(1.1, 2.2);
        System.out.println("Addition of 1.1 and 2.2 : " + String.format("%.2f", result) + "\n");

        CalculateSum c3 = new CalculateSum(1, 2.2);
        result = c3.addition(1, 2.2);
        System.out.println("Addition of 1 and 2.2 : " + result + "\n");

        CalculateSum c4 = new CalculateSum(1.1, 2);
        result = c4.addition(1.1, 2);
        System.out.println("Addition of 1.1 and 2 : " + result + "\n");
    }
}