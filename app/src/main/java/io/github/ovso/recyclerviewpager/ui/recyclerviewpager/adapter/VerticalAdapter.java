package io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalViewHolder> {

  @NonNull @Override
  public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return VerticalViewHolder.create(parent);
  }

  @Override public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
    holder.bind(position);
  }

  @Override public int getItemCount() {
    return 50;
  }
}