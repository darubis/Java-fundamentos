public class Ejercicio {
    public static void main(String[] args){
        int i = 0;

        System.out.println("Serie con cliclo for");
        for(i = 1; i <= 10;i++){
            if (i < 10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
        }

        i = 1;
        System.out.println("");

        System.out.println("Serie con el ciclo while");

        while (i <= 10) {
            if (i < 10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
            i++;
        }

        i = 1;
        System.out.println("");

        System.out.println("Serie con do-while:");
        do{
            if (i < 10){
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
            i++;
        }while(i <= 10);



    }
}
