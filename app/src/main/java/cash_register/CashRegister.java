package cash_register;
import java.util.Scanner;

public class CashRegister {

    public static void start(){
        Calculator calculator = new Calculator();

        Scanner input = new Scanner(System.in);
        double output = 0;
        
        String operator;

        while(true){
            System.out.print("Enter an operator (pay, scan): ");
            operator = input.nextLine(); 

            switch(operator) {
                case "scan":
                    System.out.print("Enter item's price: ");
                    double number = input.nextDouble();
        
                    System.out.println("You entered " + number);
                    
                    output = calculator.add(number);
                    System.out.println("current total is: " + output);

                    break;
                case "pay":
                    System.out.print("Enter the amount customer paid: ");
                    double paid = input.nextDouble();
                    output = calculator.minus(paid);

                    System.out.print("Give " + output * -1 + " dollars change back");
                    input.close();
                    break;
            }

            operator = input.nextLine(); 

        }
    }
    public static void main(String[] args) {

    }

}
