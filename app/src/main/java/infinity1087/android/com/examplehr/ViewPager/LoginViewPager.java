package infinity1087.android.com.examplehr.ViewPager;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import infinity1087.android.com.examplehr.loginFragments.SimpleLoginFragment;
import infinity1087.android.com.examplehr.R;

public class LoginViewPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view_pager);
        android.support.v4.view.ViewPager viewPager = (android.support.v4.view.ViewPager) findViewById(R.id.viewpager);

        SimpleLoginFragment adapter = new
                SimpleLoginFragment(this, getSupportFragmentManager());

        // Set the adapter onto the view pager

        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);

        finish();
    }
}
