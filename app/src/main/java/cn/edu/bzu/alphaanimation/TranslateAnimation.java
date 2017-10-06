package cn.edu.bzu.alphaanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class TranslateAnimation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translate_animation);
        findViewById(R.id.btnTranslate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TranslateAnimation移动动画
               /* 第一种方法：
                android.view.animation.TranslateAnimation translateAnimation=new android.view.animation.TranslateAnimation(0,500,0,500);
                //TranslateAnimation(float fromXDelta, float toXDelta, float fromYDelta, float toYDelta);从(fromXDelta,fromYDelta)坐标点移动到(toXDelta,toYDelta)坐标点。这些坐标点指的是增量坐标。
                translateAnimation.setDuration(2000);
                view.startAnimation(translateAnimation);*/
                //第二种方法：
                view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation_translate));
            }
        });
    }
}
