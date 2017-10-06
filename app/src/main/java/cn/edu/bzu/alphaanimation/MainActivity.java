package cn.edu.bzu.alphaanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnCustom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomAnimation customAnimation=new CustomAnimation();//自定义动画
                customAnimation.setDuration(1000);
                view.startAnimation(customAnimation);
                Toast.makeText(getApplicationContext(),"摇晃摇晃！",Toast.LENGTH_LONG).show();
            }
        });
    }
}
