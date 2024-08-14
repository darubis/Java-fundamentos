import javax.swing.*;  // Importa la biblioteca Swing para la creación de interfaces gráficas en Java.

public class Interfaz extends JFrame {

    // Declaración de un componente JLabel que mostrará texto en la ventana.
    private JLabel label1;

    // Constructor de la clase Interfaz.
    public Interfaz() {
        // Establece el layout como null, permitiendo posicionar los componentes de forma absoluta.
        setLayout(null);

        // Inicializa el JLabel con el texto "La geekipedia de ernesto".
        label1 = new JLabel("La geekipedia de ernesto");

        // Establece la posición y el tamaño del JLabel: (x, y, ancho, alto).
        label1.setBounds(10, 20, 200, 300);

        // Añade el JLabel al JFrame para que sea visible en la ventana.
        add(label1);
    }

    // Método principal que ejecuta la aplicación.
    public static void main(String[] args) { 
        // Crea una instancia de la clase Interfaz, lo que genera la ventana.
        Interfaz interfaz1 = new Interfaz();

        // Establece las dimensiones y la posición de la ventana: (posición x, posición y, ancho, alto).
        interfaz1.setBounds(0, 0, 400, 300);

        // Hace visible la ventana en la pantalla.
        interfaz1.setVisible(true);

        // Centra la ventana en la pantalla, independiente de la resolución del monitor.
        interfaz1.setLocationRelativeTo(null);
    }
}