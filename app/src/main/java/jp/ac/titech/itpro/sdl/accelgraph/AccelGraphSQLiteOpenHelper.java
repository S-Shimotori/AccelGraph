package jp.ac.titech.itpro.sdl.accelgraph;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by S-Shimotori on 5/13/16.
 */
public class AccelGraphSQLiteOpenHelper extends SQLiteOpenHelper {
    static final String DB = "sqlite_sample.db";
    static final int DB_VERSION = 1;
    static final String CREATE_TABLE = "create table mytable ( _id integer primary key autoincrement, data real not null );";
    static final String DROP_TABLE = "drop table mytable;";
    public AccelGraphSQLiteOpenHelper(Context c) {
        super(c, DB, null, DB_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }
}
