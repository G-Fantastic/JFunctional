package com.github.gg.function;

/**
 * Represents a function that accepts 3 arguments and produces a result
 * 表示一个接收 3个参数 并返回结果的函数
 * @param <T1>
 * @param <T2>
 * @param <T3>
 * @param <R>
 */
@FunctionalInterface
public interface R3<T1, T2, T3, R> {
    R $(T1 t1, T2 t2, T3 t3);
}
