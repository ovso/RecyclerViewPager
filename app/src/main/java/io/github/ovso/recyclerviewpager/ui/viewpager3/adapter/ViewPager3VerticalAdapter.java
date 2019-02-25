package io.github.ovso.recyclerviewpager.ui.viewpager3.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter.VerticalViewHolder;

public class ViewPager3VerticalAdapter extends RecyclerView.Adapter<ViewPager3VerticalViewHolder> {

  @NonNull @Override
  public ViewPager3VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return ViewPager3VerticalViewHolder.create(parent);
  }

  @Override public void onBindViewHolder(@NonNull ViewPager3VerticalViewHolder holder, int position) {
    holder.bind(position);
  }

  @Override public int getItemCount() {
    return 50;
  }
}