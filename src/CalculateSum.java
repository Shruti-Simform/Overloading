public class CalculateSum {
    //                  ----- CONSTRUCTOR OVERLOADING -----
    CalculateSum(){
        System.out.println("--- Calculate Sum ---");
    }
    CalculateSum(int a, int b){
        System.out.println("--- Calculate Sum of 2 integers ---");
    }
    CalculateSum(double a, double b){
        System.out.println("--- Calculate Sum of 2 double numbers ---");
    }
    CalculateSum(int a, double b){
        System.out.println("--- Calculate Sum of an integer and a double number ---");
    }
    CalculateSum(double a, int b){
        System.out.println("--- Calculate Sum of a double number and an integer ---");
    }



    //                  ----- THREE WAYS OF METHOD OVERLOADING -----

    //CHANGE IN NUMBER OF ARGUMENTS
    int addition(int a, int b){
        return a+b;
    }
    int addition(int a, int b, int c){
        return  a+b+c;
    }

    //CHANGE IN DATATYPE
    double addition(double a, double b){
        return a+b;
    }

    //CHANGE IN ORDER OF DATATYPE
    double addition(int a, double b){
        return a+b;
    }
    double addition(double a, int b){
        return a+b;
    }
}
