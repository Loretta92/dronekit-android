package org.droidplanner.fragments.calibration.rc;

import org.droidplanner.fragments.SetupRadioFragment;
import org.droidplanner.fragments.calibration.SetupSidePanel;

import org.droidplanner.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentSetupRCMinMax extends SetupSidePanel {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

        final SetupRadioFragment setupFragment = (SetupRadioFragment) getParentFragment();

		final View view = inflater.inflate(R.layout.fragment_setup_rc_minmax, container,	false);
		final Button btnNext = (Button)view.findViewById(R.id.ButtonNext);
		btnNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(setupFragment != null){
                    setupFragment.doCalibrationStep(1);
                }
            }
        });
		
		final Button btnCancel = (Button)view.findViewById(R.id.ButtonCancel);
		btnCancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(setupFragment != null){
                    setupFragment.doCalibrationStep(-1);
                }
            }
        });

		return view;
	}

	@Override
	public void updateDescription(int idDescription) {
		// TODO Auto-generated method stub
		
	}

}
