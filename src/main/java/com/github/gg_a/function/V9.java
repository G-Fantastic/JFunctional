package com.github.gg_a.function;

/**
 * Represents a function that accepts 9 arguments and returns no result
 * 表示一个接收 9个参数 不返回任何结果的函数
 *
 * @param <T1> first param type  第1个参数类型
 * @param <T2> second param type  第2个参数类型
 * @param <T3> third param type  第3个参数类型
 * @param <T4> fourth param type  第4个参数类型
 * @param <T5> fifth param type  第5个参数类型
 * @param <T6> sixth param type  第6个参数类型
 * @param <T7> seventh param type  第7个参数类型
 * @param <T8> eighth param type  第8个参数类型
 * @param <T9> ninth param type  第9个参数类型
 */
@FunctionalInterface
public interface V9<T1, T2, T3, T4, T5, T6, T7, T8, T9> {
    void $(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9);
}