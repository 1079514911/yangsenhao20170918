package com.example.administrator.yangsenhao20170918;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {


    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iiiiiiiii);
        imageView = (ImageView) findViewById(R.id.imageview2);
        button = (Button) findViewById(R.id.button);
        Glide.with(this)
                .load("https://pic2.zhimg.com/v2-0f9d7960d946b7f83a93921caee888e5.jpg")
                .into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator algha = ObjectAnimator.ofFloat(imageView, "rotationX", new float[]{0.0f,100f,200f,360f});
//执行时长
                algha.setDuration(3000);
//执行模式
                algha.setRepeatMode(ObjectAnimator.RESTART);
//设置动画执行次数,指的是执行一次后再执行次数
                algha.setRepeatCount(0);
//开始动画效果
                algha.start();
            }
        });

    }
}
