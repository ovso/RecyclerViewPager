package io.github.ovso.recyclerviewpager.ui.viewpager2.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.ovso.recyclerviewpager.R;

public class ViewPager2VerticalViewHolder extends RecyclerView.ViewHolder {
  public final static String TAG = "ViewPager2VViewHolder";
  @BindView(R.id.viewpager2_viewpager) ViewPager2 viewPager;

  private ViewPager2VerticalViewHolder(@NonNull View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  void bind(int position) {
    setupViewPager();
  }

  private void setupViewPager() {
    viewPager.unregisterOnPageChangeCallback(onPageChangeCallback);
    viewPager.setAdapter(new ViewPager2HorizontalAdapter());
    viewPager.registerOnPageChangeCallback(onPageChangeCallback);
  }

  private ViewPager2.OnPageChangeCallback onPageChangeCallback =
      new ViewPager2.OnPageChangeCallback() {
        @Override public void onPageSelected(int position) {
          Log.d(TAG, "onPageSelected(" + position + ")");
        }
      };

  public static ViewPager2VerticalViewHolder create(ViewGroup parent) {
    View view =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewpager2, parent, false);
    return new ViewPager2VerticalViewHolder(view);
  }
}