package com.example.kidstales.model;

import java.util.List;

public class StoryScenes {
        private String id;
        private List<Scene> scenes;

        public StoryScenes(String id, List<Scene> scenes) {
            this.id = id;
            this.scenes = scenes;
        }

        public String getId() {
            return id;
        }

        public List<Scene> getScenes() {
            return scenes;
        }


}
