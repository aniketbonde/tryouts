import java.util.HashMap;
import java.util.Map;

public class AlphabetOccurances {
    public static void main(String[] args) {
        String sample = "bbbbddaaaayyyyy";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < sample.length(); i++) {
            String a = String.valueOf(sample.charAt(i));
            if(map.containsKey(a)){
                int c = map.get(a);
                map.put(a, c+1);
            }else{
                map.put(a, 1);
            }
        }
        System.out.println(map);
    }
}
