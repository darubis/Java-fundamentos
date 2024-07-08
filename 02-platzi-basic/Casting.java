public class Casting {
    public static void main(String[] args) {
        // En un ano ubicar 30 perritos
        // cuantos perritos ubique al mes
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        // Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        int y = 3;
        // Devuelve la raiz cuadrada
        System.out.println((int) Math.sqrt(y));

        // Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a / b);
    }
}

