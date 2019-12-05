package com.example.funcionalidades.Room.pojo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @ColumnInfo(name = "word")
    @NonNull
    private String mWord;

    public Word(String word) {this.mWord = word;}

    public String getWord(){return this.mWord;}
}