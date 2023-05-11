package com.example.kidstales.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidstales.R;
import com.example.kidstales.model.Story;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    private List<Story> stories;
    private Context context;
    private int layoutResId;


    public StoryAdapter(Context context, List<Story> stories, @LayoutRes int layoutResId) {
        this.context = context;
        this.stories = stories;
        this.layoutResId = layoutResId;
    }

    @Override
    public StoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(layoutResId, parent, false);
        return new StoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(StoryViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.imageView.setImageResource(story.getCoverImage());
        holder.titleTextView.setText(story.getTitle());
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public static class StoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleTextView;

        public StoryViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_storyCover);
            titleTextView = itemView.findViewById(R.id.tv_storyTitle);
        }
    }
}
