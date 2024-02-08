public class loops {
    public static void main(String[] args) {
//        int count = 1;
//        while (count < 6){
//            System.out.println(2 * count);
//            count++;
//        }
        int foundCount = 1;
        int loopCon = 1;

        while(foundCount < 21){
            if ((loopCon % 3 == 0) && (loopCon % 7 == 0)){
                System.out.println(loopCon);
                foundCount++;
            }
            loopCon++;
        }

    }
}
