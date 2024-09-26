package ru.web_learn.swsiteservice.staticutils;

public class StringUtils {
    /**
     * Проверяет, что строка не пустая
     * @param str строка
     * @return true - не пустая, false - пустая
     */
    public static boolean isStrNotEmpty(String str){
        return ((str != null) && (str.length() > 0));
    }

    /**
     * Проверяет, что строка пустая
     * @param str строка
     * @return true - пустая, false - не пустая
     */
    public static boolean isStrEmpty(String str){
        return ((str == null) || (str.length() == 0));
    }
}
