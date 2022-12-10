/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/64-java-comparable-interface
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/64-java-comparable-interface
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
package ru.allineed.samples.comparable;

/**
 * [RU] Класс описывает подарочную коробку с характеристиками ширины (width), длины (length) и высоты (height)
 * в сантиметрах<br/>
 * [EN] Class describes a gift box with characteristics of width, length and height in centimeters
 */
public class GiftBox implements Comparable<GiftBox> {
    /**
     * [RU] Название подарочной коробки;<br/>
     * [EN] The name of the gift box
     */
    private final String name;

    /**
     * [RU] Ширина коробки (см);<br/>
     * [EN] The width of the gift box (cm)
     */
    private final int width;

    /**
     * [RU] Высота коробки (см);<br/>
     * [EN] The height of the gift box (cm)
     */
    private final int height;

    /**
     * [RU] Длина коробки (см);<br/>
     * [EN] The length of the gift box (cm)
     */
    private final int length;

    /**
     * [RU] Конструктор с параметрами, создающий коробку по заданной ширине (width), высоте (height) и длине (length)<br/>
     * [EN] Constructor with parameters that creates a new gift box by specified width, height and length
     * @param width [RU] ширина коробки; [EN] the width of the box
     * @param height [RU] высота коробки; [EN] the height of the box
     * @param length [RU] длина коробки; [EN] the length of the box
     */
    public GiftBox(String name, int width, int height, int length) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    /**
     * [RU] Возвращает название подарочной коробки;<br/>
     * [EN] Returns the name of the gift box
     */
    public String getName() {
        return name;
    }

    /**
     * [RU] Возвращает ширину подарочной коробки;<br/>
     * [EN] Returns the width of the gift box
     */
    public int getWidth() {
        return width;
    }

    /**
     * [RU] Возвращает высоту подарочной коробки;<br/>
     * [EN] Returns the height of the gift box
     */
    public int getHeight() {
        return height;
    }

    /**
     * [RU] Возвращает длину подарочной коробки;<br/>
     * [EN] Returns the length of the gift box
     */
    public int getLength() {
        return length;
    }

    /**
     * [RU] Вычисляет и возвращает объём коробки (куб. см.)<br/>
     * [EN] Calculates and returns the volume of the box (cubic cm)
     * @return [RU] целое число, равное объему коробки; [EN] an integer representing the volume of the box
     */
    public int getVolume() {
        return height * width * length;
    }

    /**
     * [RU] Переопределённый метод интерфейса {@link Comparable} для сравнения двух коробок - текущей и
     * переданной в параметре 'that'<br/>
     * [EN] An overridden method of {@link Comparable} interface for comparing two boxes - the current box
     * instance and another that is passed in 'that' input parameter
     * @param that [RU] объект коробки для сравнения с текущим; [EN] the object to be compared with the current instance
     * @return [RU] отрицательное значение -1, если текущая коробка больше переданной в параметре 'that',
     * 0, если текущая коробка равна переданной в параметре 'that', 1, если текущая коробка меньше переданной в
     * параметре 'that'; [EN] a negative integer value -1 in case current box is greater than the box in the parameter
     * 'that', 0 in case current box is equal to 'that' box, 1 in case current box is less than 'that' box.
     * @throws NullPointerException [RU] если {@code that} равен null; [EN] if {@code that} is null
     */
    @Override
    public int compareTo(GiftBox that) {
        int thatVolume = that.getVolume();
        int thisVolume = getVolume();

        if (thisVolume < thatVolume) {
            return -1;
        } else if (thisVolume > thatVolume) {
            return 1;
        }
        return 0;
    }

    /**
     * [RU] Преобразует текущий экземпляр подарочной коробки в строковое представление<br/>
     * [EN] Transforms the current instance of the gift box into the string representation
     * @return [RU] строка, содержащая детали о текущем экземпляре подарочной коробки;
     * [EN] the string containing the details about the current gift box instance
     */
    @Override
    public String toString() {
        return "GiftBox{" +
                "name='" + name + "'" +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
