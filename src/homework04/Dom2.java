package homework04;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Dom2 {
    public static void main(String[] args) {
        String arrow = "<<-->><<--<<<>>-->><>--<<>-->>-->>--<<--<<>--<<>-->>--<<-->>--" +
                "<<-->>-->>>--<<-->><<--<<>-->>-<<>>-->><<-->";
        System.out.println(arrow);

        Pattern pattern = Pattern.compile(">>-->");
        Pattern pattern1 = Pattern.compile("<--<<");
        Matcher matcher = pattern.matcher(arrow);
        Matcher matcher1 = pattern1.matcher(arrow);
        int count = 0;
        int count2 = 0;

        while (matcher.find())
            count++;

        System.out.println("Количество стрел >>-->: " + count);
        while (matcher1.find())
            count2++;
        System.out.println("Количество стрел <--<<: " + count2);
    }
}
