package com.wenge;

public class HpUsb implements UsbSell {
    @Override
    public int sellTheUsb(int price,int count) {
        return  price*count;
    }

    @Override
    public void print() {
        System.out.println("感谢购买惠普u盘");
    }
}
