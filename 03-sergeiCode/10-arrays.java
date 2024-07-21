public class App {
    public static void main(String[] args) throws Exception {

        /*Arrays: Data structures that have values ​​of the same type under the same name, these values
        ​​are distributed sequentially in memory and can be accessed through an index, arrays are also 
        called vectors or matrices.
        */

        // first way to make an array

        /*int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;*/

        int[] numbers = {10,20,30,40,50};

        // foreach
        // an element of arrays
        for (int number : numbers){
            System.out.println(number);
        }
        

        // traditional for

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        
        String word = "Alphabet";
        // here we use length with parentheses
        System.out.println(word.length());
    }
}

