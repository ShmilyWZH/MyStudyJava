package com.listofprocedures.study.chapter_first;

/**
 * @author WJH13
 */
public class MathFunctionAndConstant {
    public static void main(String[] args) {
        // Math类中包含可能会用到的各种数学函数,这取决于要编写什么类型的程序
        // 例如,计算一个数的平方根,可以使用sqrt方法:
        double num = 4;
        double result = Math.sqrt(num);
        // 输出打印
        // 2.0
        System.out.println(result);

        // 在Java中,没有幂运算的运算符,因此必须使用Math类的pow方法
        // 将result2的值设置为num的2次幂
        double result2 = Math.pow(num, 2);
        // 输出打印
        // pow方法有两个double类型的参数,其返回结果也为double类型
        // 16.0
        System.out.println(result2);

        // 同时还提供了两个常量来表示 Π(PI)和e常量最接近的近似值
        // 3.141592653589793
        System.out.println(Math.PI);
        // 2.718281828459045
        System.out.println(Math.E);

        // 详情请自行翻阅JDK API文档
    }
}
