package com.javier_lozano.vegani_clouds;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class browserActivity extends AppCompatActivity {
    WebView wv_entrada ;
    private ActionBar actBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        actBar = getSupportActionBar();
        actBar.setDisplayHomeAsUpEnabled(true);
        wv_entrada = (WebView) findViewById(R.id.webview_blog);
        Intent i = getIntent();
        wv_entrada.loadUrl(i.getStringExtra(MainActivity.URL_ENTRADA));
    }
}
