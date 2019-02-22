package io.github.ovso.recyclerviewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainViewHolder extends RecyclerView.ViewHolder {
  @BindView(R.id.textview_mainviewholder) TextView indexTextView;

  MainViewHolder(@NonNull View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  void bind(int position) {
    indexTextView.setText(String.valueOf(position));
  }

  static MainViewHolder create(ViewGroup parent) {
    //View view = View.inflate(parent.getContext(), R.layout.item_main, parent);
    View view =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
    return new MainViewHolder(view);
  }
}