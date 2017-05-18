package com.cuit.drawdream.drawdream.view;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.cuit.drawdream.drawdream.R;
import com.cuit.drawdream.drawdream.bean.ordinary.DetialArticleEntity;
import com.cuit.drawdream.drawdream.databinding.ActivityDetailBinding;
import com.cuit.drawdream.drawdream.viewmodel.DetailActivityViewModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


/**
 * class :    DetailActivity
 * Created by yangq
 * At         2017/5/17.
 * Desc :
 */

public class DetailActivity extends BaseActivity {

    private ActivityDetailBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_detail);
        DetailActivityViewModel viewModel = new DetailActivityViewModel(this);
        mBinding.setDetailActivityViewModel(viewModel);
        mBinding.pvDetail.setTitle("详情");
        mBinding.wvContentDetail.loadUrl("file:///android_asset/test.html");

//        wv.loadUrl("file:///android_asset/test.html");

    }

    @Override
    protected void destroy() {

    }
}