package com.listofprocedures.study.chapter_first;

/**
 * @author WJH13
 */
public class Enumerate {
    public static void main(String[] args) {
        // 有时候,一个变量只包含有限的一组值 针对这种情况,可以自定义枚举类型(enumerated type)
        // 枚举类型包括有限个命名值,详情请阅读chapter_third
        enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};
        // 现在可以声明这种类型的变量
        // Size类型的变量只能存储这个类型声明中所列的某个值,或者特殊值null,null表示这个变量没有设置任何值
        Size s = Size.MEDIUM;
    }
}
