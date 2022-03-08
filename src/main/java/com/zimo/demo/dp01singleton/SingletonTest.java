package com.zimo.demo.dp01singleton;

import org.junit.jupiter.api.Test;

/**
 * 懒汉式单例
 * Created by Zimo on 2022/1/6.
 */
public class SingletonTest {

    @Test
    public void Lazy() {
        System.out.print("需要螺丝刀 -> \t");
        SingletonLazyScrewdriver sd1 = SingletonLazyScrewdriver.getInstance();
        System.out.print("还需要螺丝刀 -> \t");
        SingletonLazyScrewdriver sd2 = SingletonLazyScrewdriver.getInstance();
        System.out.println("");
        if (sd1 == sd2) {
            System.out.println("它们是同一个螺丝刀");
        } else {
            System.out.println("它们不是同一个螺丝刀");
        }
    }

    @Test
    public void Hungry() {
        System.out.print("需要钳子 -> \t");
        SingletonHungryPliers pl1 = SingletonHungryPliers.getInstance();
        System.out.print("还需要钳子 -> \t");
        SingletonHungryPliers pl2 = SingletonHungryPliers.getInstance();
        System.out.println("\n");
        if (pl1 == pl2) {
            System.out.println("它们是同一个钳子");
        } else {
            System.out.println("它们不是同一个钳子");
        }
    }

}


