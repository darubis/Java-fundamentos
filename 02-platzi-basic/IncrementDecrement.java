public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        // incremento posfijo
        lives--;
        System.out.println(lives); // 3

        lives++;
        System.out.println(lives); // 4

        // incremento prefijo
        // gana un regalo por ganar una vida
        // cuando utilizamos posfijo, primero se accede al dato y hace lo que tenga que hacer
        int gift = 100 + lives++;
        System.out.println(gift); // 104
        System.out.println(lives);
    }
}

