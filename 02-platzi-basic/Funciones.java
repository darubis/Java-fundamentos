public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        double area = circleArea(y);
        System.out.println(area);

        sphereArea(y);

        sphereVolume(y);

        System.out.println("Pesos a dolares: " + convertToDollar(200, "MXN"));

        System.out.println("Pesos a dolares: " + convertToDollar(200, "COP"));
    }

    // Las funciones deben de vivir al nivel de las clases
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo esta validado para MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * **/
    public static double convertToDollar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return  quantity;
    }
}