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

import ru.allineed.samples.common.OutputUtils;
import ru.allineed.samples.config.Localization;

import java.util.function.Function;

public class FunctionInterfaceExample {

    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Функциональный интерфейс Function в Java. Методы apply, andThen, compose и identity",
                "Functional interface Function in Java. Methods apply, andThen, compose and identity",
                "https://allineed.ru/development/java-development/65-java-function-functional-interface");

        Function<Integer, Double> funcLambda = (Integer intVal) -> {
            if (intVal == null) {
                return null;
            }
            if (intVal == 0) {
                return 0.;
            }
            return 2. * intVal;
        };

        Int2DoubleMultiplyFunction funcInstance = new Int2DoubleMultiplyFunction();

        String sampleTitle = Localization.getLocalized(
                "Пример использования функции, заданной через лямбда-выражение:",
                "Example of using a function specified as lambda expression:");
        applyFunction(sampleTitle, funcLambda);

        sampleTitle = Localization.getLocalized(
                "Пример использования функции, заданной через отдельный экземпляр класса Int2DoubleMultiplyFunction:",
                "Example of using a function specified as a separate instance of Int2DoubleMultiplyFunction class:");
        applyFunction(sampleTitle, funcInstance);

        Function<Double, Double> identityFunc = Function.identity();
        Double identityResult = identityFunc.apply(357.218);

        System.out.println();
        System.out.format("identityResult = %.5f%n", identityResult);
    }

    /**
     * [RU] Применяет переданную функцию {@code func} к различным входным аргументам<br/>
     * [EN] Applies the given function {@code func} to the different input arguments
     * @param title [RU] Текст заголовка для вывода на консоль; [EN] Header text for console output
     * @param func [RU] Экземпляр функции {@code Function<Integer, Double>}; [EN] An instance of function
     * {@code Function<Integer, Double>}
     */
    public static void applyFunction(String title, Function<Integer, Double> func) {
        System.out.println();
        System.out.println(title);

        Double zeroResult = func.apply(0);
        System.out.format("zeroResult = %.2f%n", zeroResult);

        Double negativeResult1 = func.apply(-200);
        System.out.format("negativeResult1 = %.2f%n", negativeResult1);

        Double negativeResult2 = func.apply(-50);
        System.out.format("negativeResult2 = %.2f%n", negativeResult2);

        Double positiveResult1 = func.apply(777);
        System.out.format("positiveResult1 = %.2f%n", positiveResult1);

        Double positiveResult2 = func.apply(55);
        System.out.format("positiveResult2 = %.2f%n", positiveResult2);

        Double nullResult = func.apply(null);
        System.out.format("nullResult = %s%n", nullResult);

        Double andThenResult = func.andThen(aDouble -> aDouble + 3).andThen(aDouble -> aDouble + 5).apply(10);
        System.out.format("andThenResult = %.2f%n", andThenResult);

        Double composeResult = func.compose(x -> (Integer)x + 5).compose(x -> (Integer)x + 1).apply(10);
        System.out.format("composeResult = %.2f%n", composeResult);
    }
}
