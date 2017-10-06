package cn.edu.bzu.alphaanimation;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by dpl on 2017/8/7 0007.
 */

public class CustomAnimation extends Animation {
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        //interpolatedTime:补间时间（0->1)
        //t.setAlpha(interpolatedTime);//自定义透明效果
        //t.getMatrix().setTranslate(interpolatedTime*200,interpolatedTime*200);//getMatrix()获取矩阵
        t.getMatrix().setTranslate((float) (Math.sin(interpolatedTime*50)*50),0);//sin函数的周期性，使其左右摇摆
        super.applyTransformation(interpolatedTime, t);

    }
}
