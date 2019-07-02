package com.example.chapter3.homework;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ch3Ex31Activity extends AppCompatActivity {
    private static final int PAGE_COUNT = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch3_ex31);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager pager = findViewById(R.id.view_pager);



        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return new Fragment_e3();
            }

            @Override
            public int getCount() {
                return PAGE_COUNT;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                if (position==0) {
                    return "好友列表";
                }
                else if (position==1){
                    return "我的好友";
                }
                return "NULL";
            }
        });
        tabLayout.setupWithViewPager(pager);

    }
}
