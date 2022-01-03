package udemy.annotation_ex;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("udemy.annotation_ex.Xiaomi");
        Annotation xiaomiClassAnnotation = xiaomiClass.getAnnotation(Smartphone.class);
        Smartphone sm1 = (Smartphone) xiaomiClassAnnotation;
        System.out.println("Annotation info from Xiaomi class: " +
                sm1.OS()+ ", "+sm1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("udemy.annotation_ex.Iphone");
        Annotation iphoneClassAnnotation = iphoneClass.getAnnotation(Smartphone.class);
        Smartphone sm2 = (Smartphone) iphoneClassAnnotation;
        System.out.println("Annotation info from Iphone class: " +
                sm2.OS()+ ", "+sm2.yearOfCompanyCreation());

    }
}
@Retention(RetentionPolicy.RUNTIME) //если RetentionPolicy будет другой то через рефлексию не получится ничего достать
@Target(ElementType.TYPE) //для классов и интерфейсов
@interface Smartphone { //можно прописывать дефолтные элементы
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}
@Smartphone //тут будут дефолтные значения
class Xiaomi {
    String model;
    double price;
}

@Smartphone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
