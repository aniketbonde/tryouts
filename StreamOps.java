import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOps {
    public static void main(String[] args) {
        //numberOfOccurrenceFromList();
        duplicateOccurrenceFromList();
    }
    private static void numberOfOccurrenceFromList() {
        Map<String, Integer> map = new HashMap<>();
        List<String> names = Arrays.asList("A","A","B","C","C","A","B","C","D");
        names.stream()
                .map(s -> map.containsKey(s) ?
                        map.put(s, map.get(s) + 1)
                        : map.put(s, 1))
                .collect(Collectors.toList());
        System.out.println(map);
    }
    private static void duplicateOccurrenceFromList() {
        List<Integer> names = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer>duplicates = new HashSet<>();
        names.stream()
                .filter(i -> !duplicates.add(i))
                .forEach(System.out::println);
    }
}
