package io.github.ovso.recyclerviewpager;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

  @NonNull @Override
  public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return MainViewHolder.create(parent);
  }

  @Override public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
    holder.bind(position);
  }

  @Override public int getItemCount() {
    return 50;
  }
}