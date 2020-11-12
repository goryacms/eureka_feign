package com.example.feign4.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

@UtilityClass
public class FileTestUtils {

    /**
     * Получить содержимое файла в виде строки UTF-8.
     *
     * @param filename имя файла
     * @param clazz    класс рядом с подгружаемым файлом
     * @return содержимое файла виде строки UTF-8
     */
    public static String stringFromFile(String filename, Class clazz) {
        InputStream is = clazz.getClassLoader().getResourceAsStream(filename);
        if (is == null) {
            throw new RuntimeException("File " + filename + " not found");
        }
        try {
            return IOUtils.toString(is, "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}