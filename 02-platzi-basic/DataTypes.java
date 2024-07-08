public class DataTypes {
    public static void main(String[] args) {
        byte numeroMuyPequeño = 100; // Entero entre -128 e 127
        short numeroPequeño = 25000; //  Entero entre -32768 y 32767
        int numero = 1000000; // Entero entre -2.147.483.648 y 2.147.483.647
        long numeroMasGrande = 2000000000L; // Entero entre -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807
        float decimalPequeño = 15.6666F; // Decimal de 4 bytes
        double decimal = 15.269899; // Decimal de 8 bytes

        // apartir de java 10 podemos utilizar var para declarar variables y java infiere el tipo de datos
        var salary = 11;
        // la pension es el 3% de lo que gane
        var pension = salary * 0.03;
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);


        // inferencia con cadenas
        var employeeName = "Anahi Salgado";
        System.out.println("Employee: " + employeeName + " Salary: " + totalSalary);
    }
}
