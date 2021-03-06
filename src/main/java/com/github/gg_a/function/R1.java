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
 * Represents a function that accepts 1 argument and produces a result<br>
 * 表示一个接收 1个参数 并返回结果的函数
 *
 * @param <T> type of the 1st param.　第1个参数类型
 * @param <R> return type  返回值类型
 */
@FunctionalInterface
public interface R1<T, R> {
    R $(T t);
}
