package com.cooking.info.cooking.Db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by Naser on 5/24/2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static String COOKING_DB_PATH = "";// "/data/data/"+  +"/databases/";
    private static String COOKING_DB_NAME = "Cooking.db";
    private HashMap hp;

    private Context myContext;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        myContext = context;
        COOKING_DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
    }

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
        myContext = context;
        COOKING_DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }


    public File CheckPath() throws IOException {
        String destinationPath = COOKING_DB_PATH;

        File destination = new File(destinationPath);

        if (!destination.exists()) {
            destination.mkdir();
            destination.createNewFile();
        }

        File database= myContext.getDatabasePath("Cooking.db");

        if(!database.exists()){
            CopyDatabase(myContext.getAssets().open(COOKING_DB_NAME), new FileOutputStream(COOKING_DB_PATH +COOKING_DB_NAME));
        }

        return database;
    }

    public void CopyDatabase(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buffer=new byte[1024];
        int length;
        while ((length=inputStream.read(buffer))>0){
            outputStream.write(buffer,0,length);
        }

        inputStream.close();
        outputStream.close();
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        // sqLiteDatabase.execSQL("DROP TABLE IF EXISTS chargeTransaction");
        // sqLiteDatabase.execSQL("DROP TABLE IF EXISTS paymentTransaction");
        onCreate(sqLiteDatabase);
    }




    private String getDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }

}
