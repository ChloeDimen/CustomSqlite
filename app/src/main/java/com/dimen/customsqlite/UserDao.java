package com.dimen.customsqlite;

import com.dimen.customsqlite.db.BaseDao;

import java.util.List;

/**
 * 文件名：com.dimen.customsqlite
 * 描    述：
 * 作    者：Dimen
 * 时    间：2020/4/16
 */

public class UserDao extends BaseDao {
    @Override
    protected String createTable() {
        return "create table if not exists tb_user(name varchar(20),password varchar(10))";

    }


    @Override
    public List query(String sql)
    {
        return null;
    }
}
