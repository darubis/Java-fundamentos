public class App {
    public static void main(String[] args) throws Exception {

        // switch
        // What kind of drink do you like?

        String drink = "vino";

        switch (drink) {
            case "coffe":
                System.out.println("Very good, it combines with sergie code course");
                break;
            case "mate":
                System.out.println("you must be Argentine, Uruguayan or Paraguayan, good choice!");
                break;
            case "gaseosa":
                System.out.println("be careful");
                break;
            case "vino":
                System.out.println("Please, don't drive");
                break;
            default:
                System.out.println("enjoy your drink!");
                break;
        }

       /*if (drink == "coffee"){
            System.out.println("Very good, it combines with sergie code course");
        }else if (drink == "mate"){
            System.out.println("you must be Argentine, Uruguayan or Paraguayan, good choice!");
        }else if (drink == "gaseosa"){
            System.out.println("be careful");
        }else if( drink == "vino"){
            System.out.println("Please, don't drive");
        }else{
            System.out.println("enjoy your drink!");
        }*/

        

    }
}

