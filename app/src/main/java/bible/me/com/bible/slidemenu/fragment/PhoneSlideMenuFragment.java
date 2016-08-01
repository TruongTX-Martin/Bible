package bible.me.com.bible.slidemenu.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bible.me.com.bible.R;
import bible.me.com.bible.base.fragment.BaseFragment;
import bible.me.com.bible.base.manager.BaseManager;
import bible.me.com.bible.slidemenu.block.PhoneSlideMenuBlock;
import bible.me.com.bible.slidemenu.controller.PhoneSlideMenuController;
import bible.me.com.bible.slidemenu.delegate.CloseSlideMenuDelegate;


public class PhoneSlideMenuFragment extends BaseFragment {
	protected CloseSlideMenuDelegate mCLoseDelegate;
	protected PhoneSlideMenuController mController;
	protected PhoneSlideMenuBlock mBlock;
	public void setCloseDelegate(CloseSlideMenuDelegate mCLoseDelegate) {
		this.mCLoseDelegate = mCLoseDelegate;
	}
	
	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(
				R.layout.core_phone_slide_menu, null,
				false);
		Context context = getActivity();
		mBlock = new PhoneSlideMenuBlock(view, context);
		mBlock.initView();
		
		mController = new PhoneSlideMenuController(mBlock, context);
		mController.setCloseDelegate(mCLoseDelegate);
		mController.create();
		
		mBlock.setListener(mController.getListener());
		BaseManager.getIntance().setSlideMenuController(mController);
		return view;
	}
}
