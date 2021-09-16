package com.piko.util;

import java.awt.Graphics;
import java.awt.Image;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.piko.pipeline.Renderable;

public class Sprite implements Renderable{
    Image image;
    int x;
    int y;

    Sprite(String filepath) {
        loadImage(filepath);
    }

    private void loadImage(String filepath) {
        if (isImageFileType(filepath)) {
            try {
                image = ImageIO.read(new File(filepath));
             } catch (IOException e) {
                e.printStackTrace();
             }
        }
    }

    private boolean isImageFileType(String filepath) {
        String[] file = filepath.split(".");
        
        switch (file[file.length - 1]) {
            case "png" :
                return true;
            case "jpeg" :
                return true;
            default:
                return false;
        }
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawImage(image, x, y, null);
        
    }
    
}
