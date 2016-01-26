package com.jikexueyuan.alphaanimation;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;

/**
 * AlphaAnimation透明动画效果演示
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnAnimMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //方法一:

//                //创建动画;
//                // arg 开始值，结束值(0-1之间的动画效果)
//                AlphaAnimation aa = new AlphaAnimation(0,1);
//
//                //动画长度是1秒,Duration:持续
//                aa.setDuration(1000);
//
//                //视图开始动画
//                v.startAnimation(aa);

                //方法二
                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.aa));
//                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.animator.aa));
            }
        });
    }
}
