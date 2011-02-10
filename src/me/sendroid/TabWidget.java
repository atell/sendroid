package me.sendroid;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;

public class TabWidget extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabwidget);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab

//		tabHost.setBackgroundColor(Color.argb(150, 22, 70, 150)); 
		
		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, MatesActivity.class);
		String mates = this.getResources().getString(R.string.mates);
		spec = tabHost.newTabSpec(mates).setIndicator("tab1",getResources().getDrawable(R.drawable.home_tab)).setContent(intent);
		tabHost.addTab(spec);

		// 团队号外
		intent = new Intent().setClass(this, IteamerActivity2.class);
		String news = this.getResources().getString(R.string.news);
		spec = tabHost.newTabSpec(news).setIndicator("tab2",getResources().getDrawable(R.drawable.mates_tab)).setContent(intent);
		tabHost.addTab(spec);
		// 会议提醒
		intent = new Intent().setClass(this, IteamerActivity3.class);
		String meeting = this.getResources().getString(R.string.meeting);
		spec = tabHost.newTabSpec(meeting).setIndicator("tab3",getResources().getDrawable(R.drawable.mates_tab)).setContent(intent);
		tabHost.addTab(spec);
		// 队友身影
		intent = new Intent().setClass(this, IteamerActivity4.class);
		String location = this.getResources().getString(R.string.location);
		spec = tabHost.newTabSpec(location).setIndicator("tab4",getResources().getDrawable(R.drawable.mates_tab)).setContent(intent);
		tabHost.addTab(spec);

		// tabHost.setCurrentTab(2);

	}
}