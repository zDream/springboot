package tv.seei.manage.base.dao.impl;

import tv.seei.manage.base.dao.BaseDao;

import java.io.Serializable;

public class BaseDaoImpl<T extends Serializable> implements BaseDao {

    @Override
    public void create(Serializable entity) {

    }

    @Override
    public void update(Serializable entity) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public Serializable get(Serializable id) {
        return null;
    }
}
