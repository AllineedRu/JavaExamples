/**
 * [RU] Класс с утилитными методами по выводу сообщений на консоль
 *
 * [EN] The class contains utility methods for printing message to console
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
package ru.allineed.samples.common;

import ru.allineed.samples.config.Localization;

public class OutputUtils {

    private static void printSeparator() {
        StringBuilder separator = new StringBuilder();
        for (int i = 0; i < 120; i++) {
            separator.append("=");
        }
        System.out.println(separator);
    }

    public static void printSampleTitle(String article_title_ru, String article_title_en, String articleUrl) {
        System.out.println();
        printSeparator();
        System.out.println(Localization.isRUDefaultLocale() ?
                String.format(">> Запуск примера для статьи \"%s\"", Localization.getLocalized(article_title_ru, article_title_en)) :
                String.format(">> Running the sample for the article \"%s\"",Localization.getLocalized(article_title_ru, article_title_en))
                );
        System.out.println(Localization.isRUDefaultLocale() ?
                String.format(">> Ссылка на статью: %s", articleUrl) :
                String.format(">> Link to the article: %s", articleUrl));
        printSeparator();
    }
}
