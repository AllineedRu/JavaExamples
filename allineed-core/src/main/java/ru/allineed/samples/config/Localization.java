/**
 * [RU] Класс для поддержкой локализации примеров кода на русский и английский языки
 *
 * [EN] The class contains Russian and English language support for code examples
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
package ru.allineed.samples.config;

public class Localization {
    public static final String RU = "ru";
    public static final String EN = "en";

    // [RU] Поменяйте здесь значение RU на EN, если вывод всех примеров нужен на английском языке:
    // [EN] Change RU to EN here if you need an output of all the examples in English:
    public static final String EXAMPLES_DEFAULT_LOCALE = RU;

    public static void printLocalized(String ruMessage, String enMessage) {
        System.out.println();
        if (RU.equals(EXAMPLES_DEFAULT_LOCALE)) {
            System.out.println(ruMessage);
        } else {
            System.out.println(enMessage);
        }
    }
}
