/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/22-java-reading-data-from-file
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/22-java-reading-data-from-file
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
package ru.allineed.samples.io;

import ru.allineed.samples.common.OutputUtils;

public class ReadingFileExample {
    public static final String PATH_TO_FILE = System.getProperty("user.dir") + "/allineed-core/src/main/resources/io/mydata.txt";

    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Читаем данные из файла с помощью Java",
                "Reading data from file in Java",
                "https://allineed.ru/development/java-development/22-java-reading-data-from-file");

        BufferedReaderWithCycle bufferedReaderWithCycle = new BufferedReaderWithCycle();
        bufferedReaderWithCycle.readFile(PATH_TO_FILE);

        BufferedReaderWithLines bufferedReaderWithLines = new BufferedReaderWithLines();
        bufferedReaderWithLines.readFile(PATH_TO_FILE);
    }
}
