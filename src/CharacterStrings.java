public class CharacterStrings {
    public static void main(String[] args) {
        //Escape sequences in java
        System.out.println("\tHe is soo good");
        System.out.println("test tab \ttab");
        System.out.println("test newline \ncheck");
        System.out.println("test \"check\"");

        //CASTING CHARACTERS AS NUMBERS
        //WHAT CHARACTERS SOME NUMBERS REPRESENT
        //WHAT Character coding scheme is being used here
        System.out.println("5256 reps char: " + (char)5256);
        System.out.println((char)1069);
        System.out.println((char)20002);

        //Finding what numbers characters are stored
        System.out.println(("' ' stored as num: " +(int)' '));
        System.out.println(("'a' stored as num: " +(int)'a'));
        System.out.println(("'A' stored as num: " +(int)'A'));
        System.out.println("'1' stored as num: " +(int)'1');
        System.out.println("'2' stored as num: " +(int)'2');
        System.out.println("'?' stored as num: "
                +(int)'?');

        char letter = 'A';
        char number = '9';

        System.out.println(Character.isDigit(letter));
        System.out.println(Character.isDigit(number));
        Character.toUpperCase(letter);
        System.out.println(Character.digit(number, 2));
        Character.toLowerCase(letter);



        String name = "John";
        System.out.println(name.length());
        System.out.println();

        name.compareTo("John");
    }
}
