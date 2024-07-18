public class Exercise2 {
    public static void main(String[] args) {
        // a. char c = ‘z’; conviertelo a int
        char c = 'z';
        int cInt = (int) c; // Casting explícito
        System.out.println("char 'z' convertido a int: " + cInt); // exactitud

        // b. int i = 250; conviertelo a long y luego de long a short
        int i1 = 250;
        long iLong = i1; // Casting implícito
        short iShort = (short) iLong; // Casting explícito
        System.out.println("int 250 convertido a long: " + iLong); // exactitud
        System.out.println("long 250 convertido a short: " + iShort); // exactitud

        // c. double d = 301.067; conviertelo a long
        double d1 = 301.067;
        long dLong = (long) d1; // Casting explícito
        System.out.println("double 301.067 convertido a long: " + dLong); // estimación

        // d. int i = 100; súmale 5000.66 y conviertelo a float
        int i2 = 100;
        float sumFloat = i2 + 5000.66F; // Casting implícito
        System.out.println("int 100 + 5000.66 convertido a float: " + sumFloat); // exactitud

        // e. int i = 737; multiplícalo por 100 y conviertelo a byte
        int i3 = 737;
        int result = i3 * 100;
        byte resultByte = (byte) result; // Casting explícito
        System.out.println("int 737 * 100 convertido a byte: " + resultByte); // estimación

        // f. double d = 298.638; divídelo entre 25 y conviertelo a long
        double d2 = 298.638;
        double divResult = d2 / 25;
        long divLong = (long) divResult; // Casting explícito
        System.out.println("double 298.638 / 25 convertido a long: " + divLong); // estimación
    }
}
