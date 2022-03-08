package com.zimo.demo.dp01singleton;

/**
 * 饿汉式单例
 * Created by Zimo on 2022/1/6.
 *
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，
 * 以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 */
public class SingletonHungryPliers {

    private static final SingletonHungryPliers instance = new SingletonHungryPliers();

    private SingletonHungryPliers() {
        System.out.println("初始化一个钳子");
    }

    public static SingletonHungryPliers getInstance() {
        return instance;
    }
}
