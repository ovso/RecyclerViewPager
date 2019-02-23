package io.github.ovso.recyclerviewpager.ui.viewpager2.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewPager2HorizontalAdapter extends RecyclerView.Adapter<ViewPager2HorizontalViewHolder> {
  @NonNull @Override
  public ViewPager2HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return ViewPager2HorizontalViewHolder.create(parent);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewPager2HorizontalViewHolder holder, int position) {
    holder.bind(position);
  }

  @Override public int getItemCount() {
    return 2;
  }
}
