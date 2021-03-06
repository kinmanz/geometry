package com.db.geometry.tasksCreation;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;


// Add triangular poligon maker as class from two constructors

public class WriteImageType {
    static public void main(String args[]) throws Exception {
        try {

            TriangularDrawer triangularDrawer = new TriangularDrawer();

//            BufferedImage bi = triangularDrawer.createOnCathetus(3, 4, 360);
            BufferedImage bi = triangularDrawer.createOnCathetAndHypotenuse(1, 7);
//            BufferedImage bi = triangularDrawer.createOnAngles(Arrays.asList(60, 60, 60));

//            RectangleDrawer rectangleDrawer = new RectangleDrawer(graphic);
//            BufferedImage bi = triangularDrawer.createOnCathetus(5, 10);
            ImageIO.write(bi, "png", new File("yourImageName.png"));
            ImageIO.write(bi, "gif", new File("yourImageName.gif"));

        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }
}