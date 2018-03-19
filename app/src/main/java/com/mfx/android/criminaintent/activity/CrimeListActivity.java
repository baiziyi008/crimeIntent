package com.mfx.android.criminaintent.activity;

import android.support.v4.app.Fragment;

import com.mfx.android.criminaintent.fragment.CrimeListFragment;

/**
 * Created by mafuxin on 2018/3/18.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
