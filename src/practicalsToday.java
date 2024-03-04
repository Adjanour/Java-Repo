public class practicalsToday {
    public static void main(String[] args) {
        math(10,20);
    }

    public static void math(int num1, int num2){
        System.out.println("Math Operations");
        System.out.println(num1 +" + "+num2+" = "+(num1+num2));
        System.out.println(num1 +" - "+num2+" = "+(num1-num2));
        System.out.println(num1 +" / "+num2+" = "+((double)num1/num2));
        System.out.println(num1 +" * "+num2+" = "+(num1*num2));
        System.out.println(num1 +" % "+num2+" = "+(num1%num2));
    }
}
