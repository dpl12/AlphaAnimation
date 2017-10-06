package cn.edu.bzu.alphaanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by dpl on 2017/8/7 0007.
 */

public class AlphaAnimation extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpha_animation);
        findViewById(R.id.btnAlpha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*AlphaAnimation（透明效果动画）：
                第一种方法：
                android.view.animation.AlphaAnimation alphaAnimation=new android.view.animation.AlphaAnimation(0,1);//设置透明动画
                alphaAnimation.setDuration(1000);//设置动画持续时间
                view.startAnimation(alphaAnimation);//开始动画*/
                //第二种方法,调用animation.xml文件：
                view.startAnimation(AnimationUtils.loadAnimation(getApplication(),R.anim.animation_alpha));
                //loadAnimation ：内部为解析xml并创建Animation对象
            }
        });
    }
}
