package io.github.ovso.recyclerviewpager.ui.main;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.ovso.recyclerviewpager.R;
import io.github.ovso.recyclerviewpager.ui.recyclerviewpager.RecyclerViewPagerActivity;
import io.github.ovso.recyclerviewpager.ui.viewpager2.ViewPager2Activity;
import io.github.ovso.recyclerviewpager.ui.viewpager3.ViewPager3Activity;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.button_main_recycler) void navigateToRecyclerViewPager() {
    Intent intent = new Intent(this, RecyclerViewPagerActivity.class);
    startActivity(intent);
  }

  @OnClick(R.id.button_main_viewpager2) void navigateToViewPager2() {
    Intent intent = new Intent(this, ViewPager2Activity.class);
    startActivity(intent);
  }

  @OnClick(R.id.button_main_viewpager3) void navigateToViewPager3() {
    Intent intent = new Intent(this, ViewPager3Activity.class);
    startActivity(intent);
  }
}
