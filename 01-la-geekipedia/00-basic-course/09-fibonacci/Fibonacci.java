public class Fibonacci {
    public static void main(String[] args){
        int a = 0, b = 1, c = 0;

        System.out.println("Serie con el cliclo for");
        for(int i = 0; i < 10; i++){
            if (i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
        }

        a = 0;
        b = 1;
        c = 0;
        int i = 0;
        System.out.println("");

        System.out.println("Serie con el cliclo while");
        while (i < 10) {
            if (i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
            i++;
        }

        a = 0;
        b = 1;
        c = 0;
        i = 0;
        System.out.println("");
        System.out.println("Serie con el ciclo do-while");
        do{
            if (i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
            i++;
        }while(i < 10);

    }
}
