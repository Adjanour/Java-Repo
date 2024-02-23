public class Quiz3 {
    public static void main(String[] args) {
        for (int i = 30; i < 61 ; i++) {
            if((i%4==0)^(i%3==0)){
                System.out.println(i);
            }
        }
    }
}
