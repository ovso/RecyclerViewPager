package io.github.ovso.recyclerviewpager;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

public class SnapOnScrollListener extends RecyclerView.OnScrollListener {
  private final SnapHelper snapHelper;
  private final Behavior behavior;
  private final OnSnapPositionChangeListener onSnapPositionChangeListener;
  private int snapPosition = RecyclerView.NO_POSITION;

  public SnapOnScrollListener(
      @NonNull SnapHelper snapHelper,
      @NonNull Behavior behavior,
      @NonNull OnSnapPositionChangeListener onSnapPositionChangeListener) {
    this.snapHelper = snapHelper;
    this.behavior = behavior;
    this.onSnapPositionChangeListener = onSnapPositionChangeListener;
  }

  enum Behavior {
    NOTIFY_ON_SCROLL,
    NOTIFY_ON_SCROLL_STATE_IDLE
  }

  @Override public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
    maybeNotifySnapPositionChange(recyclerView);
  }

  @Override public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
    if (newState == RecyclerView.SCROLL_STATE_IDLE) {
      maybeNotifySnapPositionChange(recyclerView);
    }
  }

  private void maybeNotifySnapPositionChange(@NonNull RecyclerView recyclerView) {
    int snapPosition = getSnapPosition(recyclerView);
    boolean snapPositionChanged = this.snapPosition != snapPosition;
    if (snapPositionChanged) {
      onSnapPositionChangeListener.onSnapPositionChange(snapPosition);
      this.snapPosition = snapPosition;
    }
  }

  private int getSnapPosition(RecyclerView recyclerView) {
    View snapView = snapHelper.findSnapView(recyclerView.getLayoutManager());
    if (snapView != null) {
      return recyclerView.getLayoutManager().getPosition(snapView);
    } else {
      return RecyclerView.NO_POSITION;
    }
  }
}
