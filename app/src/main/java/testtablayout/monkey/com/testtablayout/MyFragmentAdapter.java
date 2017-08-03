package testtablayout.monkey.com.testtablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Description:
 * Author: lanjing
 * Time: 2017/6/5 15:26
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {
    public static final int COUNT = 3;

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        PageFragment pageFragment =  new PageFragment();
        Bundle bundle = new Bundle();
        bundle.putString(PageFragment.EXTRA_TITLE,"This is "+position+" page!!!");
        pageFragment.setArguments(bundle);
        return pageFragment;
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "page"+position;
    }
}
