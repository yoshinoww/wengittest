package com.wenge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHander implements InvocationHandler {
    private Object obj;

    public MyHander(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        if (result == null) {
            System.out.println("执行了print方法");
            return null;
        }
        Integer i = (Integer) result;
        i = i + 20;
        return i;
    }
}