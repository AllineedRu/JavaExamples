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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderWithLines {
    public void readFile(String pathToFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile));
            bufferedReader.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File '" + pathToFile + "' was not found! It must be present on the disk to run the sample.", e);
        }
    }
}
