package com.example.remorgnew;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private  static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="UserManager.db";
    private static final String TABLE_USER="user";
    private static final String COLUMN_USER_ID="user_id";
    private static final String COLUMN_USER_NAME="user_name";
    private static final String COLUMN_USER_EMAIL ="user_email";
    private static final String COLUMN_USER_PASSWORD="user_password";
    private String CREATE_USER_TABLE="CREATE TABLE "+TABLE_USER+"("
            + COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_USER_NAME + " TEXT,"
            + COLUMN_USER_EMAIL + " TEXT," + COLUMN_USER_PASSWORD + " TEXT" + ")";
    private String DROP_USER_TABLE ="DROP TABLE IF EXISTS " + TABLE_USER;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_USER_TABLE);
        onCreate(db);

    }
    public  void  addUser(User user){
        SQLiteDatabase database=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(COLUMN_USER_NAME,user.getName());
        values.put(COLUMN_USER_EMAIL,user.getEmail());
        values.put(COLUMN_USER_PASSWORD,user.getPassword());
        database.insert(TABLE_USER,null,values);
        database.close();
    }
    public boolean checkUser(String email){
        String[] columns={COLUMN_USER_ID};
        SQLiteDatabase database=this.getReadableDatabase();
        String selection=COLUMN_USER_EMAIL + "= ?";
        String[] selectionArgs={email};
        Cursor cursor=database.query(TABLE_USER,columns,selection,selectionArgs,null,null,null);
        int cursorCount=cursor.getCount();
        cursor.close();
        database.close();
        if(cursorCount>0){
            return true;
        }
        return  false;
    }
    public Boolean checkPassword(String email,String password){
        SQLiteDatabase database=this.getReadableDatabase();
        String[] columns={COLUMN_USER_ID,COLUMN_USER_PASSWORD};

        String selection=COLUMN_USER_EMAIL + "= ? "+ "AND " +COLUMN_USER_PASSWORD + "=?";
        String[] selectionArgs={email,password};
        Cursor cursor=database.query(TABLE_USER,columns,selection,selectionArgs,null,null,null);
        int cursorCount=cursor.getCount();
        cursor.close();
        database.close();
        if(cursorCount>0){
            return true;
        }
        return  false;
       // String query = " SELECT * FROM " + TABLE_USER + " WHERE "+ COLUMN_USER_EMAIL+ " =" + email ;
        //Cursor  cursor = database.rawQuery(query,null);
       // String pass=cursor.getString(3);
       // if (pass.isEmpty()||pass!=password)
       // {return  false;}
       // else
           // return true;
      /*  if (cursor.moveToFirst()) {
            while (cursor.isAfterLast() != true) {
                String itemname =  cursor.getString(cursor.getColumnIndex(COLUMN_USER_PASSWORD));
                return itemname;
            }
        }*/

        //Cursor cursor=database.rawQuery("Select * from "+TABLE_USER+" where "+COLUMN_USER_EMAIL + " = " +email+ " and " + COLUMN_USER_PASSWORD + " = "+pass,null);
     //   Cursor cursor=database.rawQuery("Select * from "+ TABLE_USER+" where"+COLUMN_USER_EMAIL+" = ?"+"and"+ COLUMN_USER_PASSWORD+" = ?",new String[] {email,pass});
      //  cursor.close();
       // database.close();
      //  if(cursor.getCount()>0){
          //  return true;
      //  }
      //  return false;

    }

}
