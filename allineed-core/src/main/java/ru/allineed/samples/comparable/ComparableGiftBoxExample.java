/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/64-java-comparable-interface
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/64-java-comparable-interface
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
package ru.allineed.samples.comparable;

import ru.allineed.samples.config.Localization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableGiftBoxExample {
    public static void main(String[] args) {
        // [RU] создаём экземпляр красной коробки
        // [EN] create an instance of the red box
        GiftBox redBox = new GiftBox("Red Box", 100, 100, 100);

        // [RU] создаём экземпляр синей коробки
        // [EN] create an instance of the blue box
        GiftBox blueBox = new GiftBox("Blue Box",30, 60, 100);

        // [RU] сравниваем синюю коробку с красной
        // [EN] comparing the blue box with the red one
        int comparisonResult = blueBox.compareTo(redBox);

        // [RU] распечать результаты сравнения
        // [EN] print out the results of the comparison
        if (comparisonResult > 0) {
            Localization.printLocalized(
                    String.format("Объем синей коробки (%,d куб. см) больше объёма красной (%,d куб. см).", blueBox.getVolume(), redBox.getVolume()),
                    String.format("The volume of the blue box (%,d cubic cm) is greater than the volume of the red one (%,d cubic cm).", blueBox.getVolume(), redBox.getVolume()));
        } else if (comparisonResult == 0) {
            Localization.printLocalized(
                    String.format("Синяя и красная коробки одного объема (%,d куб. см).", redBox.getVolume()),
                    String.format("Blue and red boxes of the same volume (%,d cubic cm).", redBox.getVolume()));
        } else {
            Localization.printLocalized(
                    String.format("Объем красной коробки (%,d куб. см) больше объёма синей (%,d куб. см).", redBox.getVolume(), blueBox.getVolume()),
                    String.format("The volume of the red box (%,d cubic cm) is greater than the volume of the blue one (%,d cubic cm).", redBox.getVolume(), blueBox.getVolume()));
        }

        // [RU] Создаём ещё одну маленькую жёлтую коробку
        // [EN] Create another small yellow box
        GiftBox smallYellowBox = new GiftBox("Small Yellow Box", 10, 15, 30);

        // [RU] Создаём список из наших экземпляров подарочных коробок
        // [EN] Create a list containing our gift box instances
        List<GiftBox> boxes = Arrays.asList(redBox, blueBox, smallYellowBox);

        // [RU] Сортируем коробки в соответствии с их естественным порядком (natural ordering)
        // [EN] Sort our boxes according to the natural ordering
        Collections.sort(boxes);

        // [RU] Выводим отсортированные коробки на консоль
        // [EN] Print the sorted boxes to the console
        Localization.printLocalized(
                "Отсортированные коробки:",
                "Sorted boxes:");
        boxes.forEach(System.out::println);

        GiftBox emptyBox = null;
        // [RU] Здесь при вызове метода compareTo() произойдет выброс исключения NullPointerException
        // [EN] Here we'll get a NullPointerException thrown when calling compareTo() method
        if (smallYellowBox.compareTo(emptyBox) == 0) {
            // [RU] В этот код мы никогда не попадём из-за NullPointerException...
            // [RU] This code will never be executed due to NullPointerException...
            Localization.printLocalized(
                    String.format("Объем двух коробок одинаковый: %s (%,d) и %s (%,d)",
                            smallYellowBox.getName(),
                            smallYellowBox.getVolume(),
                            emptyBox.getName(),
                            emptyBox.getVolume()),
                    String.format("The volume of these two boxes is equal: %s (%,d) и %s (%,d)",
                            smallYellowBox.getName(),
                            smallYellowBox.getVolume(),
                            emptyBox.getName(),
                            emptyBox.getVolume())
            );
        }
    }
}
