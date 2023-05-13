package com.example.kidstales.data;

import com.example.kidstales.R;
import com.example.kidstales.model.Scene;
import com.example.kidstales.model.Story;

import java.util.ArrayList;
import java.util.List;

public class StoriesDataSource {
    private static List<Story> stories;
    private static List <Scene> ScenesOfStory01;
    private static List <Scene> ScenesOfStory02;

    public static List<Story> getStories() {
        if (stories == null) {
            generateStories();
        }
        return stories;
    }



    private static void generateStories() {

        generateScenesOfStory01();
        generateScenesOfStory02();
        stories = new ArrayList<>();
        stories.add(new Story(R.drawable.story1_cover, "The Ant and The Grasshopper",ScenesOfStory01));
        stories.add(new Story(R.drawable.story2_cover, "The Boy Who Cried Wolf",ScenesOfStory01));
        stories.add(new Story(R.drawable.story3_cover, "The Ugly Duckling",ScenesOfStory01));
        stories.add(new Story(R.drawable.story4_cover, "The Hare And The Tortoise",ScenesOfStory01));
        stories.add(new Story(R.drawable.story5_cover, "The Little Red Riding Hood",ScenesOfStory01));
        stories.add(new Story(R.drawable.story6_cover, "The Monkeys and The Cap Seller",ScenesOfStory01));
        stories.add(new Story(R.drawable.story7_cover, "The Golden Egg",ScenesOfStory01));
        stories.add(new Story(R.drawable.story8_cover, "The Cows And The Tiger",ScenesOfStory01));
    }



    private static void generateScenesOfStory01(){
        ScenesOfStory01=new ArrayList<>();
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"First Text To Read"));
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"Second Text To Read"));
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"Third Text To Read"));
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"Forth Text To Read"));
    }
    private static void generateScenesOfStory02(){
        ScenesOfStory02=new ArrayList<>();
        ScenesOfStory02.add(new Scene(R.drawable.story1_cover,"First Text To Read"));
        ScenesOfStory02.add(new Scene(R.drawable.story1_cover,"Second Text To Read"));
        ScenesOfStory02.add(new Scene(R.drawable.story1_cover,"Third Text To Read"));
        ScenesOfStory02.add(new Scene(R.drawable.story1_cover,"Forth Text To Read"));
    }

}
