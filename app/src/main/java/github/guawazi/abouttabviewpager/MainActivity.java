package github.guawazi.abouttabviewpager;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import github.guawazi.abouttabviewpager.adapter.HomePagerAdapter;
import github.guawazi.abouttabviewpager.fragment.OneFragment;

public class MainActivity extends AppCompatActivity implements OneFragment.OnFragmentInteractionListener {

    private TabLayout mTabLayout;
    private ViewPager mVpPager;
    private OneFragment mOneFragment;
    private OneFragment mTwoFragment;
    private OneFragment mThreeFragment;
    private HomePagerAdapter mHomePagerAdapter;
    private ArrayList<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mVpPager = (ViewPager) findViewById(R.id.vp_pager);
        mOneFragment = OneFragment.newInstance("第一个Fragment", "");
        mTwoFragment = OneFragment.newInstance("第二个Fragment", "");
        mThreeFragment = OneFragment.newInstance("第三个Fragment", "");
    }

    private void initData() {
        mFragments = new ArrayList<>();
        mFragments.add(mOneFragment);
        mFragments.add(mTwoFragment);
        mFragments.add(mThreeFragment);
        mHomePagerAdapter = new HomePagerAdapter();
        mVpPager.setAdapter(mHomePagerAdapter);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
