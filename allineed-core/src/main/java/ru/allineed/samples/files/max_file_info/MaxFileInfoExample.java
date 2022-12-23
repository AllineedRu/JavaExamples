/**
 * [RU] Класс с примером Java кода из статьи
 * https://allineed.ru/development/java-development/67-java-how-to-find-largest-file
 *
 * [EN] The class with sample Java code from the article
 * https://allineed.ru/development/java-development/67-java-how-to-find-largest-file
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
package ru.allineed.samples.files.max_file_info;

import ru.allineed.samples.common.OutputUtils;
import ru.allineed.samples.config.Localization;

import java.io.File;
import java.util.Arrays;

public class MaxFileInfoExample {
    /**
     * [RU] Класс для хранения информации о самом большом файле
     * [EN] Class for storing the information about the largest file
     */
    public static class MaxFileInfo {
        /**
         * [RU] Хранит размер файла, в байтах
         * [EN] Stores the file size, in bytes
         */
        private long length;

        /**
         * [RU] Имя файла
         * [EN] The file name
         */
        private String fileName;

        public long getLength() {
            return length;
        }

        /**
         * [RU] Возвращает размер файла, в килобайтах
         * [EN] Returns the file size, in Kilobytes
         * @return [RU] размер файла (Кб); [EN] file size (Kb)
         */
        public double getLengthKb() {
            return length / 1024d;
        }

        /**
         * [RU] Возвращает размер файла, в мегабайтах
         * [EN] Returns the file size, in Megabytes
         * @return [RU] размер файла (Мб); [EN] file size (Mb)
         */
        public double getLengthMb() {
            return length / 1048576d;
        }

        public void setLength(long length) {
            this.length = length;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
    }

    /**
     * [RU] Метод рекурсивно вычисляет самый большой файл в каталоге, заданном
     * в параметре {@code parentDirectory} и записывает информацию об этом файле
     * в ссылочную переменную {@code maxFileInfo}, которая не должна содержать
     * пустую ссылку
     * [EN] Method recursively calculates the largest file in the directory, specified
     * in the parameter {@code parentDirectory} and writes info about this file
     * into the reference variable {@code maxFileInfo}, which must not contain null reference
     * @param parentDirectory [RU] Начальный каталог для рекурсивного поиска вглубь; [EN] Starting directory for
     *                        recursive search in depth
     * @param maxFileInfo [RU] Ссылка на экземпляр класса {@link MaxFileInfo}, содержащий информацию о самом большом файле;
     *                    [EN] Reference to an instance of {@link MaxFileInfo} class, containing info about the largest file
     */
    public static void getMaxFileInfo(String parentDirectory, MaxFileInfo maxFileInfo) {
        if (maxFileInfo == null) {
            throw new IllegalArgumentException("`maxFileInfo` parameter cannot be null!");
        }

        File f = new File(parentDirectory);
        File[] files = f.listFiles();

        if (files == null || files.length == 0) {
            return;
        }

        Arrays.stream(files).forEach(file -> {
            if (file.isDirectory()) {
                getMaxFileInfo(file.getPath(), maxFileInfo);
            } else {
                long length = file.length();
                if (length > maxFileInfo.getLength()) {
                    maxFileInfo.setLength(length);
                    maxFileInfo.setFileName(file.getName());
                }
            }
        });
    }

    public static void main(String[] args) {
        OutputUtils.printSampleTitle(
                "Как найти самый большой файл в каталоге при помощи Java",
                "How to find the largest file in the directory using Java",
                "https://allineed.ru/development/java-development/67-java-how-to-find-largest-file");

        // [RU] При желании здесь можно поменять путь к каталогу на что-то вида:
        //          String path = "C:\\DIR1\\SUB_DIR2\\SUB_DIR3";
        // [EN] If you want you can change the path to the target directory with something like:
        //          String path = "C:\\DIR1\\SUB_DIR2\\SUB_DIR3";
        String path = System.getProperty("user.dir");

        MaxFileInfo maxFileInfo = new MaxFileInfo();
        getMaxFileInfo(path, maxFileInfo);

        String resultInfo = Localization.getLocalized(
                String.format("Найден самый большой файл в каталоге '%s': имя = %s, размер = %.2f Мб%n",
                        path,
                        maxFileInfo.getFileName(),
                        maxFileInfo.getLengthMb()
                ),
                String.format("The largest file is found in the directory '%s': name = %s, size = %.2f Mb%n",
                        path,
                        maxFileInfo.getFileName(),
                        maxFileInfo.getLengthMb()
                )
        );

        System.out.println(resultInfo);
    }
}
