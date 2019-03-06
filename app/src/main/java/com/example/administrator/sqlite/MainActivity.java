package com.example.administrator.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import utils.DbManager;
import utils.MySqliteHelper;

public class MainActivity extends AppCompatActivity {

    private MySqliteHelper helper; //helper对象
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my);
        helper = DbManager.getIntance(this);//获得帮助类对象


        /**
         * 点击按钮，创建数据库
         *
         */
    }
//点击按钮创建数据库
    public void createDB(View view){
        /**
         * getReadableDatabase与getWritableDatabase 创建或打开数据库
         * 如果数据库不存在则创建数据库，如果数据库存在直接打开数据库
         * 默认情况下两个函数都表示打开或者创建可读可写的数据库对象
         */
       SQLiteDatabase db =  helper.getWritableDatabase();//创建或打开数据库

    }
}
