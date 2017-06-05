package com.cuit.drawdream.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cuit.drawdream.bean.NewsDetail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table NEWS_DETAIL.
*/
public class NewsDetailDao extends AbstractDao<NewsDetail, Long> {

    public static final String TABLENAME = "NEWS_DETAIL";

    /**
     * Properties of entity NewsDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Nede_id = new Property(1, String.class, "nede_id", false, "NEDE_ID");
        public final static Property Nede_title = new Property(2, String.class, "nede_title", false, "NEDE_TITLE");
        public final static Property Nede_author = new Property(3, String.class, "nede_author", false, "NEDE_AUTHOR");
        public final static Property Nede_time = new Property(4, String.class, "nede_time", false, "NEDE_TIME");
        public final static Property Nede_content = new Property(5, String.class, "nede_content", false, "NEDE_CONTENT");
        public final static Property Nede_img = new Property(6, String.class, "nede_img", false, "NEDE_IMG");
    };


    public NewsDetailDao(DaoConfig config) {
        super(config);
    }
    
    public NewsDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'NEWS_DETAIL' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'NEDE_ID' TEXT NOT NULL ," + // 1: nede_id
                "'NEDE_TITLE' TEXT NOT NULL ," + // 2: nede_title
                "'NEDE_AUTHOR' TEXT NOT NULL ," + // 3: nede_author
                "'NEDE_TIME' TEXT NOT NULL ," + // 4: nede_time
                "'NEDE_CONTENT' TEXT NOT NULL ," + // 5: nede_content
                "'NEDE_IMG' TEXT NOT NULL );"); // 6: nede_img
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'NEWS_DETAIL'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, NewsDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getNede_id());
        stmt.bindString(3, entity.getNede_title());
        stmt.bindString(4, entity.getNede_author());
        stmt.bindString(5, entity.getNede_time());
        stmt.bindString(6, entity.getNede_content());
        stmt.bindString(7, entity.getNede_img());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public NewsDetail readEntity(Cursor cursor, int offset) {
        NewsDetail entity = new NewsDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // nede_id
            cursor.getString(offset + 2), // nede_title
            cursor.getString(offset + 3), // nede_author
            cursor.getString(offset + 4), // nede_time
            cursor.getString(offset + 5), // nede_content
            cursor.getString(offset + 6) // nede_img
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, NewsDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNede_id(cursor.getString(offset + 1));
        entity.setNede_title(cursor.getString(offset + 2));
        entity.setNede_author(cursor.getString(offset + 3));
        entity.setNede_time(cursor.getString(offset + 4));
        entity.setNede_content(cursor.getString(offset + 5));
        entity.setNede_img(cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(NewsDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(NewsDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
