package com.wenge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        UsbSell  u=new HpUsb();
        InvocationHandler  hander=new MyHander(u);
       UsbSell us=(UsbSell) Proxy.newProxyInstance(u.getClass().getClassLoader(),
                u.getClass().getInterfaces(),
                hander
        );
        System.out.println(us.sellTheUsb(100,2));
        us.print();
    }
}
