package com.myapplicationdev.android.p07ps_mydatabook;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class AboutActivity extends AppCompatActivity {
    ImageView ivProgressBar;
    ImageView ivRepublic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ivProgressBar = findViewById(R.id.ivLoading);
        ivRepublic = findViewById(R.id.ivRepublic);

        Glide.with(AboutActivity.this).load(R.drawable.ajax_loader).into(ivProgressBar);

        Glide.with(AboutActivity.this)
                .load("https://otogi.wikiru.jp/attach2/A1FA352FA5CFA5E0A5ECA5C3A5C8_53445FA5CFA5E0A5ECA5C3A5C8305F766963746F72792E676966.gif")
                .error(R.drawable.error)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        ivProgressBar.setVisibility(View.GONE);
                        return false;
                    }
                })
                .into(ivRepublic);
    }
}