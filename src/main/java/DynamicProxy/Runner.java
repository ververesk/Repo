package DynamicProxy;

import java.lang.reflect.Proxy;

public class Runner {
    /**
     * Dynamic Proxy — это паттерн!
     * Создание прокси объекта происходит на уровне интерфейсов, а не классов. Прокси создается для интерфейса.
     */
    public static void main(String[] args) {

        //Создаем оригинальный объект
        Man vasia = new Man("Вася", 30, "Санкт-Петербург", "Россия");
        vasia.introduce(vasia.getName());//тут еще вызывается настоящий метод

        //Получаем загрузчик класса у оригинального объекта
        ClassLoader vasiaClassLoader = vasia.getClass().getClassLoader();

        //Получаем все интерфейсы, которые реализует оригинальный объект
        Class[] interfaces = vasia.getClass().getInterfaces();

        //Создаем прокси нашего объекта vasia
        Person proxyVasia = (Person) Proxy.newProxyInstance(vasiaClassLoader, interfaces, new PersonInvocationHandler(vasia));

        //Вызываем у прокси объекта один из методов нашего оригинального объекта
        proxyVasia.sayAge(vasia.getAge()); //какой бы метод тут не был написан, мы все равно получаем привет

    }
}
