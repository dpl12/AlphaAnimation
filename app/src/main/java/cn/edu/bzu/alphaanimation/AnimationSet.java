package cn.edu.bzu.alphaanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

public class AnimationSet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_set);
        findViewById(R.id.btnSet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AnimationSet：动画集合
                //第一种方法：
                /*android.view.animation.AnimationSet animationSet=new android.view.animation.AnimationSet(true);
                //创建动画，参数表示他的子动画是否共用一个插值器
                animationSet.setDuration(1000);
                android.view.animation.AlphaAnimation alphaAnimation=new AlphaAnimation(0,1);
                alphaAnimation.setDuration(1000);
                animationSet.addAnimation(alphaAnimation);
                TranslateAnimation translateAnimation=new TranslateAnimation(0,500,0,500);
                translateAnimation.setDuration(1000);
                animationSet.addAnimation(translateAnimation);
                view.startAnimation(animationSet);*/
                //第二种方法：
                view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation_set));
            }
        });

    }
}
