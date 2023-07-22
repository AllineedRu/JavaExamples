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

import ru.allineed.samples.config.Localization;

/**
 * [RU] Класс является наследником родительского класса Thread
 * [EN] Class is a child of Thread parent class
 */
public class SomeThread extends Thread {
    private final String threadName;

    public SomeThread(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    private int calculateSum() throws InterruptedException {
        int sum = 0, k = 1;
        for (int i = 1; i <= 10000; i++) {
            if (i > k * 1000) {
                System.out.printf(Localization.getLocalized(
                                "Поток с именем '%s' вычислил сумму для i > %d! Промежуточная сумма равна %d. Поток #%s%n",
                                "Thread '%s' has calculated sum for i > %d! The intermediate sum is equal to %d. Thread #%s%n"),
                        getThreadName(), k, sum, Thread.currentThread().getId());
                k++;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            sum += i;
        }
        return sum;
    }

    @Override
    public void run() {
        System.out.printf(Localization.getLocalized("Это сообщение из класса '%s'! Имя потока: %s, Поток #%s%n", "This is a message from '%s' class! Runnable name: %s, Thread #%s%n"),
                this.getClass().getName(), getThreadName(), Thread.currentThread().getId());

        try {
            int sum = calculateSum();
            System.out.printf(Localization.getLocalized("Поток с именем '%s' завершил работу! Итоговая сумма равна %d. Поток #%s%n","Runnable '%s' has finished! The final sum is equal to %d. Thread #%s%n"), getThreadName(), sum, Thread.currentThread().getId());
        } catch (InterruptedException e) {
            System.out.printf(Localization.getLocalized("Поток с именем '%s' не завершил работу и был прерван! Поток #%s%n","Runnable '%s' has not finished and has been interrupted! Thread #%s%n"), getThreadName(), Thread.currentThread().getId());
        }
    }
}
