package com.pollux.libertas;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class SettingAct extends FragmentPagerAdapter {

    public SettingAct(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return null;
    }
    @Override
    public int getCount() {
        return 0;
    }
}
