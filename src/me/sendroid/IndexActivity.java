package me.sendroid;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class IndexActivity extends ListActivity {

	private List<MenuItem> menuItems = new ArrayList<MenuItem>(5);

	// private List<View> menuItems = new ArrayList<View>(5);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.index);
		Resources res = this.getResources();
		// ListAdapter
		MenuItem menuItem1 = new MenuItem(this, res
				.getDrawable(R.drawable.index_menu1), "ABC", "abc");
		MenuItem menuItem2 = new MenuItem(this, res
				.getDrawable(R.drawable.index_menu2), "ABC", "abc");
		MenuItem menuItem3 = new MenuItem(this, res
				.getDrawable(R.drawable.index_menu3), "ABC", "abc");
		menuItems.add(menuItem1);
		menuItems.add(menuItem2);
		menuItems.add(menuItem3);

		// View indexListItem1 = this.findViewById(R.id.index_list_item1);
		// View indexListItem2 = this.findViewById(R.id.index_list_item2);
		// View indexListItem3 = this.findViewById(R.id.index_list_item3);
		// View index = this.findViewById(R.id.index);
		// menuItems.add(indexListItem1);
		// menuItems.add(indexListItem2);
		// menuItems.add(indexListItem3);

		this.setListAdapter(new MenuViewAdapter(this, menuItems));

		ListView lv = getListView();
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
			}
		});

	}
}