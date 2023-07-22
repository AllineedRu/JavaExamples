/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/83-java-starting-threads
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/83-java-starting-threads
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
package ru.allineed.samples.threads.thread;

import ru.allineed.samples.common.OutputUtils;

public class ThreadExample {

    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Запускаем потоки в Java",
                "Running threads in Java",
                "https://allineed.ru/development/java-development/83-java-starting-threads");

        Thread th1 = new SomeThread("A");
        Thread th2 = new SomeThread("B");
        Thread th3 = new SomeThread("C");
        Thread th4 = new SomeThread("D");

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }

}
