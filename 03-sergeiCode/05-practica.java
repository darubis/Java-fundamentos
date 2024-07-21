import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // practica

        // ask for data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the drinks vending machine");
        System.out.println("Choose one of the following options: ");
        System.out.println("1 - coffee");
        System.out.println("2 - mate");
        System.out.println("3 - gaseosa");
        System.out.println("4 - vino");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Coffee, Very good, it combines with sergie code course");
                break;
            case 2:
                System.out.println("Mate, you must be Argentine, Uruguayan or Paraguayan, good choice!");
                break;
            case 3:
                System.out.println("Gaseosa, be careful");
                break;
            case 4:
                System.out.println("Vino, Please, don't drive");
                break;
            default:
                System.out.println("no valid option");
                break;
        }

        if (option <= 4){
            System.out.println("Enjoy your drink");
        }
        scanner.close();    

    }
}

