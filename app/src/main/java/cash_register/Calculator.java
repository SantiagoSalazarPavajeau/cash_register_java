package cash_register;

public class Calculator {
    
    public static double total = 0;
 //add
    public static double add(double a) {
        total += a;
        return total;
    }

//subtract
    public static double minus(double a){
        total -= a;
        return total;
    }

//multiply
    public static double times(double a) {
        total *= a;
        return total;
    }

// divide 
    public static double divide(double a){
        total /= a;
        return total;
    }
    
}

