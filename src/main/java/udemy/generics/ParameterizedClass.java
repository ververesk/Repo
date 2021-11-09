package udemy.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1=new Info<>("privet"); //String заменит Т везде в классе Info,  т е простая подстановка
//        System.out.println(info1);
//        String s=info1.getValue();
        Info<Integer> info2=new Info<>(18);
        System.out.println(info2);


    }

//    public void abc(Info<String> info) {
//        String s=info.getValue();
//    }


}
class Info<T extends Number> { //ставим толкь то что extends Number

    private T value; //static эта переменная быть не может

    public Info(T value) {
        this.value=value;
    }

    public String toString() {
        return "{["+value+"]}";
    }

    public T getValue() {
        return value;
    }
}

//class Parent {
//    public void abc(Info<String> info) {
//        String s=info.getValue();
//    }
//}
//
//class Child extends Parent {
//    //    public void abc(Info<Integer> info) {  так метод @override нельзя потому что будет стиранеи типов
////        Integer integer=info.getValue();
////    }
//}