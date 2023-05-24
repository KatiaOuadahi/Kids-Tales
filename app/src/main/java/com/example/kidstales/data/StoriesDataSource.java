package com.example.kidstales.data;

import com.example.kidstales.R;
import com.example.kidstales.model.Scene;
import com.example.kidstales.model.Story;

import java.util.ArrayList;
import java.util.List;

public class StoriesDataSource {
    private static List<Story> stories;

    // Déclarer des listes pour chaque histoire (scenesOfStory01,..., scenesOfStory08)
    private static List<Scene> ScenesOfStory01;
    private static List<Scene> ScenesOfStory02;
    private static List<Scene> ScenesOfStory03;
    private static List<Scene> ScenesOfStory04;
    private static List<Scene> ScenesOfStory05;
    private static List<Scene> ScenesOfStory06;
    private static List<Scene> ScenesOfStory07;
    private static List<Scene> ScenesOfStory08;

    public static List<Story> getStories() {
        if (stories == null) {
            generateStories();
        }
        return stories;
    }


    private static void generateStories() {

        // Appeler les méthodes pour générer les scènes pour chaque histoire
        generateScenesOfStory01();
        generateScenesOfStory02();
        generateScenesOfStory03();
        generateScenesOfStory04();
        generateScenesOfStory05();
        generateScenesOfStory06();
        generateScenesOfStory07();
        generateScenesOfStory08();


        stories = new ArrayList<>();

        // Ajouter les histoires à la liste stories
        stories.add(new Story(R.drawable.story1_page3, R.string.title1, ScenesOfStory01));
        stories.add(new Story(R.drawable.story2_page2, R.string.title2, ScenesOfStory02));
        stories.add(new Story(R.drawable.story3_page4, R.string.title3, ScenesOfStory03));
        stories.add(new Story(R.drawable.story4_page3, R.string.title4, ScenesOfStory04));
        stories.add(new Story(R.drawable.story5_page1, R.string.title5, ScenesOfStory05));
        stories.add(new Story(R.drawable.story6_page1, R.string.title6, ScenesOfStory06));
        stories.add(new Story(R.drawable.story7_page2, R.string.title7, ScenesOfStory07));
        stories.add(new Story(R.drawable.story8_page1, R.string.title8, ScenesOfStory08));
    }

    private static void generateScenesOfStory01() {

        // Ajouter les scènes à la liste scenesOfStory01
        ScenesOfStory01 = new ArrayList<>();
        ScenesOfStory01.add(new Scene(R.drawable.story1_page1, R.string.story1_scene1));
        ScenesOfStory01.add(new Scene(R.drawable.story1_page2, R.string.story1_scene2));
        ScenesOfStory01.add(new Scene(R.drawable.story1_page3, R.string.story1_scene3));
        ScenesOfStory01.add(new Scene(R.drawable.story1_page4, R.string.story1_scene4));
    }

    private static void generateScenesOfStory02() {

        // Ajouter les scènes à la liste scenesOfStory02
        ScenesOfStory02 = new ArrayList<>();
        ScenesOfStory02.add(new Scene(R.drawable.story2_page1, R.string.story2_scene1));
        ScenesOfStory02.add(new Scene(R.drawable.story2_page2, R.string.story2_scene2));
        ScenesOfStory02.add(new Scene(R.drawable.story2_page3, R.string.story2_scene3));
        ScenesOfStory02.add(new Scene(R.drawable.story2_page4, R.string.story2_scene4));

    }

    private static void generateScenesOfStory03() {

        // Ajouter les scènes à la liste scenesOfStory03
        ScenesOfStory03 = new ArrayList<>();
        ScenesOfStory03.add(new Scene(R.drawable.story3_page1, R.string.story3_scene1));
        ScenesOfStory03.add(new Scene(R.drawable.story3_page2, R.string.story3_scene2));
        ScenesOfStory03.add(new Scene(R.drawable.story3_page3, R.string.story3_scene3));
        ScenesOfStory03.add(new Scene(R.drawable.story3_page4, R.string.story3_scene4));

    }

    private static void generateScenesOfStory04() {

        // Ajouter les scènes à la liste scenesOfStory04
        ScenesOfStory04 = new ArrayList<>();
        ScenesOfStory04.add(new Scene(R.drawable.story4_page1, R.string.story4_scene1));
        ScenesOfStory04.add(new Scene(R.drawable.story4_page2, R.string.story4_scene2));
        ScenesOfStory04.add(new Scene(R.drawable.story4_page3, R.string.story4_scene3));
        ScenesOfStory04.add(new Scene(R.drawable.story4_page4, R.string.story4_scene4));
    }

    private static void generateScenesOfStory05() {

        // Ajouter les scènes à la liste scenesOfStory05
        ScenesOfStory05 = new ArrayList<>();
        ScenesOfStory05.add(new Scene(R.drawable.story5_page1, R.string.story5_scene1));
        ScenesOfStory05.add(new Scene(R.drawable.story5_page2, R.string.story5_scene2));
        ScenesOfStory05.add(new Scene(R.drawable.story5_page3, R.string.story5_scene3));
        ScenesOfStory05.add(new Scene(R.drawable.story5_page4, R.string.story5_scene4));
        ScenesOfStory05.add(new Scene(R.drawable.story5_page5, R.string.story5_scene5));
    }

    private static void generateScenesOfStory06() {

        // Ajouter les scènes à la liste scenesOfStory06
        ScenesOfStory06 = new ArrayList<>();
        ScenesOfStory06.add(new Scene(R.drawable.story6_page1, R.string.story6_scene1));
        ScenesOfStory06.add(new Scene(R.drawable.story6_page2, R.string.story6_scene2));
        ScenesOfStory06.add(new Scene(R.drawable.story6_page3, R.string.story6_scene3));
        ScenesOfStory06.add(new Scene(R.drawable.story6_page4, R.string.story6_scene4));
        ScenesOfStory06.add(new Scene(R.drawable.story6_page5, R.string.story6_scene5));
    }

    private static void generateScenesOfStory07() {

        // Ajouter les scènes à la liste scenesOfStory07
        ScenesOfStory07 = new ArrayList<>();
        ScenesOfStory07.add(new Scene(R.drawable.story7_page1, R.string.story7_scene1));
        ScenesOfStory07.add(new Scene(R.drawable.story7_page2, R.string.story7_scene2));
        ScenesOfStory07.add(new Scene(R.drawable.story7_page3, R.string.story7_scene3));
        ScenesOfStory07.add(new Scene(R.drawable.story7_page4, R.string.story7_scene4));
        ScenesOfStory07.add(new Scene(R.drawable.story7_page5, R.string.story7_scene5));
        ScenesOfStory07.add(new Scene(R.drawable.story7_page6, R.string.story7_scene6));
    }

    private static void generateScenesOfStory08() {

        // Ajouter les scènes à la liste scenesOfStory08
        ScenesOfStory08 = new ArrayList<>();
        ScenesOfStory08.add(new Scene(R.drawable.story8_page1, R.string.story8_scene1));
        ScenesOfStory08.add(new Scene(R.drawable.story8_page2, R.string.story8_scene2));
        ScenesOfStory08.add(new Scene(R.drawable.story8_page3, R.string.story8_scene3));
        ScenesOfStory08.add(new Scene(R.drawable.story8_page4, R.string.story8_scene4));
        ScenesOfStory08.add(new Scene(R.drawable.story8_page5, R.string.story8_scene5));
    }

}
