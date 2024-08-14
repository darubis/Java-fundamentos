import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args){

        String usuario = "", contrasena = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario: ");
        usuario = entrada.nextLine();

        System.out.println("Ingresa tu contrasena: ");
        contrasena = entrada.nextLine();

        if(usuario.equals("Ernesto") && contrasena.equals("123")){
            System.out.println("Es correcta");
        }else{
            System.out.println("Usuario y contrasena incorrectos");
        }
    }
}
