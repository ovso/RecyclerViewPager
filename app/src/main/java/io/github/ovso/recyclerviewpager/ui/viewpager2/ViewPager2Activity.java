package io.github.ovso.recyclerviewpager.ui.viewpager2;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.ovso.recyclerviewpager.R;
import io.github.ovso.recyclerviewpager.ui.viewpager2.adapter.ViewPager2VerticalAdapter;

public class ViewPager2Activity extends AppCompatActivity {
  private final static String TAG = ViewPager2Activity.class.getSimpleName();
  @BindView(R.id.viewpager2_viewpager) ViewPager2 viewpager;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_viewpager2);
    ButterKnife.bind(this);
    setTitle("ViewPager2");
    setupViewPager();
  }

  private void setupViewPager() {
    viewpager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
    viewpager.setAdapter(new ViewPager2VerticalAdapter());
    viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
      @Override public void onPageSelected(int position) {
        Log.d(TAG, "onPageSelected(" + position + ")");
      }
    });
  }
}