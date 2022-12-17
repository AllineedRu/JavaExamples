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

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private List<Author> authors;
    private List<Book> books;

    public void createAuthorsList() {
        authors = new ArrayList<>();
    }

    public void createAuthor() {
        authors.add(new Author());
    }

    public void createBooksList() {
        books = new ArrayList<>();
    }

    public void createBook() {
        books.add(new Book());
    }

    private void validateBooks() {
        if (books == null || books.isEmpty()) {
            throw new IllegalStateException("We don't have any books in the library!");
        }
    }
    private Book getCurrentBook() {
        validateBooks();
        return books.get(books.size() - 1);
    }

    private void validateAuthors() {
        if (authors == null || authors.isEmpty()) {
            throw new IllegalStateException("We don't have any authors in the library!");
        }
    }

    private Author getCurrentAuthor() {
        validateAuthors();
        return authors.get(authors.size() - 1);
    }

    public void setCurrentBookTitle(String title) {
        getCurrentBook().setTitle(title);
    }
    public void setCurrentBookAuthorName(String authorName) {
        getCurrentBook().setAuthorName(authorName);
    }

    public void setCurrentBookDatePublished(String datePublished) {
        getCurrentBook().setDatePublished(datePublished);
    }

    public void setCurrentAuthorName(String name) {
        getCurrentAuthor().setName(name);
    }

    public void setCurrentAuthorDateBorn(String dateBorn) {
        getCurrentAuthor().setDateBorn(dateBorn);
    }

    public void printAllBooks(String title) {
        validateBooks();
        System.out.println(title);
        books.forEach(System.out::println);
    }

    public void printAllAuthors(String title) {
        validateAuthors();
        System.out.println(title);
        authors.forEach(System.out::println);
    }
}
