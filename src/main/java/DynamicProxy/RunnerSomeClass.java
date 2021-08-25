package DynamicProxy;

import java.lang.reflect.Proxy;

public class RunnerSomeClass {
    public static void main(String[] args) {
        SomeClass someClass=new SomeClass(1,2);
        ClassLoader someClassLoader=someClass.getClass().getClassLoader();
        Class[] interfaces = someClass.getClass().getInterfaces();
        SomeInterfaceWithMethods proxySomeClass = (SomeInterfaceWithMethods) Proxy.newProxyInstance(someClassLoader, interfaces, new CustomInvokationHandler(someClass));
        int sum=proxySomeClass.sum(someClass.x, someClass.y);
        System.out.println(sum);
        proxySomeClass.somePhrase();
    }
}
