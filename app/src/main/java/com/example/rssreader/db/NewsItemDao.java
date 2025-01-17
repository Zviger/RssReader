package com.example.rssreader.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.rssreader.model.NewsItem;

import java.util.List;

@Dao
public interface NewsItemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNewsItem(NewsItem newsItem);

    @Delete
    void deleteNewsItem(NewsItem newsItem);

    @Update
    void updateNewsItem(NewsItem newsItem);

    @Query("SELECT * FROM newsItems")
    List<NewsItem> getNewsItems();

    @Query("SELECT * FROM newsItems WHERE id = :newsItemId")
    NewsItem getNewsItemById(int newsItemId);

}
