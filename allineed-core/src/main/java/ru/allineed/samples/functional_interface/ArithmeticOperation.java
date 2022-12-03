/**
 * [RU] Интерфейс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/13-java-functional-interface-example
 *
 * [EN] The interface with sample Java code from the article
 * https://allineed.ru/development/java-development/13-java-functional-interface-example
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package ru.allineed.samples.functional_interface;

/**
 * [RU] Простой функциональный интерфейс, выполняющий некоторые арифметические операции
 * между двумя операндами<br/>
 * [EN] A simple functional interface that performs some arithmetic operation between two
 * operands
 * @author <a href="https://allineed.ru">Allineed.Ru</a>
 * @param <T> type of arguments for operation and corresponding type of operation result
 */
@FunctionalInterface
public interface ArithmeticOperation<T> {
    /**
     * [RU] Выполняет заданную операцию над двумя операндами<br/>
     * [EN] Performs the specified operation between two operands
     * @param first [RU] Первый операнд; [EN] First operand
     * @param second [RU] Второй операнд; [EN] Второй операнд
     * @return [RU] Возвращает результат операции того же типа, что и сами операнды; [EN] Returns
     * the result of operation that has the same data type as the operands
     */
    T doOperation(T first, T second);
}
