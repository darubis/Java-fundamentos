public class DoWhile {

    public static void main(String[] args){
        int i = 1000;

        do{
            System.out.println(i);
            i-=200;
        }while (i >= 0); // 1000 800 600 400 200 0

    }
}