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

import ru.allineed.samples.config.Localization;

/**
 * [RU] Класс реализует интерфейс Runnable и расчитывает сумму чисел от 1 до 10000 в отедльном потоке.
 * [EN] Class implements Runnable interface and calculates the numbers sum from 1 to 10000 in a separate thread.
 */
public class SomeRunnable implements Runnable {
    private final String runnableName;

    public SomeRunnable(String runnableName) {
        this.runnableName = runnableName;
    }

    public String getRunnableName() {
        return runnableName;
    }

    private int calculateSum() throws InterruptedException {
        int sum = 0, k = 1;
        for (int i = 1; i <= 10000; i++) {
            if (i > k * 1000) {
                System.out.printf(Localization.getLocalized(
                                "Runnable-экземпляр '%s' вычислил сумму для i > %d! Промежуточная сумма равна %d. Поток #%s%n",
                                "Runnable '%s' has calculated sum for i > %d! The intermediate sum is equal to %d. Thread #%s%n"),
                        getRunnableName(), k, sum, Thread.currentThread().getId());
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
        System.out.printf(Localization.getLocalized("Это сообщение из класса '%s'! Имя Runnable-экземпляра: %s, Поток #%s%n", "This is a message from '%s' class! Runnable name: %s, Thread #%s%n"),
                this.getClass().getName(), getRunnableName(), Thread.currentThread().getId());

        try {
            int sum = calculateSum();
            System.out.printf(Localization.getLocalized("Runnable-экземпляр '%s' завершил работу! Итоговая сумма равна %d. Поток #%s%n","Runnable '%s' has finished! The final sum is equal to %d. Thread #%s%n"), getRunnableName(), sum, Thread.currentThread().getId());
        } catch (InterruptedException e) {
            System.out.printf(Localization.getLocalized("Runnable-экземпляр '%s' не завершил работу и был прерван! Поток #%s%n","Runnable '%s' has not finished and has been interrupted! Thread #%s%n"), getRunnableName(), Thread.currentThread().getId());
        }
    }
}
