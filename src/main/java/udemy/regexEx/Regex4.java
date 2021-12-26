package udemy.regexEx;

public class Regex4 {
    public static void main(String[] args) {
        String s1  ="Hello,    my fried!   How is your java    learning    go  ?";
        System.out.println(s1);
   //     s1 = s1.replace("java", "SQL");
        s1  = s1.replaceAll(" {2,}"," ");
        System.out.println(s1);
    }
}
