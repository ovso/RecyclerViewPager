package io.github.ovso.recyclerviewpager.ui.viewpager3.adapter;

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

public class ViewPager3VerticalViewHolder extends RecyclerView.ViewHolder {
  private final static String TAG = "VerticalViewHolder";
  @BindView(R.id.viewpager_main3_viewholder) ViewPager viewPager;

  ViewPager3VerticalViewHolder(@NonNull View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  void bind(int position) {
    setupViewPager();
  }

  private void setupViewPager() {
    viewPager.clearOnPageChangeListeners();
    viewPager.setAdapter(new ViewPager3HorizontalPagerAdapter());
    viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
      @Override public void onPageSelected(int position) {
        Log.d(TAG, "onPageSelected = " + position);
      }
    });
  }

  static ViewPager3VerticalViewHolder create(ViewGroup parent) {
    View view =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main3, parent, false);
    return new ViewPager3VerticalViewHolder(view);
  }
}