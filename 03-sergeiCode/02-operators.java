public class App {
    public static void main(String[] args) throws Exception {
        
        // Arithmetic Operators:
        int a = 10;
        int b = 5;
        System.out.println("\nArithmetic Operators: ");
        System.out.println("Sum: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--b));

        // Logical Operators:
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Assignment Operators:
        int c = 5;
        c += 3;
        System.out.println("\nAssignment Operators:");
        System.out.println("Assignment with addition: " + c);
        c -= 2;
        System.out.println("Assignment with subtraction: " + c);
        c *= 4;
        System.out.println("Assignment with multiplication: " + c);
        c /= 2;
        System.out.println("Assignment with division: " + c);
        c %= 3;
        System.out.println("Assignment with modulus: " + c);

        // Identity Operators:
        System.out.println("\nIdentity Operators:");
        String str = "Hello";
        Integer num = 0;
        System.out.println("Is it an instance of String? " + (str instanceof String));
        System.out.println("Is it an instance of int? " + (num instanceof Integer));

        // Membership Operators:
        System.out.println("\nMembership Operators:");
        int[] arr = {1, 2, 3, 4, 5};
        int val = 3;
        boolean belongs = false;
        for (int i : arr) {
            if (i == val) {
                belongs = true;
                break;
            }
        }
        System.out.println("Is the value " + val + " in the array? " + belongs);

        // Bitwise Operators:
        System.out.println("\nBitwise Operators:");
        int d = 5; // Binary representation: 101
        int e = 3; // Binary representation: 011
        System.out.println("Bitwise AND: " + (d & e));
        System.out.println("Bitwise OR: " + (d | e));
        System.out.println("Bitwise XOR: " + (d ^ e));
        System.out.println("Left shift: " + (d << 1));
        System.out.println("Right shift: " + (e >> 1));
        System.out.println("Unsigned right shift: " + (e >>> 1));

        System.out.println("\n\tExamples of control structures:");

    }
}

