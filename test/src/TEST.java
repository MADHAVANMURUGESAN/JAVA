import java.util.*;
import java.util.stream.Collectors;

public class TEST {
    public static void main(String[] args) {
        Map<String, Object> mainObject = new HashMap<>();
        mainObject.put("Message", "successfully retrieved a data.");
        mainObject.put("Status", "Success");

        Map<String, String> subMap1 = new HashMap<>();
        subMap1.put("Name", "Madhavan");
        subMap1.put("ApptNumber", "2433");
        subMap1.put("Time", "2 to 4");

        Map<String, String> subMap2 = new HashMap<>();
        subMap2.put("Name", "Ashok");
        subMap2.put("ApptNumber", "4333");
        subMap2.put("Time", "4 to 5");

        List<Map<String, String>> listMap = new ArrayList<>();
        listMap.add(subMap1);
        listMap.add(subMap2);

        mainObject.put("data", listMap);
        System.out.println("mainObject: " + mainObject);
        List<String> nameList = Arrays.asList("Suresh", "Jeeva");
        List<String> nameLists = nameList.stream()
                .filter(a -> a.equalsIgnoreCase("suresh"))
                .collect(Collectors.toList());

    }

}
