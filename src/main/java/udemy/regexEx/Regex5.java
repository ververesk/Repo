package udemy.regexEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String s = "12345678912345670235987;" +
                "987654321654987650921654;" +
                "8527419634561238112233";
        //номер карты
        // 1234 5678 91234567 02/35 (987)
        //задача выводить в таком виде

        //02/35 1234 5678 91234567 (987)
        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        /*
        группа, выражение в круглых скобках. Отсчет от единицы. кокретно тут пять групп
         */
        Matcher matcher = pattern.matcher(s);
    //    String newString  = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
    //    System.out.println(newString);

        while (matcher.find()) {
            System.out.println(matcher.group(7)); //только 7 группа
        }


    }
}
