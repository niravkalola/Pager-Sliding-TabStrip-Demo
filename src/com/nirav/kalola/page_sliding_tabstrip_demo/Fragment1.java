package com.nirav.kalola.page_sliding_tabstrip_demo;

import com.astuetz.viewpager.extensions.sample.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author nirav kalola
 *
 */
public class Fragment1 extends Fragment {

	
	public static Fragment1 newInstance() {
		Fragment1 f = new Fragment1();
		
		return f;
	}
	
	public Fragment1() {
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.fragment_one, container, false);

		return view;
	}
}
