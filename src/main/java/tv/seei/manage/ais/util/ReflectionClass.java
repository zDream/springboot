package tv.seei.manage.ais.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

public class ReflectionClass {
    //反射实现 数组赋值给java对象
    public static  <T> T invokeMethod(List list, Class<T> clazz) throws Exception {
        T t = clazz.newInstance();
//        Object obj = RemoteAutoIdentification.class.newInstance();//创建对象实例
        Field[] fields = t.getClass().getDeclaredFields();
        for (int i = 0,j=0; i<list.size()+2;i++){
            Field f = fields[i];
            if(Modifier.isStatic(f.getModifiers()) || f.getName()=="id"){
                continue;
            }
            PropertyDescriptor pd = new PropertyDescriptor(f.getName(), t.getClass());
            Method m = pd.getWriteMethod();//获取对象的写入方法
            m.invoke(t, list.get(j++).toString());
        }
        return t;
    }
}
