package com.jing.fragmenttest;
import com.jing.newsapp.*;

import android.app.Activity;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.app.FragmentManager;

public class MainActivity extends Activity implements OnClickListener{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Button button=(Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View v){
		switch(v.getId()){
		case R.id.button1:
			/*动态添加碎片：
			//1、创建带添加碎片的实例
			AnotherRightFragment anotherRightFragment=new AnotherRightFragment();
			//2、获取到FragmentManager实例，在活动中可以直接调用getFragmentManager()方法得到
			FragmentManager fragmentManager = getFragmentManager();
			//3、开启一个事务，通过调用beginTransaction()方法开启
			FragmentTransaction transaction = fragmentManager.beginTransaction();
			//4、向容器内加入碎片，一般使用replace()方法实现，要传入容器的id和待添加的碎片实例
			
			transaction.replace(R.id.right_layout,anotherRightFragment);
			transaction.addToBackStack(null);//模仿返回栈的效果
			//5、提交事物，调用commit()方法来完成
			transaction.commit();
			*/
			break;
		default:
			break;
			
		}
	}
}
