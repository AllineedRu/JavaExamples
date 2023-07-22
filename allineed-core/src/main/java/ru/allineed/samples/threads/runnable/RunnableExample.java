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
package ru.allineed.samples.threads.runnable;

import ru.allineed.samples.common.OutputUtils;

public class RunnableExample {
    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Запускаем потоки в Java",
                "Running threads in Java",
                "https://allineed.ru/development/java-development/83-java-starting-threads");

//        (new Thread(new SomeRunnable("A"))).start();
//        (new Thread(new SomeRunnable("B"))).start();
//        (new Thread(new SomeRunnable("C"))).start();
//        (new Thread(new SomeRunnable("D"))).start();

        // [RU] Вариант с указанием явного приоритета для каждого потока:
        // [EN] Example with explicit setting of priority for each thread:
        Thread threadA = new Thread(new SomeRunnable("A"));
        Thread threadB = new Thread(new SomeRunnable("B"));
        Thread threadC = new Thread(new SomeRunnable("C"));
        Thread threadD = new Thread(new SomeRunnable("D"));


        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadC.setPriority(Thread.MIN_PRIORITY);
        threadD.setPriority(Thread.MIN_PRIORITY);

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
