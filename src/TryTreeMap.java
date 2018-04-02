import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/27
 */
public class TryTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> testMap = new LinkedHashMap<>();

        testMap.put("bb", 1);
        testMap.put("aa", 3);
        testMap.put("cc", 2);

        for(Map.Entry<String, Integer> entry: testMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
