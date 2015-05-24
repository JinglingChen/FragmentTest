package com.jing.newsapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Fragment;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class NewsTitleFragment extends Fragment implements OnItemClickListener{
	private ListView newsTitleListView;
	private List<News> newsList;
	private NewsAdapter adapter;
	private boolean isTwoPane;
	
	@Override 
	public void onAttach(Activity activity){
		super.onAttach(activity);
		newsList=getNews();
		adapter= new NewsAdapter(activity,R.layout.news_item,newsList);
		
	}
	
	private List<News> getNews(){
		List<News> newsList =new ArrayList<News>();
		News news1=new News();
		news1.setTitle("Succeed in College as a Learning Disabled Student");
		news1.setContent("College freshmen will soon learn to live with a roommate,adjust"
				+ " to a new social scene and survive less-than-stellar dining hall food.Student"
				+ " with learning disabilities will face these transitions while also grappling "
				+ "with a few more hurdles.");
		newsList.add(news1);
		News news2=new News();
		news2.setTitle("Google Android exec poached by China's Xiaomi");
		news2.setContent("China's Xiaomi has poached a key Google executive involved in "
				+ "the tech giant's Android phones,in a move seen as a coup for the rapidly"
				+ "growing Chinese smartphone maker.");
		newsList.add(news2);
		return newsList;
	}

}