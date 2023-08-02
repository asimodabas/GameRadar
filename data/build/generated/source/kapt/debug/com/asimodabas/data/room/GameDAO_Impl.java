package com.asimodabas.data.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.asimodabas.data.model.Detail;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class GameDAO_Impl implements GameDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Detail> __insertionAdapterOfDetail;

  private final EntityDeletionOrUpdateAdapter<Detail> __deletionAdapterOfDetail;

  public GameDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDetail = new EntityInsertionAdapter<Detail>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `games` (`id`,`name`,`released`,`playtime`,`description`,`reddit_url`,`website`,`metacritic`,`imageUrl`,`wishlist`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Detail value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getReleased() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getReleased());
        }
        if (value.getPlaytime() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPlaytime());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getReddit_url() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getReddit_url());
        }
        if (value.getWebsite() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWebsite());
        }
        if (value.getMetacritic() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getMetacritic());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getImageUrl());
        }
        final int _tmp = value.getWishlist() ? 1 : 0;
        stmt.bindLong(10, _tmp);
      }
    };
    this.__deletionAdapterOfDetail = new EntityDeletionOrUpdateAdapter<Detail>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `games` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Detail value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(final Detail gameDetail) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDetail.insert(gameDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Detail gameDetail) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDetail.handle(gameDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object getDetail(final Continuation<? super List<Detail>> $completion) {
    final String _sql = "SELECT * FROM games";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Detail>>() {
      @Override
      public List<Detail> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "released");
          final int _cursorIndexOfPlaytime = CursorUtil.getColumnIndexOrThrow(_cursor, "playtime");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfRedditUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "reddit_url");
          final int _cursorIndexOfWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "website");
          final int _cursorIndexOfMetacritic = CursorUtil.getColumnIndexOrThrow(_cursor, "metacritic");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfWishlist = CursorUtil.getColumnIndexOrThrow(_cursor, "wishlist");
          final List<Detail> _result = new ArrayList<Detail>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Detail _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpReleased;
            if (_cursor.isNull(_cursorIndexOfReleased)) {
              _tmpReleased = null;
            } else {
              _tmpReleased = _cursor.getString(_cursorIndexOfReleased);
            }
            final String _tmpPlaytime;
            if (_cursor.isNull(_cursorIndexOfPlaytime)) {
              _tmpPlaytime = null;
            } else {
              _tmpPlaytime = _cursor.getString(_cursorIndexOfPlaytime);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpReddit_url;
            if (_cursor.isNull(_cursorIndexOfRedditUrl)) {
              _tmpReddit_url = null;
            } else {
              _tmpReddit_url = _cursor.getString(_cursorIndexOfRedditUrl);
            }
            final String _tmpWebsite;
            if (_cursor.isNull(_cursorIndexOfWebsite)) {
              _tmpWebsite = null;
            } else {
              _tmpWebsite = _cursor.getString(_cursorIndexOfWebsite);
            }
            final Integer _tmpMetacritic;
            if (_cursor.isNull(_cursorIndexOfMetacritic)) {
              _tmpMetacritic = null;
            } else {
              _tmpMetacritic = _cursor.getInt(_cursorIndexOfMetacritic);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            _item = new Detail(_tmpId,_tmpName,_tmpReleased,_tmpPlaytime,_tmpDescription,_tmpReddit_url,_tmpWebsite,_tmpMetacritic,_tmpImageUrl);
            final boolean _tmpWishlist;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfWishlist);
            _tmpWishlist = _tmp != 0;
            _item.setWishlist(_tmpWishlist);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
