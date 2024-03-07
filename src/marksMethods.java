public class marksMethods {
    public static void main(String[] args) {
        System.out.println(addLoop());
    }

    public static int addLoop() {
        int num = 0;

        for (int i=1; i < 101; i++){
            num += i;
            System.out.println(num);
        }
        return num;
    }

}