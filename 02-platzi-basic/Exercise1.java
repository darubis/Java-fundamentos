public class Exercise1 {
    public static void main(String[] args) {
        // Padre
        String nombrePadre = "Juan";
        int edadPadre = 50;
        double alturaPadre = 1.75;
        boolean padreTrabaja = true;

        // Madre
        String nombreMadre = "María";
        int edadMadre = 48;
        double alturaMadre = 1.65;
        boolean madreTrabaja = true;

        // Hermano
        String nombreHermano = "Carlos";
        int edadHermano = 20;
        double alturaHermano = 1.80;
        boolean hermanoEstudia = true;

        // Hermana
        String nombreHermana = "Ana";
        int edadHermana = 18;
        double alturaHermana = 1.70;
        boolean hermanaEstudia = true;

        // Mascota
        String nombreMascota = "Max";
        int edadMascota = 5;
        double pesoMascota = 12.5;
        char tipoMascota = 'P'; // P para perro, G para gato, etc.

        // Presentación
        System.out.println("Familia:");
        System.out.println("Padre: " + nombrePadre + ", Edad: " + edadPadre + ", Altura: " + alturaPadre + "m, Trabaja: " + padreTrabaja);
        System.out.println("Madre: " + nombreMadre + ", Edad: " + edadMadre + ", Altura: " + alturaMadre + "m, Trabaja: " + madreTrabaja);
        System.out.println("Hermano: " + nombreHermano + ", Edad: " + edadHermano + ", Altura: " + alturaHermano + "m, Estudia: " + hermanoEstudia);
        System.out.println("Hermana: " + nombreHermana + ", Edad: " + edadHermana + ", Altura: " + alturaHermana + "m, Estudia: " + hermanaEstudia);
        System.out.println("Mascota: " + nombreMascota + ", Edad: " + edadMascota + ", Peso: " + pesoMascota + "kg, Tipo: " + tipoMascota);
    }
}
