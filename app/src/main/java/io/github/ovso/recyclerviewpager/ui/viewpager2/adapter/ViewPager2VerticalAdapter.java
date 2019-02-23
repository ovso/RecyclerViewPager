package io.github.ovso.recyclerviewpager.ui.viewpager2.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewPager2VerticalAdapter extends RecyclerView.Adapter<ViewPager2VerticalViewHolder> {
  @NonNull @Override
  public ViewPager2VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return ViewPager2VerticalViewHolder.create(parent);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewPager2VerticalViewHolder holder, int position) {
    holder.bind(position);
  }

  @Override public int getItemCount() {
    return 50;
  }
}