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

public class Book {
    private String title;
    private String authorName;
    private String datePublished;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", datePublished='" + datePublished + '\'' +
                '}';
    }
}
