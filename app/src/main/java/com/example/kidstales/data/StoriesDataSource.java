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
    private static List <Scene> ScenesOfStory03;
    private static List <Scene> ScenesOfStory04;
    private static List <Scene> ScenesOfStory05;
    private static List <Scene> ScenesOfStory06;
    private static List <Scene> ScenesOfStory07;
    private static List <Scene> ScenesOfStory08;

    public static List<Story> getStories() {
        if (stories == null) {
            generateStories();
        }
        return stories;
    }



    private static void generateStories() {

        generateScenesOfStory01();
        generateScenesOfStory02();
        generateScenesOfStory03();
        generateScenesOfStory04();
        generateScenesOfStory05();
        generateScenesOfStory06();
        generateScenesOfStory07();
        generateScenesOfStory08();
        stories = new ArrayList<>();
        stories.add(new Story(R.drawable.story1_page1, R.string.title1,ScenesOfStory01));
        stories.add(new Story(R.drawable.story2_page2, R.string.title2,ScenesOfStory02));
        stories.add(new Story(R.drawable.story3_page4, R.string.title3,ScenesOfStory03));
        stories.add(new Story(R.drawable.story4_page3, R.string.title4,ScenesOfStory04));
        stories.add(new Story(R.drawable.story5_page1, R.string.title5,ScenesOfStory05));
        stories.add(new Story(R.drawable.story6_page1, R.string.title6,ScenesOfStory06));
        stories.add(new Story(R.drawable.story7_page2, R.string.title7,ScenesOfStory07));
        stories.add(new Story(R.drawable.story8_page1, R.string.title8,ScenesOfStory08));
    }
    private static void generateScenesOfStory01(){
        ScenesOfStory01=new ArrayList<>();
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"The ant and the grasshopper were good friends. \n" +
                "In the summer, the ant works hard to fill his storage with food. \n" +
                "While the grasshopper was playing all day."));
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"When winter came, the ant was lying cozily in his home surrounded by the food he stored during the summer. While the grasshopper hungry and freezing. \n"));
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"He asked the ant for food and the ant gave him some. \n" +
                "But it wasn’t enough to last the entire winter."));
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"When he tried to ask the ant again, the latter replied: “I’m sorry my friend but my food is just enough for my family to last until the end of winter. \n"));
        ScenesOfStory01.add(new Scene(R.drawable.story1_cover,"If I give you more, we too will starve. We had the entire summer to prepare for the winter but you chose to play instead.”\n"));
    }
    private static void generateScenesOfStory02(){
        ScenesOfStory02=new ArrayList<>();
        ScenesOfStory02.add(new Scene(R.drawable.story2_cover,"There was once a shepherd boy who liked to play tricks. \n" +
                "One day, while he was watching over the herd, the boy decided to play a trick and cried “wolf! wolf!”. \n"));
        ScenesOfStory02.add(new Scene(R.drawable.story2_cover,"The people who heard rushed over to help him. \n" +
                "But they were disappointed when they saw that there was no wolf and the boy was laughing at them."));
        ScenesOfStory02.add(new Scene(R.drawable.story2_cover,"The next day, he did it again and people rushed to his aid only to be disappointed once again. "));
        ScenesOfStory02.add(new Scene(R.drawable.story2_cover,"On the third day, the boy saw a wolf devouring one of his sheep and cried for help. \n" +
                "But the people who heard him thought this is just another of the boy’s pranks. "));
        ScenesOfStory02.add(new Scene(R.drawable.story2_cover,"So no one came to help him. That day, the boy lost some of his sheep to the wolf.\n"));

    }

    private static void generateScenesOfStory03(){
        ScenesOfStory03=new ArrayList<>();
        ScenesOfStory03.add(new Scene(R.drawable.story3_cover,"There was once a a duckling who from the moment of his birth has always felt different from his siblings."));
        ScenesOfStory03.add(new Scene(R.drawable.story3_cover,"He was always picked on because he didn’t look like the rest of them. \n" +
                "One day, he had enough and ran away from the pond he grew up in. \n"));
        ScenesOfStory03.add(new Scene(R.drawable.story3_cover,"He wandered near and far looking for a family who would accept him. \n" +
                "Months passed and seasons changed but everywhere he went, nobody wanted him because he was such an ugly duck. \n"));
        ScenesOfStory03.add(new Scene(R.drawable.story3_cover,"Then one day, he came upon a family of swans. "));
        ScenesOfStory03.add(new Scene(R.drawable.story3_cover,"Upon looking at them, he realized that during the months he spent looking for a family to call his own, he had grown into a beautiful swan.\n" +
                " "));
        ScenesOfStory03.add(new Scene(R.drawable.story3_cover,"Now he finally understood why he never looked like the rest of his siblings because he isn’t a duck but a swan.\n" +
                "\n"));
    }

    private static void generateScenesOfStory04(){
        ScenesOfStory04=new ArrayList<>();
        ScenesOfStory04.add(new Scene(R.drawable.story4_cover,"There was once a hare who was friends with a tortoise. \n" +
                "One day, he challenged the tortoise to a race."));
        ScenesOfStory04.add(new Scene(R.drawable.story4_cover,"Seeing how slow the tortoise was going, \n" +
                "the hare thought he’ll win this easily. "));
        ScenesOfStory04.add(new Scene(R.drawable.story4_cover,"So he took a nap while the tortoise kept on going."));
        ScenesOfStory04.add(new Scene(R.drawable.story4_cover,"When the hare woke up, he saw that the tortoise was already at the finish line. \n" +
                "Much to his chagrin, the tortoise won the race while he was busy sleeping."));
    }

    private static void generateScenesOfStory05(){
        ScenesOfStory05=new ArrayList<>();
        ScenesOfStory05.add(new Scene(R.drawable.story5_cover,"Once there was a dog who wandered the streets night and day in search of food. \n" +
                "One day, he found a big juicy bone.\n"));
        ScenesOfStory05.add(new Scene(R.drawable.story5_cover,"He immediately grabbed it between his mouth and took it home. \n"));
        ScenesOfStory05.add(new Scene(R.drawable.story5_cover,"On his way home, he crossed a river and saw another dog who also had a bone in its mouth. \n" +
                "He wanted that bone for himself too."));
        ScenesOfStory05.add(new Scene(R.drawable.story5_cover,"But as he opened his mouth, the bone he was biting fell into the river and sank. \n" +
                "That night, he went home hungry."));
    }
    private static void generateScenesOfStory06(){
        ScenesOfStory06=new ArrayList<>();
        ScenesOfStory06.add(new Scene(R.drawable.story6_cover,""));
        ScenesOfStory06.add(new Scene(R.drawable.story6_cover,""));
        ScenesOfStory06.add(new Scene(R.drawable.story6_cover,""));
        ScenesOfStory06.add(new Scene(R.drawable.story6_cover,""));
    }
    private static void generateScenesOfStory07(){
        ScenesOfStory07=new ArrayList<>();
        ScenesOfStory07.add(new Scene(R.drawable.story7_cover,"Once there was a hungry fox who stumbled upon a vineyard. \n"));
        ScenesOfStory07.add(new Scene(R.drawable.story7_cover,"After seeing the round, juicy grapes hanging in a bunch, the fox drooled. \n"));
        ScenesOfStory07.add(new Scene(R.drawable.story7_cover,"But no matter how high he jumped, he couldn’t reach for it. \n"));
        ScenesOfStory07.add(new Scene(R.drawable.story7_cover,"So he told himself that it was probably sour and left. \n" +
                "That night, he had to sleep on an empty stomach.\n"));

    }

    private static void generateScenesOfStory08(){
        ScenesOfStory08=new ArrayList<>();
        ScenesOfStory08.add(new Scene(R.drawable.story8_cover,"There was once a proud elephant who always bullied smaller animals. \n"));
        ScenesOfStory08.add(new Scene(R.drawable.story8_cover,"He would go to the anthill near his home and spray water at the ants. \n" +
                "The ants, with their size, could do nothing but cry. \n"));
        ScenesOfStory08.add(new Scene(R.drawable.story8_cover,"One day, the ants had enough and decided to teach the elephant a lesson. \n" +
                "They went straight into the elephant’s trunk and started biting him. \n"));
        ScenesOfStory08.add(new Scene(R.drawable.story8_cover,"The elephant could only howl in pain. \n"));
        ScenesOfStory08.add(new Scene(R.drawable.story8_cover,"He realized his mistake and apologized to the ants and all the animals he bullied.\n"));
    }

}
