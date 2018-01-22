package tv.seei.manage.base.dao;

import java.io.Serializable;

public interface BaseDao<T extends Serializable> {
    public void create(T entity);
    public void update(T entity);
    public void delete(Serializable id);
    public T get(Serializable id);

}
