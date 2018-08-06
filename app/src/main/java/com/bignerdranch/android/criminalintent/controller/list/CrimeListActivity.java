package com.bignerdranch.android.criminalintent.controller.list;

import android.content.Intent;
import android.support.v4.app.Fragment;

import com.bignerdranch.android.criminalintent.R;
import com.bignerdranch.android.criminalintent.controller.SingleFragmentActivity;
import com.bignerdranch.android.criminalintent.controller.crime.CrimeFragment;
import com.bignerdranch.android.criminalintent.controller.crime.CrimePagerActivity;
import com.bignerdranch.android.criminalintent.model.entity.Crime;

public class CrimeListActivity extends SingleFragmentActivity
        implements CrimeListFragment.Callbacks, CrimeFragment.Callbacks {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }

    @Override
    public void onCrimeSelected(Crime crime) {
        if (findViewById(R.id.detail_fragment_container) == null) {
            Intent intent = CrimePagerActivity.newIntent(this, crime.getId());
            startActivity(intent);
        } else {
            Fragment newDetail = CrimeFragment.newInstance(crime.getId());

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.detail_fragment_container, newDetail)
                    .commit();
        }
    }

    @Override
    public void onCrimeUpdated(Crime crime) {
        CrimeListFragment listFragment = (CrimeListFragment)
                getSupportFragmentManager()
                        .findFragmentById(R.id.fragment_container);
        listFragment.updateUI();
    }
}
