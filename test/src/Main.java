import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
     //static int num;
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("id", "madhavan");
        map1.put("Roll No", "152");
        Map<String, String> map2 = new HashMap<>();
        map2.put("id", "ravikumar");
        map2.put("Roll No", "252");
        List<Map<String, String>> mapList = new ArrayList<>();
        mapList.add(map1);
        mapList.add(map2);
        System.out.println("mapList: " + mapList);
        //int num;
        //System.out.println("mapList: " + num);
    }
}