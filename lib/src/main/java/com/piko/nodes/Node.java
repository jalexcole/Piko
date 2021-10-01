package com.piko.nodes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class Node {
    private final UUID id = UUID.randomUUID();
    private Node parent = null;
    protected String name = "Node";

    private SceneTree sceneTree = SceneTree.getInstance();

    Set<Node> children = new TreeSet<>();

    protected Node() {

    }

    protected Node(String name) {
        this.name = name;
    }

    protected Node(Node parent) {
        this.parent = parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void addChild(Node node) {
        children.add(node);
    }

    public void removeChild(Node node) {
        children.remove(node);
    }

    public final void delete() throws Exception {
        if (parent != null) {
            parent.removeChild(this);
        } else {
            throw new Exception("Node does not have Parent");
        }
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public Node getChild(String name) {
        for (Node node: children) {
            if (node.name.equals(name)) {
                return node;
            }
        }

        return null;
    }

    public Node getChild(UUID id) {
        for (Node node: children) {
            if (node.id.equals(id)) {
                return node;
            }
        }

        return null;
    }

    public final void changeParent(Node newParent) {
        Node oldParent = parent;
        newParent.addChild(this);
        oldParent.removeChild(this);
    }

    protected Node getRoot() {
        return sceneTree.getRoot();
    }
    
    protected void init() {}
    protected void process(float delta) {}

    public void initChildren() {
        init();

        for (Node child: children) {
            child.initChildren();
        }
    }


}