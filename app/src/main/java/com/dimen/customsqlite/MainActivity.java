package com.dimen.customsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dimen.customsqlite.db.BaseDaoFactory;
import com.dimen.customsqlite.db.IBaseDao;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    IBaseDao<User> baseDao;
    IBaseDao<FileBen> fileDao;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // baseDao = BaseDaoFactory.getInstane().getDataHelper(UserDao.class, User.class);
        fileDao = BaseDaoFactory.getInstane().getDataHelper(FileDao.class, FileBen.class);
    }

    public void brn_insert(View view)
    {

        for (int i = 0; i < 100; i++)
        {
            FileBen fileBen = new FileBen();
            fileBen.setTime("2020-4-23");
            fileBen.setPath("/data/data/dimen");
            fileBen.setDescription("添加数据：" + i);
            fileDao.insert(fileBen);

        }

        for (int i = 0; i < 1000; i++)
        {
            FileBen fileBen = new FileBen();
            fileBen.setTime(System.currentTimeMillis() + "");
            fileBen.setPath("/data/data/dimen" + i);
            fileBen.setDescription("添加数据：" + i);
            fileDao.insert(fileBen);
        }


    }

    public void brn_modify(View view)
    {
        FileBen fileBen = new FileBen("2020-4-23", "/data/data/dimen1", "插入数据文件描写333");

        FileBen where = new FileBen();
        where.setPath("/data/data/dimen");
        int update = fileDao.update(fileBen, where);
        Log.e("ss", "brn_modify: " + update);
    }

    public void brn_delete(View view)

    {

        FileBen where = new FileBen();
        where.setTime("2020-4-23");
        fileDao.delete(where);


    }

    public void brn_check(View view)
    {
        FileBen where = new FileBen();
        where.setTime("2020-4-23");
        List<FileBen> query = fileDao.query(where);
        Log.e("ss", "查询到的数据: " + query.size());

    }
}
