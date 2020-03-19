package com.springboot.demo.common;
/**
 * @author  : ldb
 * @version : 1.0
 */
public interface CommonEnum {
    Integer getValue();
    String getMsg();

    static <T extends CommonEnum> T getEnumByCode(Class<T> clazz, Integer code) {
        for(T _enum : clazz.getEnumConstants()) {
            if (code.equals(_enum.getValue())) {
                return _enum;
            }
        }
        return null;
    }

    static <T extends CommonEnum> T getEnumByName(Class<T> clazz, String name) {
        for(T _enum : clazz.getEnumConstants()) {
            if (_enum.getMsg().equals(name)) {
                return _enum;
            }
        }
        return null;
    }
}
