package com.listofprocedures.study.chapter_first;

/**
 * @author WJH13
 */
public class Constant {
    public static void main(String[] args) {
        // 在Java中,可以使用关键字final指示常量
        // 习惯上,常量名使用全大写
        // 定义常量表示1英寸 = 2.54厘米
        final double CM_PER_INCH = 2.54;
        // 关键字final表示这个变量只能被赋值一次 一旦赋值,就不能再更改了
        // 错误!!!
        // CM_PER_INCH = 3;

        // 定义变量表示纸张宽度
        double paperWidth = 8.5;
        // 定义变量表示纸张高度
        double paperHeight = 11;
        // 输出打印
        // Paper size in centimeters: 21.59 by 27.94
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

class Constant2 {
    // 在Java中,可能经常需要创建一个常量以便在一个类的多个方法中使用,通常将这些常量称为类常量
    // 可以使用关键字static final设置一个类常量
    // 定义类常量表示1英寸 = 2.54厘米
    public static final double CM_PER_INCH = 2.54;
    // PS:类常量定义位于main方法之外 这样一来,同一个类的其他方法也可以使用这个常量
    // 另外,如果一个常量被声明为public(如上所示),那么其他类的方法也可以使用这个常量
    // 对于这个例子,其他类可以通过ConStant2.CM_PER_INCH使用这个类常量,请看如下Constant3

    public static void main(String[] args) {
        // 定义变量表示纸张宽度
        double paperWidth = 8.5;
        // 定义变量表示纸张高度
        double paperHeight = 11;
        // 输出打印
        // Paper size in centimeters: 21.59 by 27.94
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

class Constant3 {
    public static void main(String[] args) {
        // 定义变量表示纸张宽度
        double paperWidth = 10.5;
        // 定义变量表示纸张高度
        double paperHeight = 12;
        // 输出打印
        // Paper size in centimeters: 26.67 by 30.48
        System.out.println("Paper size in centimeters: " + paperWidth * Constant2.CM_PER_INCH + " by " + paperHeight * Constant2.CM_PER_INCH);
    }
}
