package com.dimen.customsqlite;

import com.dimen.customsqlite.db.annotion.DbFiled;
import com.dimen.customsqlite.db.annotion.DbTable;

/**
 * 文件名：com.dimen.customsqlite
 * 描    述：
 * 作    者：Dimen
 * 时    间：2020/4/23
 */
@DbTable("tb_file")
public class FileBen {


    private String time;
    @DbFiled("path")
    private String path;
    public String description;

    public FileBen()
    {

    }

    public FileBen(String time, String path, String description) {
        this.time = time;
        this.path = path;
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
