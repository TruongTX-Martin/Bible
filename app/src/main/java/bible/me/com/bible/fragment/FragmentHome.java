package bible.me.com.bible.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bible.me.com.bible.R;
import bible.me.com.bible.base.fragment.BaseFragment;
import bible.me.com.bible.config.Constant;


public class FragmentHome extends BaseFragment {

	public static FragmentHome newInstance() {
		FragmentHome fragment = new FragmentHome();
		return fragment;
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setScreenName(Constant.SCREEN_HOME);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.layout_fragment_home,
				container, false);
		return rootView;
	}

}
