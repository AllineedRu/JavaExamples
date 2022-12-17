/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/13-java-functional-interface-example
 *
 * [EN] The class with sample Java code from the article
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

import ru.allineed.samples.common.OutputUtils;

/**
 * [RU] Основной исполняемый класс для статьи<br/>
 * [EN] The main executable класс for the article<br/>
 */
public class ArithmeticOperationExample {
    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Пример функционального интерфейса на Java",
                "An example of functional interface in Java",
                "https://allineed.ru/development/java-development/13-java-functional-interface-example");

        printDoubleOperationsDemo("Demo with Double operations");
        printIntegerOperationsDemo("Demo with Integer operations");
        printNumericOperationsDemo("Demo with mixed operations");
    }

    public static void printHeaderText(String headerText) {
        System.out.println("-----------------------------------------------");
        System.out.println(headerText);
        System.out.println("-----------------------------------------------");
    }

    public static void printNumericOperationsDemo(String headerText) {
        printHeaderText(headerText);

        ArithmeticOperation<Double> divideDoubleOperation = (x, y) -> x / y;
        ArithmeticOperation<Integer> divideIntegerOperation = (x, y) -> x / y;

        Double resultDouble = divideDoubleOperation.doOperation(5d, 3d);
        Integer resultInteger = divideIntegerOperation.doOperation(5, 3);
        System.out.println("5 div 3 for Double Result: " + resultDouble);
        System.out.println("5 div 3 for Integer Result: " + resultInteger);
    }

    public static void printIntegerOperationsDemo(String headerText) {
        printHeaderText(headerText);

        IntegerArithmeticOperation sumIntegerOperation = (x, y) -> x + y;
        IntegerArithmeticOperation multiplyIntegerOperation = (x, y) -> x * y;
        IntegerArithmeticOperation divideIntegerOperation = (x, y) -> x / y;
        IntegerArithmeticOperation minusIntegerOperation = (x, y) -> x - y;

        Integer sumIntegerResult = sumIntegerOperation.doOperation(5, 32);
        Integer multiplyIntegerResult = multiplyIntegerOperation.doOperation(9, 7);
        Integer divideIntegerResult = divideIntegerOperation.doOperation(34, 3);
        Integer minusIntegerResult = minusIntegerOperation.doOperation(63, 25);

        System.out.println("Sum Integer Result: " + sumIntegerResult);
        System.out.println("Multiply Integer Result: " + multiplyIntegerResult);
        System.out.println("Divide Integer Result: " + divideIntegerResult);
        System.out.println("Minus Integer Result: " + minusIntegerResult);
    }
    public static void printDoubleOperationsDemo(String headerText) {
        printHeaderText(headerText);

        DoubleArithmeticOperation sumDoubleOperation = (x, y) -> x + y;
        DoubleArithmeticOperation multiplyDoubleOperation = (x, y) -> x * y;
        DoubleArithmeticOperation divideDoubleOperation = (x, y) -> x / y;
        DoubleArithmeticOperation minusDoubleOperation = (x, y) -> x - y;

        Double sumDoubleResult = sumDoubleOperation.doOperation(1.2, 2.5);
        Double multiplyDoubleResult = multiplyDoubleOperation.doOperation(3.3, 7.4);
        Double divideDoubleResult = divideDoubleOperation.doOperation(7.1, -6.2);
        Double minusDoubleResult = minusDoubleOperation.doOperation(4.8, 3.8);

        System.out.println("Sum Double Result: " + sumDoubleResult);
        System.out.println("Multiply Double Result: " + multiplyDoubleResult);
        System.out.println("Divide Double Result: " + divideDoubleResult);
        System.out.println("Minus Double Result: " + minusDoubleResult);
    }
}
