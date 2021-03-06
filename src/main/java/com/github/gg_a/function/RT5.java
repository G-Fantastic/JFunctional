/*
 * Copyright 2019 GG-A, <2018158885@qq.com, https://github.com/GG-A/JFunctional>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.gg_a.function;

/**
 * Represents a function that accepts 5 arguments and produces a result, and will throw exception<br>
 * 表示一个接收 5个参数 并返回结果且抛出异常的函数
 *
 * @param <T1> type of the 1st param.　第1个参数类型
 * @param <T2> type of the 2nd param.　第2个参数类型
 * @param <T3> type of the 3rd param.　第3个参数类型
 * @param <T4> type of the 4th param.　第4个参数类型
 * @param <T5> type of the 5th param.　第5个参数类型
 * @param <R> return type  返回值类型
 * @param <E> Exception or subclass of Exception.　Exception类及其子类
 */
@FunctionalInterface
public interface RT5<T1, T2, T3, T4, T5, R, E extends Exception> {
    R $(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) throws E;
}
