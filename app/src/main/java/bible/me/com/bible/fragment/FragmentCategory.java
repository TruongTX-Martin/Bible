package bible.me.com.bible.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bible.me.com.bible.R;
import bible.me.com.bible.base.fragment.BaseFragment;


public class FragmentCategory extends BaseFragment {

    public static FragmentCategory newInstance() {
        FragmentCategory fragment = new FragmentCategory();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_fragment_category,
                container, false);
        return rootView;
    }

}
