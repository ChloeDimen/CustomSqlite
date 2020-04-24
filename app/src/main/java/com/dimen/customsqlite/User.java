package com.dimen.customsqlite;

import com.dimen.customsqlite.db.annotion.DbFiled;
import com.dimen.customsqlite.db.annotion.DbTable;

/**
 * 文件名：com.dimen.customsqlite
 * 描    述：
 * 作    者：Dimen
 * 时    间：2020/4/16
 */
@DbTable("tb_user")
public class User {
    public User() {

    }

    public User(String name, String pasword) {
        this.name = name;
        this.pasword = pasword;
    }

    @DbFiled("name")
    public String name;

    @DbFiled("password")
    public String pasword;
}
