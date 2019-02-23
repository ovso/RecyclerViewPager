package io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.ovso.recyclerviewpager.R;

public class VerticalViewHolder extends RecyclerView.ViewHolder {
  @BindView(R.id.recyclerview_viewholder) RecyclerView recyclerView;

  VerticalViewHolder(@NonNull View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  void bind(int position) {
    setupRecyclerView();
  }

  private void setupRecyclerView() {
    recyclerView.setLayoutManager(
        new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
    recyclerView.setAdapter(new HorizontalAdapter());
    if (recyclerView.getOnFlingListener() == null) {
      PagerSnapHelper snapHelper = new PagerSnapHelper();
      snapHelper.attachToRecyclerView(recyclerView);
    }
  }

  static VerticalViewHolder create(ViewGroup parent) {
    //View view = View.inflate(parent.getContext(), R.layout.item_main, parent);
    View view =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
    return new VerticalViewHolder(view);
  }
}