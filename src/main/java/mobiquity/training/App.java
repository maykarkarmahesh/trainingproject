package mobiquity.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	int number;
	
	App(int number ){
		this.number = number;
		
	}
	int getNumber(){
		return this.number;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<App> list = new ArrayList<App>();
        
        list.add(new App(10));
        list.add(new App(20));
        retrieve(list);
        
        
    }
    
    static void retrieve(List<App> list){
    	
    	// access first element
    	App firstApp = list.get(0);
    	firstApp.getNumber();
    	
    }
    
    
}
