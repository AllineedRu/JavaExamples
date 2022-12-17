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

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class XmlBookLibraryHandler extends DefaultHandler {
    public static final String BOOKS_NODE = "books";
    public static final String BOOK_NODE = "book";
    public static final String AUTHOR_NAME_NODE = "author_name";
    public static final String TITLE_NODE = "title";
    public static final String DATE_PUBLISHED_NODE = "date_published";
    public static final String AUTHORS_NODE = "authors";
    public static final String AUTHOR_NODE = "author";
    public static final String NAME_NODE = "name";
    public static final String DATE_BORN_NODE = "date_born";
    private StringBuilder currentElementText;
    private BookLibrary library;
    public BookLibrary getLibrary() {
        return library;
    }

    @Override
    public void startDocument() throws SAXException {
        library = new BookLibrary();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentElementText == null) {
            return;
        }
        currentElementText.append(ch, start, length);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case BOOKS_NODE:
                library.createBooksList();
                break;
            case BOOK_NODE:
                library.createBook();
                break;
            case AUTHORS_NODE:
                library.createAuthorsList();
                break;
            case AUTHOR_NODE:
                library.createAuthor();
                break;
            case AUTHOR_NAME_NODE:
            case TITLE_NODE:
            case DATE_PUBLISHED_NODE:
            case NAME_NODE:
            case DATE_BORN_NODE:
                currentElementText = new StringBuilder();
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case AUTHOR_NAME_NODE:
                library.setCurrentBookAuthorName(currentElementText.toString());
                break;
            case TITLE_NODE:
                library.setCurrentBookTitle(currentElementText.toString());
                break;
            case DATE_PUBLISHED_NODE:
                library.setCurrentBookDatePublished(currentElementText.toString());
                break;
            case NAME_NODE:
                library.setCurrentAuthorName(currentElementText.toString());
                break;
            case DATE_BORN_NODE:
                library.setCurrentAuthorDateBorn(currentElementText.toString());
                break;
        }
    }
}
