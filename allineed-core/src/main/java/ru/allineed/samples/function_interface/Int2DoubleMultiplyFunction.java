/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/65-java-function-functional-interface
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/65-java-function-functional-interface
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
package ru.allineed.samples.function_interface;

import java.util.function.Function;

/**
 * [RU] Класс, реализующий функциональный интерфейс {@code Function<T, R>} как {@code Function<Integer, Double>}<br/>
 * [EN] Class implementing the function interface {@code Function<T, R>} as {@code Function<Integer, Double>}
 */
public class Int2DoubleMultiplyFunction implements Function<Integer, Double> {

    @Override
    public Double apply(Integer integer) {
        if (integer == null) {
            return null;
        }

        if (integer == 0) {
            return 0.;
        }

        return 2. * integer;
    }
}
