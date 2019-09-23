package com.JDb.util;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author:JDb
 * @Date:2019/9/20 app端返回体过滤
 */
public class JDbUtil {
    /**
     * 从from中取值 给to中同名属性
     * @param from
     * @param to
     */
    public static void fillData(Object from, Object to) {
        Class<?> toClass = to.getClass();
        Class<?> fromClass = from.getClass();

        Field[] allField = getAllField(toClass);
        for (Field field : allField) {
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
        }
    }

    /**
     * 获取所有属性，包括父类、私有
     * @param aClass
     * @return
     */
    private static Field[] getAllField(Class<?> aClass) {
        Set<Field> set = new HashSet<>();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            set.add(field);
        }
        Class<?> superclass;
        Class<?> currentClass = aClass;
        while ((superclass = currentClass.getSuperclass()) != null) {
            Field[] superFields = superclass.getDeclaredFields();
            for (Field superField : superFields) {
                set.add(superField);
            }
            currentClass = superclass;
        }
        Field[] rs = new Field[set.size()];
        int index = 0;
        for (Field field : set) {
            rs[index++] = field;
        }
        return rs;
    }
}
