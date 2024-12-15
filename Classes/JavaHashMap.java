package Classes;
import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {

    HashMap<String, String> capitalCities = new HashMap <String, String>();

    capitalCities.put("England","London");
    capitalCities.put("Philippines","Manila");
    capitalCities.put("Japan","Tokyo");
    capitalCities.put("USA","LA California");
    System.out.println(capitalCities);


   
    System.out.println( capitalCities.get("Japan"));

    //capitalCities.remove("England");
    //System.out.println(capitalCities);

    /*capitalCities.clear();
    System.out.println(capitalCities);*/

    System.out.println(capitalCities.size());


    for (String a : capitalCities.keySet()) {

        System.out.println(a);

    }

    for (String b : capitalCities.values()) {

        System.out.println(b);

    }


    


    }
}
