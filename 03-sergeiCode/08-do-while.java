public class App {
    public static void main(String[] args) throws Exception {

        // for loop
        // for(incializacion; condicion; actualizacion)

        int counter = 1;

        do{
            System.out.println("This happens before the condition");
            System.out.println(counter);
            counter++;
        }while(counter <= 5);

        System.out.println(counter);
           
    }
}

