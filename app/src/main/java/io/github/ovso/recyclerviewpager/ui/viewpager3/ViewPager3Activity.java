package io.github.ovso.recyclerviewpager.ui.viewpager3;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.ovso.recyclerviewpager.R;
import io.github.ovso.recyclerviewpager.ui.viewpager3.adapter.ViewPager3VerticalAdapter;

public class ViewPager3Activity extends AppCompatActivity {
  private final static String TAG = "ViewPager3Activity";
  @BindView(R.id.viewpager2_viewpager3) ViewPager2 viewPager2;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_viewpager3);
    ButterKnife.bind(this);
    setupViewPager();
  }

  private void setupViewPager() {
    viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
    viewPager2.setAdapter(new ViewPager3VerticalAdapter());
    viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
      @Override public void onPageSelected(int position) {
        Log.d(TAG, "onPageSelected(" + position + ")");
      }
    });
  }
}