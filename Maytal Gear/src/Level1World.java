
import mayflower.*;
public class Level1World extends World
{

    public Level1World() 
    {
    	setBackground("img/bg_space.png");
    	setPaintOrder(CookieActor.class, MrMay.class);
    	MrMay may = new MrMay();
    	addObject(may,400,300);
    	
    	CookieActor cookie = new CookieActor();
    	addObject(cookie,200,200);
    	
    	WallActor wall = new WallActor();
    	addObject(wall,400,300);
    	
    	
    }
  	 	@Override
    	public void act()
    	{
    		
    	}
    
}