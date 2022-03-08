package com.zimo.demo.dp02prototype;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

/**
 * 原型模式
 * Created by Zimo on 2022/1/6.
 */
public class PrototypeTest {

    @Test
    public void Prototype() {
        JFrame frame = new JFrame("原型模式测试");
        frame.setLayout(new GridLayout(1, 2));
        Container contentPane = frame.getContentPane();
        PrototypeSunWuKong sunWuKong1 = new PrototypeSunWuKong();
        contentPane.add(sunWuKong1);
        PrototypeSunWuKong sunWuKong2 = (PrototypeSunWuKong) sunWuKong1.clone();
        contentPane.add(sunWuKong2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


