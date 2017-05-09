import mayflower.*;
public class CookieActor extends Actor
 {

    public CookieActor()
    {
    	setImage("img/cookie.png");
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