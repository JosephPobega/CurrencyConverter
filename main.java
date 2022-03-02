import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int currencyChoice, choice1, choice2;
        double amount, peso, ruble, yen, output;
        Scanner input = new Scanner(System.in);
        for(;;){
        System.out.println("Select a currency:");
        System.out.println("-----------------");
        System.out.println("1.)Mexican Peso");
        System.out.println("2.)Russian Ruble");
        System.out.println("3.)Japanese Yen");
        currencyChoice = input.nextInt();

        if(currencyChoice == 1){
            System.out.println("How much?");
            amount = input.nextInt();
            output = amount  * 20.65;
            System.out.println("\n$" + amount + " is");
            System.out.println(output + " Mexican Peso(s)\n");
        }
        else if(currencyChoice == 2){
            System.out.println("How much?");
            amount = input.nextInt();
            output = amount  * 110.26;
            System.out.println("\n$" + amount + " is");
            System.out.println(output + " Russian Ruble\n");
        }
        else if(currencyChoice == 3){
            System.out.println("How much?");
            amount = input.nextInt();
            output = amount  * 115.04;
            System.out.println("\n$" + amount + " is");
            System.out.println(output + " Japanese Yen\n");
        }
        else if(currencyChoice != 1 || currencyChoice != 2 || currencyChoice != 3){
            System.out.println("\nWrong input, try again.\n");
        }
       
    }
}
}
