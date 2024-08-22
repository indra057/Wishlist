package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(

    @PrimaryKey(autoGenerate = true)
    val id:Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title:String = "",
    @ColumnInfo(name = "wish-desc")
    val description:String = ""
)
object DummyWish{
    val wishlist = listOf(
        Wish(title = "watch3", description = "something something"),
        Wish(title = "bla bla", description = "woqirug something"),
        Wish(title = "h4tegr", description = "qlgthkwuh something"),
        Wish(title = "wai35tugw4kyhtch3", description = "someiuqerugwtyriupthing something")
    )
}