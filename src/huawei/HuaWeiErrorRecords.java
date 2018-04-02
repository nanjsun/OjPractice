package huawei;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.HashMap;
        import java.util.LinkedHashMap;
        import java.util.LinkedList;
        import java.util.List;
        import java.util.Map;
        import java.util.Map.Entry;
        import java.util.Scanner;

public class HuaWeiErrorRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Map<String, Integer> map = new LinkedHashMap<String, Integer>();//LinkedHashMap而不是hashmap！！！！！
String key;
String filename;
        String path;
        while(in.hasNext()){
            path = in.next();
            int id = path.lastIndexOf('\\');
            filename = id<0 ? path : path.substring(id+1);
            int linenum = in.nextInt();
            key = filename+" "+linenum;
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
                }else{

                map.put(key, 1);
            }
        }
        in.close();

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
                return(arg1.getValue()-arg0.getValue()) == 0? (arg0.getValue()-arg1.getValue()) : (arg1.getValue()-arg0.getValue());

            }
        });
        //只输出前8条
         int m=0;
         for(Map.Entry<String, Integer> mapping : list){
             m++;
             if(m<=8){
                 String[] str = mapping.getKey().split(" ");
                 String k = str[0].length()>16 ? str[0].substring(str[0].length()-16) : str[0];
                 String n = str[1];
                 System.out.println(k+" "+n+" "+mapping.getValue());
             }else{
                 break;
             }
         }
    }

}