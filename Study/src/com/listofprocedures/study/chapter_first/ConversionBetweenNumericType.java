package com.listofprocedures.study.chapter_first;

/**
 * @author WJH13
 */
public class ConversionBetweenNumericType {
    public static void main(String[] args) {
        System.out.println("学习数值类型之间的转换相关内容!!!");
    }
}

class AutoMaticTypeConversion {
    public static void main(String[] args) {
        /*
    自动类型转换
     请看图
                       char
                       ——↓
    byte ——> short ——> int ——> long
                     ---↓  ——↘ ---↙   ---↓
                     float  ——>  double
    解析:
         图中"——>"表示实线箭头,表示无信息丢失的转换;
         图中"---↓、---↘、---↙"表示虚线箭头,表示可能有精度损失的转换
         int ---↓ float 译为:int ---> float
         long ---↓ double 译为:long ---> double
         int ——↘ double 译为:int ——> double
         long ---↙ float 译为:long ---> float
     */
        // 程序演示,例如,123456789是一个大整数,它包含的位数多余float类型所能表示的位数
        // 将这个整数转换为float类型时,数量级是正确的,但是会损失一些精度
        int num = 123456789;
        float conversionNum = num;
        // 输出打印
        // 1.23456792E8
        System.out.println(conversionNum);

        // 当用一个二元运算符连接两个值时(例如n + f,n是整数,f是浮点数),先将两个操作数转换为同一种类型,然后再进行计算
        // 如果两个操作数中有一个是double类型,另一个操作数就会转换为double类型
        // 否则,如果其中一个操作数是float类型,另一个操作数将会转换为float类型
        // 否则,如果其中一个操作数是long类型,另一个操作数将会转换为long类型
        // 否则,两个操作数都将被转换为int类型
    }
}

class CastTypeConversion {
    public static void main(String[] args) {
        /*
        在上面看到,在必要的时候,int类型的值将会自动地转换为double类型
        但是另一方面,有时也需要将double类型转换为int类型
        在Java中,允许进行这种数值转换,不过当然可能会丢失一些信息
        这种可能损失信息的转换要通过强制类型转换(cast)来完成
         */
        // 强制类型转换的语法格式是在圆括号中指定想要转换的目标类型,后面紧跟待转换的变量名
        double num = 9.997;
        int conversionNum = (int) num;
        // 输出打印
        // 9 因为强制类型转换通过截断小数部分将浮点值转换为整型
        System.out.println(conversionNum);

        // 如果想舍入(round)一个浮点数来得到最接近的整数(大多数情况下,这种操作更有用),可以使用Math.round方法
        // 输出打印
        // 10 调用round时,仍然需要使用强制类型转换(int),因为round方法的返回值是long类型,由于存在信息丢失的可能性,所以只有使用显式的强制类型转换才能够将一个long值赋给int类型的变量
        System.out.println((int)Math.round(num));

        // PS:如果试图将一个数从一个类型强制转换为另一种类型,而又超出了目标类型的表示范围,结果就会截断成一个完全不同的值
        // 输出打印
        // 44
        System.out.println((byte)300);
    }
}
