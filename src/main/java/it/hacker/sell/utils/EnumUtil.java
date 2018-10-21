package it.hacker.sell.utils;

import it.hacker.sell.enums.CodeEnum;

/**
 * @author wqh
 * @date 18-10-21
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
