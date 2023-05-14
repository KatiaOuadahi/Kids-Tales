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
        stories.add(new Story(R.drawable.story1_page3, R.string.title1));
        stories.add(new Story(R.drawable.story2_page2, R.string.title2));
        stories.add(new Story(R.drawable.story3_page4, R.string.title3));
        stories.add(new Story(R.drawable.story4_page3, R.string.title4));
        stories.add(new Story(R.drawable.story5_page1, R.string.title5));
        stories.add(new Story(R.drawable.story6_page1, R.string.title6));
        stories.add(new Story(R.drawable.story7_page2, R.string.title7));
        stories.add(new Story(R.drawable.story8_page1, R.string.title8));
    }

}
