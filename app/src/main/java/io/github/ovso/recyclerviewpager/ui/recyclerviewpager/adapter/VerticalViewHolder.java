package io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.ovso.recyclerviewpager.R;

public class VerticalViewHolder extends RecyclerView.ViewHolder {
  private final static String TAG = "VerticalViewHolder";
  @BindView(R.id.viewpager2_viewpager) ViewPager viewPager;

  VerticalViewHolder(@NonNull View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  void bind(int position) {
    setupViewPager();
  }

  private void setupViewPager() {
    viewPager.clearOnPageChangeListeners();
    viewPager.setAdapter(new HorizontalPagerAdapter());
    viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
      @Override public void onPageSelected(int position) {
        Log.d(TAG, "onPageSelected = " + position);
      }
    });
  }

  static VerticalViewHolder create(ViewGroup parent) {
    View view =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
    return new VerticalViewHolder(view);
  }
}