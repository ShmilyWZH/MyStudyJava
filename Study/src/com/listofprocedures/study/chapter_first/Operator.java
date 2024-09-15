package com.listofprocedures.study.chapter_first;

/**
 * @author WJH13
 */
public class Operator {
    public static void main(String[] args) {
        System.out.println("学习运算符相关内容!!!");
    }
}

class Arithmetic {
    public static void main(String[] args) {
        // 在Java中,使用通常的算术运算符+、-、*、/分别表示加、减、乘、除运算
        // 当参与 / 运算的两个操作数都是整数时,/表示整数除法
        int dividend = 10;
        int divisor = 5;
        int result = dividend / divisor;
        // 输出打印
        // 2
        System.out.println(result);

        // 否则,这表示浮点除法
        double dividend2 = 10.0;
        double divisor2 = 5.0;
        double result2 = dividend2 / divisor2;
        // 输出打印
        // 2.0
        System.out.println(result2);

        // 整数的求余操作(有时称为取模(modulus))用 % 表示
        int dividend3 = 15;
        int divisor3 = 2;
        int result3 = dividend3 % divisor3;
        // 输出打印
        // 1
        System.out.println(result3);

        double dividend4 = 15.0;
        double divisor4 = 2.0;
        double result4 = dividend4 % divisor4;
        // 输出打印
        // 1.0
        System.out.println(result4);

        // PS:整数被0除将产生一个异常,而浮点数被0除将会得到一个无穷大或NaN结果
        //int result5 = 100 / 0;
        // 输出打印
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println(result5);

        //double result6 = 15.3 / 0;
        // 输出打印
        // Infinity
        //System.out.println(result6);
    }

}
