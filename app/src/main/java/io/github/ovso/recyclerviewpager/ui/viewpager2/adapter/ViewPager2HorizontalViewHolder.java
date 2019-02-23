package io.github.ovso.recyclerviewpager.ui.viewpager2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.ovso.recyclerviewpager.R;

public class ViewPager2HorizontalViewHolder extends RecyclerView.ViewHolder {
  private final static String TAG = "ViewPager2HorizontalViewHolder";
  @BindView(R.id.textview_viewpager2_hviewholder) TextView textView;

  private ViewPager2HorizontalViewHolder(@NonNull View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  void bind(int position) {
    textView.setText(String.valueOf(position));
  }

  public static ViewPager2HorizontalViewHolder create(ViewGroup parent) {
    View view =
        LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_viewpager2_horizontal, parent, false);
    return new ViewPager2HorizontalViewHolder(view);
  }
}