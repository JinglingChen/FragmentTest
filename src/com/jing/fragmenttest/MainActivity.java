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
			/*��̬�����Ƭ��
			//1�������������Ƭ��ʵ��
			AnotherRightFragment anotherRightFragment=new AnotherRightFragment();
			//2����ȡ��FragmentManagerʵ�����ڻ�п���ֱ�ӵ���getFragmentManager()�����õ�
			FragmentManager fragmentManager = getFragmentManager();
			//3������һ������ͨ������beginTransaction()��������
			FragmentTransaction transaction = fragmentManager.beginTransaction();
			//4���������ڼ�����Ƭ��һ��ʹ��replace()����ʵ�֣�Ҫ����������id�ʹ���ӵ���Ƭʵ��
			
			transaction.replace(R.id.right_layout,anotherRightFragment);
			transaction.addToBackStack(null);//ģ�·���ջ��Ч��
			//5���ύ�������commit()���������
			transaction.commit();
			*/
			break;
		default:
			break;
			
		}
	}
}
