/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/66-java-reading-xml-via-sax-parser
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/66-java-reading-xml-via-sax-parser
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
package ru.allineed.samples.xml;

import org.xml.sax.SAXException;
import ru.allineed.samples.common.OutputUtils;
import ru.allineed.samples.config.Localization;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

public class XmlParserExample {
    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Читаем на Java файл XML с помощью SAX-парсера",
                "Reading an XML file with Java using SAX parser",
                "https://allineed.ru/development/java-development/66-java-reading-xml-via-sax-parser");

        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = parserFactory.newSAXParser();
            XmlBookLibraryHandler xmlBookLibraryHandler = new XmlBookLibraryHandler();

            try (InputStream ins = XmlParserExample.class.getClassLoader().getResourceAsStream("xml/xml_parser_example.xml")) {
                parser.parse(ins, xmlBookLibraryHandler);
                BookLibrary library = xmlBookLibraryHandler.getLibrary();

                String authorsTitle = Localization.getLocalized(
                        "Зарегистрированные в библиотеке авторы:",
                        "Authors registered in the Library:");

                library.printAllAuthors(authorsTitle);
                System.out.println();

                String booksTitle = Localization.getLocalized(
                        "Зарегистрированные в библиотеке книги:",
                        "Books registered in the Library:");
                library.printAllBooks(booksTitle);

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }
}
