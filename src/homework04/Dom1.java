package homework04;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class Dom1 {
    public static void main(String[] args) {
        Map<Character, Character> sMap = new HashMap<>();
        String s = "qwertyuiopasdfghjklzxcvbnm";
        for (int i = 0; i < s.length(); i++) {
            char l = i == 0 ? s.charAt(s.length() - 1) : s.charAt(i-1);
            sMap.put(s.charAt(i), l);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву:");
        char input = sc.next().charAt(0);
        System.out.println("Буква слева - " + sMap.get(input));



    }
}
