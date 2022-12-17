/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/8-java-system-properties
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/8-java-system-properties
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
package ru.allineed.samples.properties;

import ru.allineed.samples.common.OutputUtils;

import java.util.Properties;

public class SystemPropertiesExample {
    public static void main( String[] args )
    {
        OutputUtils.printSampleTitle(
                "Читаем свойства окружения в Java с помощью System.getProperties()",
                "Reading env properties in Java using System.getProperties()",
                "https://allineed.ru/development/java-development/8-java-system-properties");

        Properties properties = System.getProperties();
        properties.stringPropertyNames().forEach(
                pName -> System.out.printf("System Property: { name = \"%s\", value = \"%s\" }%n", pName, properties.getProperty(pName))
        );
    }
}
