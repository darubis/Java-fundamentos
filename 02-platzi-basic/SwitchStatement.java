public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste light mode");
                break;
            case "Night":
                System.out.println("Seleccionaste night mode");
                break;
            case "BlueDark":
                System.out.println("Seleccionaste blue dark mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion que sea correcta");
        }
    }
}