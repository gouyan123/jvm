package com.gupao.edu.vip.course;

public class ClassloaderTest {
    public static void main(String[] args) {
        ClassloaderTest test = new ClassloaderTest();
        /**返回 null，证明是 根类加载器BootStrap ClassLoader，因为是C++写的，所以返回null*/
        System.out.println(test.getClass().getClassLoader().getParent().getParent());
        /**返回 扩展类加载器 ExtClassLoader*/
        System.out.println(test.getClass().getClassLoader().getParent());
        /**返回 应用程序加载器 AppClassLoader*/
        System.out.println(test.getClass().getClassLoader());
        /**返回 null，证明是 根类加载器BootStrap ClassLoader加载Object类*/
        System.out.println(new Object().getClass().getClassLoader());
    }
}
