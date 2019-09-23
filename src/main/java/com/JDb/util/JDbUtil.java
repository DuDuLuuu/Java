package com.JDb.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author:JDb
 * @Date:2019/9/20 app端返回体过滤
 */
public class JDbUtil {
    /**
     * 从from中取值并赋值给to中同名属性
     * @param from
     * @param to
     */
    public static void fillFields(Object from, Object to) {
        Class<?> toClass = to.getClass();
        Class<?> fromClass = from.getClass();

        Arrays.stream(getAllField(toClass)).forEach(field -> {
            try {
                Field fromField = fromClass.getDeclaredField(field.getName());
                if (fromField != null) {
                    fromField.setAccessible(true);
                    field.setAccessible(true);
                    field.set(to, fromField.get(from));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    /**
     * 获取所有属性，包括父类、私有
     * @param aClass
     * @return
     */
    private static Field[] getAllField(Class<?> aClass) {
        Set<Field> set = new HashSet<>();
        Class<?> superclass;
        Arrays.stream(aClass.getDeclaredFields()).forEach(field -> set.add(field));
        while ((superclass = aClass.getSuperclass()) != null) {
            Arrays.stream(superclass.getDeclaredFields()).forEach(superField->set.add(superField));
            aClass = superclass;
        }
        return set.toArray(new Field[set.size()]);
    }
}
