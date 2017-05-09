
import mayflower.*;
public class Level1World extends World
{

    public Level1World() 
    {
    	setBackground("img/bg_space.png");
    	MrMay may = new MrMay();
    	addObject(may,400,300);
    	
    	CookieActor cookie = new CookieActor();
    	addObject(cookie,200,200);
    	
    	WallActor wall = new WallActor();
    	addObject(wall,400,300);
    	
    	setPaintOrder(CookieActor.class, MrMay.class);
    }
  	 	@Override
    	public void act()
    	{
    		
    	}
    
}