import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hashmapPracticals {
    public static void main(String[] args) {

        Map<String, String> stdNames = new HashMap<>();

        stdNames.put("John", "John");
        stdNames.put("Kirk", "Kirk444");;
        stdNames.put("James", "James");
        stdNames.put("Bernard", "Bernard");

        System.out.println(stdNames);
        System.out.println( stdNames.keySet() );
       System.out.println(stdNames.get("Kirk"));

       String name = "This is my name";
      String[] a = name.split("/(.*? )/");

      System.out.println(Arrays.toString(a));

    }
}
