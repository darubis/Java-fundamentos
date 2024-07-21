public class App {
    public static void main(String[] args) throws Exception {

        // if else  else if
        int age = 18;

        if (age > 18 && age <= 60){
            System.out.println("You can enter");
        }else if(age > 60){
            System.out.println("You can't enter, it is not for old people");
        }else if(age == 18){
            System.out.println("You are also allowed");
        
        }else{
            System.out.println("YOU CAN'T ENTER");
        }

    }
}

