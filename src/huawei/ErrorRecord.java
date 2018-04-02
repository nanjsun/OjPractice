package huawei;

import java.util.*;

/**
 * test class
 *
 * @author nanj
 * @date 2018/3/29
 */
public class ErrorRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> error = new TreeMap<>();
        int x = 0;
        while (scanner.hasNext() && x < 50) {
            x++;
            String fileName = null;

            int lineNumber = 0;
            if(scanner.hasNext()) {
                fileName = scanner.next();
            }
            if(scanner.hasNextInt()) {
                lineNumber = scanner.nextInt();
            }
            String key = fileName + " " + lineNumber;

            if(error.containsKey(key)) {
                error.replace(key, error.get(key) + 1);
            } else {
                error.put(key, 1);
            }
        }
        scanner.close();
        valueUpSort(error);
    }

    public static void valueUpSort(Map<String, Integer> map) {

        // 升序比较器
        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                // TODO Auto-generated method stub
                return -o1.getValue()+o2.getValue();
            }
        };

        // map转换成list进行排序
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

        // 排序
        Collections.sort(list,valueComparator);

        for (Map.Entry<String, Integer> entry : list) {

            String[] ar = entry.getKey().split("\\\\");
            String keyValue = ar[ar.length -1];

            System.out.println(keyValue + " " + entry.getValue());
        }
    }
}
