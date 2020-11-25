package com.example.agriculture

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.*

class AgriCultureDatabase(contex: Context) :
    ManagedSQLiteOpenHelper(ctx = contex, name = "agriculture.db", version = 1) {

    companion object {
        private var instance: AgriCultureDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): AgriCultureDatabase {
            if (instance == null) {
                instance = AgriCultureDatabase(ctx.getApplicationContext())
            }
            return instance!!
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.createTable("duvida", true,
            "id" to INTEGER + PRIMARY_KEY + UNIQUE,
            "duvida" to TEXT
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}

val Context.database: AgriCultureDatabase
    get() = AgriCultureDatabase.getInstance(getApplicationContext())