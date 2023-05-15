package com.example.kidstales.adapter;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidstales.R;
import com.example.kidstales.ScenesActivity;
import com.example.kidstales.model.Scene;
import com.example.kidstales.model.Story;
import com.example.kidstales.utils.FavoritesManager;
import com.google.android.material.card.MaterialCardView;
import com.google.gson.Gson;


import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    private List<Story> stories;
    private Context context;
    private int layoutResId;
    private boolean isFavoriteActivity;

    public StoryAdapter(Context context, List<Story> stories, @LayoutRes int layoutResId, boolean isFavoriteActivity) {
        this.context = context;
        this.stories = stories;
        this.layoutResId = layoutResId;
        this.isFavoriteActivity = isFavoriteActivity;
    }

    @Override
    public StoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(layoutResId, parent, false);
        return new StoryViewHolder(itemView, stories, isFavoriteActivity);
    }

    @Override
    public void onBindViewHolder(StoryViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.imageView.setImageResource(story.getCoverImage());
        holder.titleTextView.setText(story.getTitleResourceId());

if(holder.cardViewGrid!=null) {
    holder.cardViewGrid.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Start the SceneActivity and pass the selected story as extra


            Gson gson = new Gson();
            String storyJson = gson.toJson(story);
            Intent intent = new Intent(v.getContext(), ScenesActivity.class);
            intent.putExtra("Story", storyJson);
            v.getContext().startActivity(intent);

            Log.d("MY_TAG_Adapter", "the first scence is:" + story.getScenes().get(0).getText());
        }
    });
}
        if(holder.cardViewList!=null) {
            holder.cardViewList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Start the SceneActivity and pass the selected story as extra


                    Gson gson = new Gson();
                    String storyJson = gson.toJson(story);
                    Intent intent = new Intent(v.getContext(), ScenesActivity.class);
                    intent.putExtra("Story", storyJson);
                    v.getContext().startActivity(intent);

                    Log.d("MY_TAG_Adapter", "the first scence is:" + story.getScenes().get(0).getText());
                }
            });
        }

        // Update the favorite ImageButton's icon based on the isFavorite field
        if (story.isFavorite()) {
            holder.favoriteButton.setImageResource(R.drawable.ic_heart_filled);
        } else {
            holder.favoriteButton.setImageResource(R.drawable.ic_heart_outline);
        }
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class StoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleTextView;
        ImageButton favoriteButton;
        List<Story> stories;
        MaterialCardView cardViewGrid;
        MaterialCardView cardViewList;

        public StoryViewHolder(View itemView, List<Story> stories, boolean isFavoriteActivity) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_storyCover);
            titleTextView = itemView.findViewById(R.id.tv_storyTitle);
            favoriteButton = itemView.findViewById(R.id.ib_favorite);
            cardViewGrid = itemView.findViewById(R.id.Story_card_grid);
            cardViewList = itemView.findViewById(R.id.Story_card_liste);

            this.stories = stories;


            if (isFavoriteActivity) {
                favoriteButton.setVisibility(View.GONE); // Hide the favorite ImageButton
            } else {
                // Implement a click listener for the favorite ImageButton
                favoriteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            // Get the corresponding story
                            Story story = stories.get(position);

                            // Toggle the isFavorite field
                            boolean isFavorite = story.isFavorite();
                            story.setFavorite(!isFavorite);

                            // Update the ImageButton's icon based on the isFavorite field
                            if (story.isFavorite()) {
                                favoriteButton.setImageResource(R.drawable.ic_heart_filled);
                                FavoritesManager.getInstance().addFavoriteStory(story); // Add the story to favorites
                            } else {
                                favoriteButton.setImageResource(R.drawable.ic_heart_outline);
                                FavoritesManager.getInstance().removeFavoriteStory(story); // Remove the story from favorites
                            }
                        }
                      }
                                                                    });
                    }
        }



    }
}
