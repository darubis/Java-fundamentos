// video 25
import javax.swing.*;  // Importa la biblioteca de Java para la creación de interfaces gráficas (Swing).

// Clase principal que extiende de JFrame, lo que significa que esta clase es una ventana de la aplicación.
public class Interfaz1 extends JFrame {
    
    // Constructor de la clase Interfaz1.
    public Interfaz1() {
        setLayout(null);  // Establece el layout (diseño) de la ventana como "null", lo que permite colocar componentes en posiciones absolutas.
    }

    // Método principal, punto de entrada de la aplicación.
    public static void main(String[] args) {
        // Crea una instancia de la clase Interfaz1, es decir, una ventana.
        Interfaz1 interfaz1 = new Interfaz1();

        // Establece el tamaño y posición de la ventana: (posición x, posición y, ancho, alto).
        interfaz1.setBounds(350, 400, 800, 550);

        // Hace visible la ventana.
        interfaz1.setVisible(true);

        // Centra la ventana en la pantalla.
        interfaz1.setLocationRelativeTo(null);

        // Impide que el tamaño de la ventana sea ajustable por el usuario.
        interfaz1.setResizable(false);
    }
}