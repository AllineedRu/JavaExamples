/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/12-consumer-java-functional-interface
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/12-consumer-java-functional-interface
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
package ru.allineed.samples.consumer_interface;

import ru.allineed.samples.common.OutputUtils;
import ru.allineed.samples.config.Localization;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static class Animal {
        private String name;
        private String color;

        public Animal(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Функциональный интерфейс Consumer в Java",
                "Consumer functional interface in Java",
                "https://allineed.ru/development/java-development/12-consumer-java-functional-interface");

        List<Animal> animals = Arrays.asList(new Animal("Cat", "black"), new Animal("Dog", "brown"));
        Consumer<Animal> animalConsumer = animal -> System.out.println("Feeding the animal: " + animal);

        // [RU] Передаём экземпляр интерфейса Consumer в forEach:
        // [EN] Passing an instance of Consumer interface into forEach:
        Localization.printLocalized(
                "Передаём экземпляр интерфейса Consumer в forEach:",
                "Passing an instance of Consumer interface into forEach:");
        animals.forEach(animalConsumer);

        // [RU] Передаём лямбду напрямую в forEach:
        // [EN] Passing lambda directly into forEach:
        Localization.printLocalized(
                "Передаём лямбду напрямую в forEach",
                "Passing lambda directly into forEach:");
        animals.forEach(animal -> System.out.println("Feeding the animal: " + animal));

        // [RU] Создаём анонимный инстанс интерфейса Consumer
        // [EN] Create anonymous instance of Consumer interface:
        Localization.printLocalized(
                "Создаём анонимный инстанс интерфейса Consumer",
                "Create anonymous instance of Consumer interface:");
        animals.forEach(new Consumer<Animal>() {
            @Override
            public void accept(Animal animal) {
                System.out.println("Feeding the animal: " + animal);
            }
        });

        doSomeOperation(animalConsumer);
    }

    public static void doSomeOperation(Consumer<Animal> animalConsumer) {
        List<Animal> animals = Arrays.asList(new Animal("Cat", "black"), new Animal("Dog", "brown"));

        Localization.printLocalized(
                "Перед выполнением операции",
                "Before the operation");

        animals.forEach(animalConsumer);

        Localization.printLocalized(
                "После выполнения операции",
                "After the operation");
    }
}
