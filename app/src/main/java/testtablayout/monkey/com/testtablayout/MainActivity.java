package testtablayout.monkey.com.testtablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyFragmentAdapter mMyAdapter;
    private LayoutInflater mLayoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mLayoutInflater = getLayoutInflater();
        mViewPager = (ViewPager)findViewById(R.id.vp);
        mTabLayout = (TabLayout)findViewById(R.id.tablayout);
        mMyAdapter = new MyFragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mMyAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        //自定义小标题
        for(int i=0;i<mTabLayout.getTabCount();i++){
            TabLayout.Tab tab = mTabLayout.getTabAt(i);
            View view = mLayoutInflater.inflate(R.layout.tab_indicator,null);
            TextView tvTitle = (TextView)view.findViewById(R.id.tv_title);
            tvTitle.setText(mMyAdapter.getPageTitle(i));
            tab.setCustomView(view);
        }
        //mTabLayout.addTab(mTabLayout.newTab().setCustomView(R.layout.tab_indicator));
    }
}
