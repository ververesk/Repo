package some_tasks;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(convert("revenge"));
    }
    public static String convert(String word) {
        word = word.toLowerCase();
        char[] resultArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char[] symbolArray = word.toCharArray();
            char temp = word.toCharArray()[i];
            symbolArray[i] = (char) (temp + 1);
            if (String.valueOf(symbolArray).contains(String.valueOf(temp))) {
                resultArray[i] = ')';
            } else {
                resultArray[i] = '(';
            }
        }
        return String.valueOf(resultArray);
    }
}
