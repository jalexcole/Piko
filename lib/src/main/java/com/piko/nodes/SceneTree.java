package com.piko.nodes;

import java.util.List;
import java.util.ArrayList;

public class SceneTree {
    
    private static SceneTree instance = null;

    private Node currentScene = null;
    private List<Node> sceneStack = new ArrayList<>();

    
    public static SceneTree getInstance() {
        if (instance == null) {
            instance = new SceneTree();
        }

        return instance;
    }

    private SceneTree() {

    }

    public Node getRoot() {
        return currentScene;
    }

    public void addScene(Node scene) {
        sceneStack.add(scene);
    }

    public void changeScene(String sceneName) {
        for (Node scene: sceneStack) {
            if (scene.getName().equals(sceneName)) {
                currentScene = scene;
                break;
            }
        }
    }


}
