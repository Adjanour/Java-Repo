import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;

public class PractArrayList {
    public static void main(String[] args) {

        ArrayList<String> stdNames = new ArrayList<>();

        ArrayList<Double> newArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            newArray.add(Utils.toDecimalPlace(Math.random()*100, 2));
        }

        out.println(newArray);

        for(Double number : newArray){
            out.println(number);
        }
        out.println(newArray.remove(96.0)?"removed":"not removed");

        out.println(newArray.contains(96.0)?"found":"not found");

        out.println("before sorting");
        out.println(newArray);
        Collections.sort(newArray);
        out.println("sorting");
        Collections.sort(newArray);
        out.println(newArray);
    }
}
