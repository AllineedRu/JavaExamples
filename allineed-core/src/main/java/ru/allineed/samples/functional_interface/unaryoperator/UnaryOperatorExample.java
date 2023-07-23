/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/84-java-unaryoperator
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/84-java-unaryoperator
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
package ru.allineed.samples.functional_interface.unaryoperator;

import ru.allineed.samples.common.OutputUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Функциональный интерфейс UnaryOperator в Java",
                "Functional interface UnaryOperator in Java",
                "https://allineed.ru/development/java-development/84-java-unaryoperator");

        showIntegerIncrementDemo();
        showGreeterDemo();
    }

    private static void showGreeterDemo() {
        UnaryOperator<String> greeter = e -> "Привет, " + e + "!";

        List<String> people = Arrays.asList("Александр", "Иван", "Пётр", "Михаил");
        System.out.println(people.stream().map(greeter).collect(Collectors.toList()));
    }

    private static void showIntegerIncrementDemo() {
        UnaryOperator<Integer> increment = e -> e + 1;

        List<Integer> numbers = Arrays.asList(2, 3, -5);

        System.out.println(increment.apply(3));

        // [RU] Использование интерфейса UnaryOperator в виде готовой переменной 'increment' внутри метода Stream#map
        // [EN] Using UnaryOperator interface as a predefined variable 'increment' inside method Stream#map
        System.out.println(numbers.stream().map(increment).collect(Collectors.toList()));

        // [RU] Использование интерфейса UnaryOperator в виде лямбда-выражения внутри метода Stream#map
        // [EN] Using UnaryOperator interface as lambda expression inside method Stream#map
        System.out.println(numbers.stream().map(e -> e + 1).collect(Collectors.toList()));
    }
}
