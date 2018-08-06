package com.bignerdranch.android.criminalintent.controller.list;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.criminalintent.R;
import com.bignerdranch.android.criminalintent.controller.SingleFragmentActivity;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }
}
