package com.jing.fragmenttest;
import com.jing.newsapp.*;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

public class AnotherRightFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,
			Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.another_right_fragment, container, false);
		return view;
		
	}

}
