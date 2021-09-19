package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvokationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods methods;

    public CustomInvokationHandler(SomeInterfaceWithMethods methods) {
        this.methods = methods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"in");
        Object rezult=method.invoke(methods, args);
        System.out.println(method.getName()+"out");
        return rezult;
    }
}
