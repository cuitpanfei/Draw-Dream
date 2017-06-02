package com.cuit.drawdream.bean;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.cuit.drawdream.bean.AppInfoEntity;
import com.cuit.drawdream.bean.UserInfoEntity;
import com.cuit.drawdream.bean.AccountEntity;
import com.cuit.drawdream.bean.NewsDetail;
import com.cuit.drawdream.bean.ReplayEntity;

import com.cuit.drawdream.bean.AppInfoEntityDao;
import com.cuit.drawdream.bean.UserInfoEntityDao;
import com.cuit.drawdream.bean.AccountEntityDao;
import com.cuit.drawdream.bean.NewsDetailDao;
import com.cuit.drawdream.bean.ReplayEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig appInfoEntityDaoConfig;
    private final DaoConfig userInfoEntityDaoConfig;
    private final DaoConfig accountEntityDaoConfig;
    private final DaoConfig newsDetailDaoConfig;
    private final DaoConfig replayEntityDaoConfig;

    private final AppInfoEntityDao appInfoEntityDao;
    private final UserInfoEntityDao userInfoEntityDao;
    private final AccountEntityDao accountEntityDao;
    private final NewsDetailDao newsDetailDao;
    private final ReplayEntityDao replayEntityDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        appInfoEntityDaoConfig = daoConfigMap.get(AppInfoEntityDao.class).clone();
        appInfoEntityDaoConfig.initIdentityScope(type);

        userInfoEntityDaoConfig = daoConfigMap.get(UserInfoEntityDao.class).clone();
        userInfoEntityDaoConfig.initIdentityScope(type);

        accountEntityDaoConfig = daoConfigMap.get(AccountEntityDao.class).clone();
        accountEntityDaoConfig.initIdentityScope(type);

        newsDetailDaoConfig = daoConfigMap.get(NewsDetailDao.class).clone();
        newsDetailDaoConfig.initIdentityScope(type);

        replayEntityDaoConfig = daoConfigMap.get(ReplayEntityDao.class).clone();
        replayEntityDaoConfig.initIdentityScope(type);

        appInfoEntityDao = new AppInfoEntityDao(appInfoEntityDaoConfig, this);
        userInfoEntityDao = new UserInfoEntityDao(userInfoEntityDaoConfig, this);
        accountEntityDao = new AccountEntityDao(accountEntityDaoConfig, this);
        newsDetailDao = new NewsDetailDao(newsDetailDaoConfig, this);
        replayEntityDao = new ReplayEntityDao(replayEntityDaoConfig, this);

        registerDao(AppInfoEntity.class, appInfoEntityDao);
        registerDao(UserInfoEntity.class, userInfoEntityDao);
        registerDao(AccountEntity.class, accountEntityDao);
        registerDao(NewsDetail.class, newsDetailDao);
        registerDao(ReplayEntity.class, replayEntityDao);
    }
    
    public void clear() {
        appInfoEntityDaoConfig.getIdentityScope().clear();
        userInfoEntityDaoConfig.getIdentityScope().clear();
        accountEntityDaoConfig.getIdentityScope().clear();
        newsDetailDaoConfig.getIdentityScope().clear();
        replayEntityDaoConfig.getIdentityScope().clear();
    }

    public AppInfoEntityDao getAppInfoEntityDao() {
        return appInfoEntityDao;
    }

    public UserInfoEntityDao getUserInfoEntityDao() {
        return userInfoEntityDao;
    }

    public AccountEntityDao getAccountEntityDao() {
        return accountEntityDao;
    }

    public NewsDetailDao getNewsDetailDao() {
        return newsDetailDao;
    }

    public ReplayEntityDao getReplayEntityDao() {
        return replayEntityDao;
    }

}
