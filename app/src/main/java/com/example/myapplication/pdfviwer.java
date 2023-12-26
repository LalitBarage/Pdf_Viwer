package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfviwer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviwer);

        PDFView pdfView = findViewById(R.id.pdfView);
        Intent intent = getIntent();
        String path = intent.getStringExtra("path");

        if (path != null) {
            Uri uri = Uri.parse(path);
            pdfView.fromUri(uri).load();
        }
    }
}