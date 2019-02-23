package io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.ovso.recyclerviewpager.R;

public class HorizontalViewHolder extends RecyclerView.ViewHolder {
  private final static String TAG = "HorizontalViewHolder";
  @BindView(R.id.textview_hviewholder_item) TextView titleTextView;

  HorizontalViewHolder(@NonNull View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  void bind(int position) {
    Log.d(TAG, "bind = " + position);
    titleTextView.setText(String.valueOf(position));
  }

  static HorizontalViewHolder create(ViewGroup parent) {
    View view =
        LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_horizontal_viewholder, parent, false);
    return new HorizontalViewHolder(view);
  }
}