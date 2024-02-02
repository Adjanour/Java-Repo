public class EqualityRelationalOperators {
    //integers are comparable by value
    public static void main(String[] args) {
        int a = 20;
        int b = 31;
        //EQUALITY
        System.out.print("Is "+a+" not equal to "+b+"? ");
        System.out.println(a != b);

        //RELATIONAL OPERATORS
        System.out.print("Is "+a+" less than "+b+"? ");
        System.out.println(a < b);

        System.out.print("Is "+a+" greater than "+b+"? ");
        System.out.println(a > b);

        System.out.print("Is "+a+" less than or equal to "+b+"? ");
        System.out.println(a <= b);

        System.out.print("Is "+a+" greater than or equal to "+b+"? ");
        System.out.println(a >= b);

        //TERNARY OPERATOR ? -for a one line if else statement
        int X = a < b ? 40 : 80 ;

        System.out.println(X);

    }
}
