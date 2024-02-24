import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"},'z'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))) indexes.add(i);
        }
        return indexes;
    }
}
