package com.example.chapter3.homework;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

/**
 * 使用 ViewPager 和 Fragment 做一个简单版的好友列表界面
 * 1. 使用 ViewPager 和 Fragment 做个可滑动界面
 * 2. 使用 TabLayout 添加 Tab 支持
 * 3. 对于好友列表 Fragment，使用 Lottie 实现 Loading 效果，在 5s 后展示实际的列表，要求这里的动效是淡入淡出
 */
public class Ch3Ex3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch3ex3);

        //TabLayout tabLayout =findViewById(R.id.tab_layout);
        View animationView3=findViewById(R.id.animation_view_3);
        AnimatorSet animatorSet;

        ObjectAnimator animator1 = ObjectAnimator.ofFloat(animationView3, "alpha",1.0f,1.0f);
        animator1.setDuration(5000);

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(animationView3,"alpha",1.0f,0.0f);
        animator2.setDuration(1000);
        animator2.setRepeatCount(0);
        animator2.setAutoCancel(true);


        animatorSet=new AnimatorSet();
        animatorSet.playSequentially(animator1,animator2);
        animatorSet.start();
        animatorSet.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                Intent intent = new Intent(Ch3Ex3Activity.this,Ch3Ex31Activity.class);
                startActivity(intent);
                overridePendingTransition(0, android.R.anim.fade_out);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });







        // TODO: ex3-1. 添加 ViewPager 和 Fragment 做可滑动界面



        // TODO: ex3-2, 添加 TabLayout 支持 Tab
    }
}
