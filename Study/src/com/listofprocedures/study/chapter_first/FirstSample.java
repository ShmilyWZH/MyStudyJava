package com.listofprocedures.study.chapter_first;

/**
 * This is the first sample program in Core Java Chapter_first
 * @author WJH13
 */
/*
    关键字public称为访问修饰符(access modifier),这些修饰符用于控制程序的其他部分对这段代码的访问级别。详情请阅读chapter_third
    关键字class表明Java程序中的全部内容都包含在类中。详情请阅读chapter_second,不过现在只需要将类看作是程序逻辑的一个容器,定义了应用程序的行为
      类是所有Java应用的构建模块
      Java程序中的所有内容都必须放在类中
    关键字class后面紧跟类名
      类名必须以字母开头,后面可以跟字母和数字的任意组合,长度基本上没有限制,但是不能使用Java保留字(例如public或class)作为类名
      标准命名约定:
        类名是以大写字母开头的名词(如下类名FirstSample就使用了这个命名约定)
        如果名字由多个单词组成,每个单词的第一个字母都应该大写
      源代码的文件名必须与公共类的类名相同
     */
// Java中任何方法的代码都必须以 "{" 开始,用 "}" 结束
public class FirstSample {
    // 首先,Java严格区分大小写
    // 如果出现了大小写拼写错误(例如,将main拼写成Main),程序将无法运行
    // 关键字static void详情请阅读chapter_second
    // 重点!!! --> 每个Java应用都必须有一个main方法
    public static void main(String[] args) {
        // program statements ⬇⬇⬇
        // 在Java中,每个语句必须用分号";"结束
        // PS:回车不是语句的结束标志,因此,如果需要,一条语句可以跨多行

        // System.out对象并调用了它的println方法,println方法接收了一个字符串参数,这个方法将这个字符串参数显示在控制台
        // 然后,终止这个输出行,所以每次调用println都会在新的一行上显示输出
        // PS:点号(.)用于调用方法  Java使用的通用语法是: object.method(parameters) 等价于一个函数调用
        System.out.println("We will not use 'Hello World!'");

        // Java中的方法也可以没有参数,也可以有一个或多个参数(有的程序员把参数叫做实参(argument))
        // 即使一个方法没有参数,也需要使用空括号,如下:不带参数的println方法只打印一个空行
        System.out.println();

        // System.out还有一个print方法,它不在输出之后增加换行符
        // 打印结果: HelloWorld
        System.out.print("Hello");
        System.out.print("World");
    }
}
