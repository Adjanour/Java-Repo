import java.util.ArrayList;

import static java.lang.System.out;

public class PractArrayList {
    public static void main(String[] args) {

        ArrayList<Double> newArray = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if ((i%3==0) && (i%4==0))
                newArray.add(i*1.0);
        }

        out.println(newArray);

        for(Double number : newArray){
            out.println(number);
        }
        out.println(newArray.remove(96.0)?"removed":"not removed");
    }
}
