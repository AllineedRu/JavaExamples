/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/14-java-arrays
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/14-java-arrays
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
package ru.allineed.samples.arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a2[] = {-1, 22, 37};

        for (int i = 0; i < a1.length; i++) {
            System.out.print((i > 0 ? " " : "") + a1[i]);
        }
        System.out.println();

        for (int i = 0; i < a2.length; i++) {
            System.out.print((i > 0 ? " " : "") + a2[i]);
        }
        System.out.println();

        int[] a3 = new int[a1.length];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = i * (i + 1);
            System.out.print((i > 0 ? " " : "") + a3[i]);
        }

        // [RU] Статическое определение элементов двумерного массива
        // [EN] Static initialization of two-dimensional array
        int[][] b1 = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < b1.length; i++) {
            System.out.println();
            for (int j = 0; j < b1[i].length; j++) {
                System.out.print(b1[i][j] + " ");
            }
        }

        // [RU] Можно также динамически выделить память под массив, не определяя его элементы сразу
        // [EN] You can also allocate the memory for the array dynamically, without initializing its elements at once
        int[][] b2 = new int[3][3];

        // [RU] Задаём значения массива динамически в циклах
        // [EN] Set the values for the array elements dynamically in two 'for' loops
        for (int i = 0; i < b2.length; i++) {
            for (int j = 0; j < b2[i].length; j++) {
                b2[i][j] = i + j;
            }
        }

        // [RU] Выводим значения массива
        // [EN] Print the values of the array elements
        for (int[] b2_lines : b2) {
            System.out.println();
            for (int b2_cell_value : b2_lines) {
                System.out.print(b2_cell_value + " ");
            }
        }
    }
}
