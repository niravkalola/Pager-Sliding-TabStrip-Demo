
package com.nirav.kalola.page_sliding_tabstrip_demo;

import com.astuetz.viewpager.extensions.sample.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;



/**
 * @author nirav kalola
 *
 */
public class MainActivity extends FragmentActivity {

	private PagerSlidingTabStrip tabs;
	private ViewPager pager;
	private MyPagerAdapter adapter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
		pager = (ViewPager) findViewById(R.id.pager);
		adapter = new MyPagerAdapter(getSupportFragmentManager());

		pager.setAdapter(adapter);

		final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources()
				.getDisplayMetrics());
		pager.setPageMargin(pageMargin);

		tabs.setViewPager(pager);
	
	}

	
	public class MyPagerAdapter extends FragmentPagerAdapter {

		private final String[] TITLES = { "Home", "Favourites", "Others" };

		public MyPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public CharSequence getPageTitle(int position) {
			return TITLES[position];
		}

		@Override
		public int getCount() {
			return TITLES.length;
		}

		@Override
		public Fragment getItem(int i) {
			Fragment fragment=null;
			if(i==0) {
				fragment=Fragment1.newInstance();
			} else if(i==1) {
				fragment=Fragment2.newInstance();
			} else if(i==2) {
				fragment=Fragment3.newInstance();
			}
			return fragment;
		}

	}

}