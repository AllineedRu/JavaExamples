/**
 * [RU] Интерфейс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/13-java-functional-interface-example
 *
 * [EN] The interface with sample Java code from the article
 * https://allineed.ru/development/java-development/13-java-functional-interface-example
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
package ru.allineed.samples.functional_interface;

/**
 * [RU] Интерфейс выполняет операции над числами с типом Integer<br/>
 * [EN] The interface performs operations between numbers of Integer type
 */
public interface IntegerArithmeticOperation extends ArithmeticOperation<Integer> {
}
