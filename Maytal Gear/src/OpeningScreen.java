/**
 * @(#)Window.java
 *
 *
 * @author 
 * @version 1.00 2017/5/1
 */

import mayflower.*;
public class OpeningScreen extends World{

    public OpeningScreen() {
    	setBackground("img/title.png");
    	StartGameButton start = new StartGameButton();
    	addObject(start, 304, 400);
    }
    @Override
    public void act(){
    	
    }
    
}