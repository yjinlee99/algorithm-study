import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            String s = bf.readLine();
            String[] result = s.split("\\.");

            if(map.containsKey(result[1])){
                map.put(result[1], map.get(result[1])+1);
            }
            else map.put(result[1], 1);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(map);
        for( String key : sortedMap.keySet() ){
            System.out.println(key + " " + sortedMap.get(key));
        }
    }
}
