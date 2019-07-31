package com.github.gg.function;

/**
 * Represents a function that accepts 7 arguments and produces a result
 * 表示一个接收 7个参数 并返回结果的函数
 * @param <T1>
 * @param <T2>
 * @param <T3>
 * @param <T4>
 * @param <T5>
 * @param <T6>
 * @param <T7>
 * @param <R>
 */
@FunctionalInterface
public interface R7<T1, T2, T3, T4, T5, T6, T7, R> {
    R $(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7);
}
