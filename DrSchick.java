import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BobKaehms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrSchick extends Teacher //implements JustForFun
{
    

   
    
    public DrSchick () {

    setLocation(mySeat,myRow);
 
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
         //   getName(); 
              sayName("bobkaehms.wav");
        }
    } 
    public void getName(){
        System.out.println("\n My name is Bob Kaehms");
    }
}
