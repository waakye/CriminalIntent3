package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by lesterlie on 1/4/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
