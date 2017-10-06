package cn.edu.bzu.alphaanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class ScaleAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scale_animation);
        findViewById(R.id.btnScale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ScaleAnimation:缩放动画
                //第一种方法：
                //android.view.animation.ScaleAnimation scaleAnimation=new android.view.animation.ScaleAnimation(0,1,0,1, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                /*
                ScaleAnimation(float fromX, float toX, float fromY, float toY,int pivotXType, float pivotXValue, int pivotYType, float pivotYValue)
                参数说明：
                复制代码 代码如下:
                float fromX 动画起始时 X坐标上的伸缩尺寸
                float toX 动画结束时 X坐标上的伸缩尺寸
                float fromY 动画起始时Y坐标上的伸缩尺寸
                float toY 动画结束时Y坐标上的伸缩尺寸
                int pivotXType 动画在X轴相对于物件位置类型
                float pivotXValue 动画相对于物件的X坐标的开始位置
                int pivotYType 动画在Y轴相对于物件位置类型
                float pivotYValue 动画相对于物件的Y坐标的开始位置
                */
                //scaleAnimation.setDuration(1000);
                //view.startAnimation(scaleAnimation);
                //第二种方法：
                view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation_scale));
            }
        });
    }
}
