package com.example.kidstales.data;

import com.example.kidstales.R;
import com.example.kidstales.model.Story;

import java.util.ArrayList;
import java.util.List;

public class StoriesDataSource {
    private static List<Story> stories;

    public static List<Story> getStories() {
        if (stories == null) {
            generateStories();
        }
        return stories;
    }

    private static void generateStories() {
        stories = new ArrayList<>();
        stories.add(new Story(R.drawable.story1_page1, "The Ant and The Grasshopper"));
        stories.add(new Story(R.drawable.story2_page2, "The Boy Who Cried Wolf"));
        stories.add(new Story(R.drawable.story3_page4, "The Ugly Duckling"));
        stories.add(new Story(R.drawable.story4_page3, "The Hare And The Tortoise"));
        stories.add(new Story(R.drawable.story5_page1, "The Little Red Riding Hood"));
        stories.add(new Story(R.drawable.story6_page1, "The Monkeys and The Cap Seller"));
        stories.add(new Story(R.drawable.story7_page2, "The Golden Egg"));
        stories.add(new Story(R.drawable.story8_page1, "The Cows And The Tiger"));
    }
}
