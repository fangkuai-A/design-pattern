package com.zimo.demo.dp02prototype;

import javax.swing.*;

/**
 * Created by Zimo on 2022/3/8.
 */
public class PrototypeSunWuKong extends JPanel implements Cloneable {
    private static final long serialVersionUID = 5543049531872119328L;

    public PrototypeSunWuKong() {
        JLabel jLabel = new JLabel(new ImageIcon("src/main/resources/WuKong.jpg"));
        this.add(jLabel);
    }

    @Override
    public Object clone() {
        PrototypeSunWuKong swk = null;
        try {
            swk = (PrototypeSunWuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝失败");
        }
        return swk;
    }
}
