package com.listofprocedures.study.chapter_first;

/**
 * @author WJH13
 */
public class DataTypeAndVariable {
    public static void main(String[] args) {
        // 在Java中,每个变量都有一个类型(type)
        /*
        数据类型:
          Java是一种强类型语言
           这就意味着必须为每一个变量声明一个类型
          在Java中,一共有8种基本类型(primitive type),其中有4种整形、2种浮点型、1种字符类型char(用于表示Unicode编码的代码单元)
           和一种用于表示真值的boolean类型
            整型用于表示没有小数部分的数,可以是负数 --> int、short、long、byte  在通常情况下,int类型最常用
            浮点类型用于表示有小数部分的数值 ---> float、double  double表示这种类型的数值精度是float类型的两倍(有人称之为双精度数(double precision))
             很多情况下,float类型的精度(6 ~ 7位有效数字)都不能满足需求
              实际上,只有很少情况适合使用float类型
               float类型的数值有一个后缀F或f(例如,3.14F)
                没有后缀F的浮点数值(如3.14)总是默认为double类型
                 可选地,也可以在double数值后面添加后缀D或d(例如,3.14D)
            char类型的字面量要用单引号括起来(例如:'A'是编码值为65的字符常量)
            boolean(布尔)类型有两个值:false和true,用来判定逻辑条件
             整型值和布尔值之间不能进行相互转换

         */

        // 声明一个变量时,先指定变量的类型,然后是变量名
        // PS:每个声明都以分号结束
        // 作为变量名(以及其他名字)的标识符由字母、数字、货币符号以及"标点连接符"组成 第一个字符不能是数字
        double salary;
        long earthPopulation;
        boolean done;

        // 可以在一行中声明多个变量 ---> 不提倡
        int i, j;

        // 初始化变量
        // 声明一个变量之后,必须用赋值语句显式地初始化变量,千万不要使用未初始化的变量的值
        int vacationDays;
        // 错误!!!
        // System.out.println(vacationDays);

        //要想对一个已声明的变量进行赋值,需要将变量名放在等号(=)左侧,再把一个有适当值的Java表达式放在等号的右侧
        int week;
        week = 7;

        // 也可以将变量的声明和初始化放在同一行中
        int year = 1;

        // 最后,Java中可以将声明放在代码中的任何地方
        // 建议:在Java中,变量的声明要尽可能靠近第一次使用这个变量的地方
        int month = 12;
        System.out.println(month);
        int monthDay = 30;
    }
}
