import mayflower.*;
public class Puzzle extends Actor
 {

    public Puzzle()
    {
    	setImage("img/puzzle.png");
    }
    
    @Override public void act()
    {
		  	///////////////////Touching////////////////////////////////
    	if(isTouching(MrMay.class))
    		{
    			getWorld().removeObject(this);
    		}	
    }
    
}