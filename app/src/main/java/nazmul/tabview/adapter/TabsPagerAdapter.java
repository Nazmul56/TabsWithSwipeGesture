package nazmul.tabview.adapter;

import nazmul.tabview.Robi;
import nazmul.tabview.Banglalink;
import nazmul.tabview.Grameenphone;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	//Adapter

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Grameenphone();
		case 1:
			// Games fragment activity
			return new Robi();
		case 2:
			// Movies fragment activity
			return new Banglalink();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
