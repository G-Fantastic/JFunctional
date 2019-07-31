package com.github.gg_a.function;

/**
 * Represents a function that accepts 4 arguments and returns no result
 * 表示一个接收 4个参数 不返回任何结果的函数
 *
 * @param <T1> first param type  第1个参数类型
 * @param <T2> second param type  第2个参数类型
 * @param <T3> third param type  第3个参数类型
 * @param <T4> fourth param type  第4个参数类型
 */
@FunctionalInterface
public interface V4<T1, T2, T3, T4> {
    void $(T1 t1, T2 t2, T3 t3, T4 t4);
}