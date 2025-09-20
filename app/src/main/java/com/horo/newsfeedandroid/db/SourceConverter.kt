package com.horo.newsfeedandroid.db

import androidx.room.TypeConverter
import com.horo.newsfeedandroid.models.Source

class SourceConverter {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.id + "*" + source.name
    }

    @TypeConverter
    fun toSource(sourceString: String): Source {
        val list = sourceString.split("*")
        return Source(list.first(), list.last())
    }
}
