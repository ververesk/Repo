import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class NullElement {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "F", null, "second");
        printList(strings);
    }

    public static void printList(List<String> strings) {
        String text = "Этот элемент равен null";
        for (String str : strings) {
            Optional<String> strin = Optional.ofNullable(str);
            System.out.println(strin.orElse(text));
        }
    }
}
