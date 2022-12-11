/**
 * [RU] Это главный модуль для выполнения всех примеров на Java с сайта https://allineed.ru
 * [EN] This is the main module for executing all the Java samples from the https://allineed.ru site
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
package ru.allineed.samples.main;

import ru.allineed.samples.arrays.ArraysExample;
import ru.allineed.samples.comparable.ComparableGiftBoxExample;
import ru.allineed.samples.consumer_interface.ConsumerExample;
import ru.allineed.samples.helloworld.MySampleApplication;
import ru.allineed.samples.io.ReadingFileExample;
import ru.allineed.samples.properties.SystemPropertiesExample;

public class AllExamplesRunner {
    public static void main(String[] args) {
        // [RU] Запускает пример из статьи "Первая программа на Java"
        // [RU] Ссылка на статью: https://allineed.ru/development/java-development/5-java-first-program
        // [EN] Runs example from the article "Your first application in Java"
        // [EN] Link to the article: https://allineed.ru/development/java-development/5-java-first-program
        MySampleApplication.main(args);

        // [RU] Запускает пример из статьи "Работа с массивами в Java"
        // [RU] Ссылка на статью: https://allineed.ru/development/java-development/14-java-arrays
        // [EN] Runs example from the article "Working with arrays in Java"
        // [EN] Link to the article: https://allineed.ru/development/java-development/14-java-arrays
        ArraysExample.main(args);

        // [RU] Запускает пример из статьи "Функциональный интерфейс Consumer в Java"
        // [RU] Ссылка на статью: https://allineed.ru/development/java-development/12-consumer-java-functional-interface
        // [EN] Runs example from the article "Consumer functional interface in Java"
        // [EN] Link to the article: https://allineed.ru/development/java-development/12-consumer-java-functional-interface
        ConsumerExample.main(args);

        // [RU] Запускает пример из статьи "Читаем данные из файла с помощью Java"
        // [RU] Ссылка на статью: https://allineed.ru/development/java-development/22-java-reading-data-from-file
        // [EN] Runs example from the article "Reading data from file in Java"
        // [EN] Link to the article: https://allineed.ru/development/java-development/22-java-reading-data-from-file
        ReadingFileExample.main(args);

        // [RU] Запускает пример из статьи "Читаем свойства окружения в Java с помощью System.getProperties()"
        // [RU] Ссылка на статью: https://allineed.ru/development/java-development/8-java-system-properties
        // [EN] Runs example from the article "Reading env properties in Java using System.getProperties()"
        // [EN] Link to the article: https://allineed.ru/development/java-development/8-java-system-properties
        SystemPropertiesExample.main(args);

        // [RU] Запускает пример из статьи "Интерфейс Comparable в Java. Сравниваем объекты"
        // [RU] Ссылка на статью: https://allineed.ru/development/java-development/64-java-comparable-interface
        // [EN] Runs example from the article "Comparable interface in Java. Comparing objects"
        // [EN] Link to the article: https://allineed.ru/development/java-development/64-java-comparable-interface
        ComparableGiftBoxExample.main(args);
    }
}
