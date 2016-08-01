package bible.me.com.bible.slidemenu.delegate;

import java.util.ArrayList;

import bible.me.com.bible.slidemenu.entity.ItemNavigation;


public interface SlideMenuDelegate {
	public void onSelectedItem(int position);

	public void onRefresh();

	public void setAdapter(ArrayList<ItemNavigation> items);

	
}
