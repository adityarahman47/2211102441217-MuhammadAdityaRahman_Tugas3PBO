import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ufo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ufo extends Musuh
{
    /**
     * Act - do whatever the Ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ufo(){
        GreenfootImage img = this.getImage();
        img.scale(100,150);
        this.setImage(img);
    }
    public void act()
    {
        move(-8);
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}
