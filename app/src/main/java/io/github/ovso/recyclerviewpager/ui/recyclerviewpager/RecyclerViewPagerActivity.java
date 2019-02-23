package io.github.ovso.recyclerviewpager.ui.recyclerviewpager;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.ovso.recyclerviewpager.R;
import io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter.OnSnapPositionChangeListener;
import io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter.SnapOnScrollListener;
import io.github.ovso.recyclerviewpager.ui.recyclerviewpager.adapter.VerticalAdapter;

public class RecyclerViewPagerActivity extends AppCompatActivity implements
    OnSnapPositionChangeListener {

  @BindView(R.id.recyclerview_recycler) RecyclerView recyclerView;
  private PagerSnapHelper snapHelper;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recyclerviewpager);
    ButterKnife.bind(this);
    setupRecyclerView();
  }

  private void setupRecyclerView() {
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(new VerticalAdapter());
    snapHelper = new PagerSnapHelper();
    snapHelper.attachToRecyclerView(recyclerView);
    SnapOnScrollListener.Behavior behavior = SnapOnScrollListener.Behavior.NOTIFY_ON_SCROLL;
    SnapOnScrollListener snapOnScrollListener =
        new SnapOnScrollListener(snapHelper, behavior, this);
    recyclerView.addOnScrollListener(snapOnScrollListener);
  }

  @Override public void onSnapPositionChange(int snapPosition) {
    Log.d("Main", "snapPosition = " + snapPosition);
  }
}