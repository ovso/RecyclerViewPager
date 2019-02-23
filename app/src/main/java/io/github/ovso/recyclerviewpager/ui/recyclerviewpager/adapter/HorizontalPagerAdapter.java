package io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class HorizontalPagerAdapter extends PagerAdapter {

  @Override public int getCount() {
    return 2;
  }

  @Override public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
    return view == object;
  }

  @NonNull @Override public Object instantiateItem(@NonNull ViewGroup container, int position) {
    HorizontalViewHolder holder = HorizontalViewHolder.create(container);
    holder.bind(position);
    container.addView(holder.itemView);
    return holder.itemView;
  }

  @Override
  public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
    container.removeView((View) object);
  }
}