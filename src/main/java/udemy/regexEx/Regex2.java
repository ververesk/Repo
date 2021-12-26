package udemy.regexEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1= "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABCD");

//        String s1= "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");

//        String s1= "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]"); //сначала abc потом один из символов не из этого диапазона

//        String s1= "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)"); //4 символ e или 5

//        String s1= "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc."); //. любой символ

//        String s1= "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+");

//        String s1= "poka abc Zaur dom kino reflexion"; // выводим слова длина которых больше 4
//        Pattern pattern1 = Pattern.compile("(\\w{4})");
//        String s1= "abcd abce3 abcfa78abcg6abch"; // выводим слова длина которых больше 4
 //       Pattern pattern1 = Pattern.compile("\\D{2,6}"); //ищем не цифры длиной от 2 до 6 если просто 2, то мин 2 а максимально не огранияено

//        String s1= "ABCABABDA";
 //      Pattern pattern1 = Pattern.compile("(AB){2,3}"); //повторение AB от 2 до 3 раз

  //      String s1= "DABCDABABDABABABABD";
  //      Pattern pattern1 = Pattern.compile("D(AB){2,}"); //DABABABAB

     //   String s1= "DABCDABABDA";
     //   Pattern pattern1 = Pattern.compile("D(AB)?"); //ищем D за которым может идти AB а может и не идти

        String s1= "abcd abcd4 afc4ced7";
        Pattern pattern1 = Pattern.compile("[abcd][efgh3-8]"); //1ый символ от а до d, второй из этой группы [efgh3-8]
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: "+matcher.start()+" "+matcher.group());
        }
    }
}
