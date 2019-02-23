package io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalViewHolder> {

  @NonNull @Override
  public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return HorizontalViewHolder.create(parent);
  }

  @Override public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
    holder.bind(position);
  }

  @Override public int getItemCount() {
    return 2;
  }
}