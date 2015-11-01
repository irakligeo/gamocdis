import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by GeoLab on 10/25/15.
 */
public class amocana5 {
    public static void main (String[]args){
        HashMap<String, String> map1;
        HashMap<String, String> map2;

        map1 = new HashMap<>();
        map2 = new HashMap<>();

        map1.put("zamtari","civi");
        map1.put("tevzi","shebolili");
        map1.put("qatami","shemwvari");

        map2.put("qatami","shemwvari");
        map2.put("tevzi","shebolili");
        map2.put("zamtari","cxeli");
        System.out.println(commonKeyValuePairs(map1,map2));

    }
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2){
        int counter = 0;
        Iterator iterator1 = map1.keySet().iterator();

        while(iterator1.hasNext()){
            String key1 = (String) iterator1.next();
            String value1 = map1.get(key1);
            Iterator iterator2 = map2.keySet().iterator();
            while (iterator2.hasNext()) {
                String key2 = (String) iterator2.next();
                String value2 = map2.get(key2);
                if (key1.equals(key2) && value1.equals(value2)){
                    counter++;
                }
            }
        }

        return counter;

    }
}