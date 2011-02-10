package me.sendroid;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MenuViewAdapter extends BaseAdapter {

	protected static final String TAG = MenuViewAdapter.class.getSimpleName();
	protected Context context;
	protected List<MenuItem> menuItems;

	// protected List<View> menuItems;

	public MenuViewAdapter(Context context, List<MenuItem> menuItems) {
		this.context = context;
		this.menuItems = menuItems;
	}

	public int getCount() {
		return this.menuItems.size();
	}

	public Object getItem(int position) {
		return this.menuItems.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		return this.menuItems.get(position);
	}
}
