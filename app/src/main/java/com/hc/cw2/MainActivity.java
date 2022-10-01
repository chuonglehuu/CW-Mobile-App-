package com.hc.cw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image);

        String url_img = "https://i.9mobi.vn/cf/images/2015/03/nkk/hinh-dep-1.jpg";

        Picasso.get().load(url_img).into(imageView);
    }
}