public class App {
    public static void main(String[] args) throws Exception {
        String text  = "This is a text assigned to a string variable";
        System.out.println(text);

        // count the number of characters in a string
        int longs = text.length();
        System.out.print(longs);

        // get a specify character
        char caracter = text.charAt(0);
        System.out.println(caracter);

        // cut an specify amount of characters
        String subString = text.substring(5,14); // is a text
        System.out.println(subString);

        // convert into lower case 
        String lower = text.toLowerCase();
        System.out.println(lower);

        // conver into upper case
        String upper = text.toUpperCase();
        System.out.println(upper);

        // get an index where a specify word start
        int index = text.indexOf("variable");
        System.out.println(index);

        // replace a word
        String replaced = text.replace("text", "paragraph");
        System.out.println(replaced);

        boolean contained = text.contains("assigne");
        System.out.println("Do you have the word assigne? " + contained);

        // delete spaces at the beginning and at the end
        String withoutSpaces = text.trim();
        System.out.println(withoutSpaces);

    }
}

