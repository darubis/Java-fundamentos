import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String nombre = "";
        int clave = 0, antiguedad = 0;

        System.out.println("*********************************************************");
        System.out.println("*Bienvenido al sistema vacacional de coca cola company*");
        System.out.println("*********************************************************");
        
        System.out.println("\n" + "\n");

        System.out.print("Cual es el nombre del trabajador?: ");
        nombre = entrada.nextLine();

        System.out.println("");

        System.out.print("Cuanto tiempo de servicio tiene el trabajador? ");
        antiguedad = entrada.nextInt();

        System.out.println("");

        System.out.print("Cual es la clave del trabajador? ");
        clave = entrada.nextInt();

        System.out.println("");


        if(clave == 1){
            if (antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 6 días de vacaciones");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 14 días de vacaciones");
            } else if(antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones");
            }
        
        } else if(clave == 2){
            if (antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 7 días de vacaciones");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 15 días de vacaciones");
            } else if(antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 22 días de vacaciones");
            }
        } else if(clave == 3){
            if (antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 10 días de vacaciones");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones");
            } else if(antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 30 días de vacaciones");
            }
        } else{
            System.out.println("Error, la clave de departamento es incorrecta!");
        }
        
    }
}