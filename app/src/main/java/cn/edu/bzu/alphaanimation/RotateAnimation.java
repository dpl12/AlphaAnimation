package cn.edu.bzu.alphaanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class RotateAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rotate_animation);
       //RotateAnimation:旋转动画

        findViewById(R.id.btnRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //第一种方法：
           /*     android.view.animation.RotateAnimation rotateAnimation=new android.view.animation.RotateAnimation(0,720, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                //0：开始角度；720：旋转角度；Animation.RELATIVE_TO_SELF：相较于自身，这里是0.5f比例
                rotateAnimation.setDuration(1000);
                view.startAnimation(rotateAnimation);*/
                //第二种方法：
                view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation_rotate));
            }
        });
    }
}
