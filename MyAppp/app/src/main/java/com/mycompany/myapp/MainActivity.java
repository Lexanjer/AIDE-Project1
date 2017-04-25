package com.mycompany.myapp;

import android.os.*;
import android.support.v4.app.*;
import android.support.v4.view.*;
import android.util.*;
import android.widget.*;

public class MainActivity extends FragmentActivity 
{
    final String LOG_TAG = "myLogs";

		static final String TAG = "myLogs";
    static int PAGE_COUNT ;

    ViewPager pager;
    PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

				DataBase dataBase = new DataBase(this);
				Toast.makeText(this, "здесь выводится база "
											 , Toast.LENGTH_LONG).show();
				Log.d(TAG, "Vcem privet----------------- "+dataBase.getCheckList(1).toString() );


        PAGE_COUNT = dataBase.getCount();
				//   System.out.println(dataBase.getCheckList1().toString());
				//   Log.d(TAG, "Vcem privet----------------- "+dataBase.getCheckList(1).toString() );

        pager = (ViewPager) findViewById(R.id.pager);
        method();
        pager.setAdapter(pagerAdapter);

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

								@Override
								public void onPageSelected(int position) {
										Log.d(TAG, "onPageSelected, position = " + position);
								}

								@Override
								public void onPageScrolled(int position, float positionOffset,
																					 int positionOffsetPixels) {
								}

								@Override
								public void onPageScrollStateChanged(int state) {
								}
						});

    }

		private void method()
		{
				pagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
		}


	// New coment
}

