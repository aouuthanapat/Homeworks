import java.util.Arrays;
import java.util.Scanner;

public class Letterinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "По связи между частями сложные предложения делятся на два типа";
        String c = "а";

        String[] s = str.split(" ");
        Arrays.sort(s);

        int kol = 0;
        System.out.println("слова, которые заканчивающиеся на букву " + c.charAt(0));
        for (int j = 0; j < s.length; j++) {
            if (s[j].charAt(s[j].length() - 1) == c.charAt(0)) {
                System.out.println(s[j]);
            }
        }
    }
}