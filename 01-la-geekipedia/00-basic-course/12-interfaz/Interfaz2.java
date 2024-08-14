// Video 26
import javax.swing.*;

// La clase Interfaz2 ahora extiende de JFrame
public class Interfaz2 extends JFrame {
    private JLabel label1;
    private JLabel label2;

    // Constructor de la clase Interfaz2
    public Interfaz2() {
        setLayout(null);  // Establece el layout como null para usar coordenadas absolutas.
        
        // Inicializa y configura el primer JLabel
        label1 = new JLabel("Interfaz gráfica.");
        label1.setBounds(10, 20, 300, 30);
        add(label1);  // Añade el JLabel a la ventana

        // Inicializa y configura el segundo JLabel
        label2 = new JLabel("Versión 1.0");
        label2.setBounds(10, 100, 100, 30);
        add(label2);  // Añade el JLabel a la ventana
    }

    public static void main(String[] args) {
        // Crea una instancia de la clase Interfaz2
        Interfaz2 interfaz2 = new Interfaz2();

        // Configura la ventana
        interfaz2.setBounds(0, 0, 300, 200);
        interfaz2.setResizable(false);
        interfaz2.setVisible(true);
    }
}