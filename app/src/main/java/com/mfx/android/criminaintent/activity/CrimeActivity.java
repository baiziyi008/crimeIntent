package com.mfx.android.criminaintent.activity;

import android.support.v4.app.Fragment;

import com.mfx.android.criminaintent.fragment.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
