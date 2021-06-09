package top.faroz.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CopyUtil
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/9 上午11:44
 * @Version 1.0
 **/
public class CopyUtil {

    /**
     * 按照属性名，复制对象信息
     * @param source
     * @param c
     * @param <T>
     * @return
     */
    public static<T> T copy(Object source,Class<T> c) {
        T target = null;
        try {
            target = c.newInstance();
            BeanUtils.copyProperties(source,target);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return target;
    }

    /**
     * 复制列表
     * @param source
     * @param c
     * @param <T>
     * @return
     */
    public static<T> List<T> copyList(List source,Class<T> c) {
        if (source==null || source.size()==0) {
            return null;
        }
        List<T> target = new ArrayList<>();
        for (Object o : source) {
            T copy = copy(o, c);
            target.add(copy);
        }
        return target;
    }

}
