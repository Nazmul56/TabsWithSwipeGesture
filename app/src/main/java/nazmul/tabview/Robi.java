package nazmul.tabview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Robi extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		//Fragment
		View rootView = inflater.inflate(R.layout.fragment_robi, container, false);
		
		return rootView;
	}
}
