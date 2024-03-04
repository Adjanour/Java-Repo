import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class hashsetPracticals {
    public static void main(String[] args) {

        Set <Integer> stdAges = new HashSet<Integer>();
        Set <Double> stdMarks = new HashSet<Double>();
        HashSet<Double> stdMarks1 = new HashSet<Double>();

        for (int i = 0; i < 100; i++) {
            stdAges.add((int) Utils.toDecimalPlace(Math.random()*100, 2));
        }

        String[] names = {"Kirk","John","James","Bernard","Esi","Ama"};
        String[] otherNames = {"Kirk","John","James","Bernard","Esi","Ama","Kojo","Benjamin","Andy","Evans","David"};
//        String[] otherNames2 = {"Yaw","Kwame","Peter","Paul","John"};
        String[] otherNames2 = {"Yaw","Kwame","Peter","Paul"};


        HashSet<String> stdNames = new HashSet<String>(Arrays.asList(names));
        HashSet<String> stdNames2 = new HashSet<String>(Arrays.asList(otherNames));
        HashSet<String> stdNames3 = new HashSet<String>(Arrays.asList(otherNames2));

        //Union
//        System.out.println("Before union modification");
//        System.out.println(stdNames);
//        stdNames.addAll(stdNames2);
//        System.out.println("After modification");
//        System.out.println(stdNames);

        //Intersection
        System.out.println("Before intersection");
        System.out.println(stdNames);
        System.out.println(stdNames3);
        stdNames.retainAll(stdNames3);
        System.out.println("After intersection");
        System.out.println(stdNames);

        //Returns null set if there is no common elements
        //undo works with the enter key


        //Set difference
//        System.out.println("Before difference");
//        System.out.println(stdNames);
//        System.out.println(stdNames3);
//        stdNames.removeAll(stdNames3);
//        System.out.println("After difference");
//        System.out.println(stdNames);


//        stdAges.add(25);
//        stdAges.add(2);
//        stdAges.add(100);
////        stdAges.add(23);
////        stdAges.add(10);
////        stdAges.add(23);


//        System.out.println(stdAges);
    }
}
