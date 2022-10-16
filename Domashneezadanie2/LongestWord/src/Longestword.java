//буду честен, мне помоги с этим заданием, понял я не особо хорошо

import java.util.Arrays;
import java.util.Comparator;

public class Longestword {
    public static void main(String[] args) {
        String s = "Всем привет меня зовут Даниил Витальевич";
        String longest = Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);
    }
}
