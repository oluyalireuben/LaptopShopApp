package com.example.laptops_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class LenovoActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenovo);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.lenovo.com");

    }
}