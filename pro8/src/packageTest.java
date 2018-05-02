package cn.itcast;

public class packageTest {
    public static void main(String[] args) {
        com.dengshen.packageSum s = new com.dengshen.packageSum();
        int num = s.sum(10, 20);
        System.out.println(num);
        System.out.println("使用方法:");
        System.out.println("javac -d . xxx.java  package com.test; 会自动生成相应的文件夹 con/test/xxx.class");
    }
}
