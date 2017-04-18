package rmuti.lab_3;

/**
 * Hello world!
 *
 */
public class App extends ArrayList {
	
    public static void main( String[] args )
    {
    	App app = new App();
    	//Remove even number
    	System.out.print("Remove even => ");
    	app.removeEven();
    	System.out.println(app.toString());
    	
    	//Add First
    	System.out.print("Add first => ");
    	app.addFirst(5);
    	System.out.println(app.toString());
    	
    	//Add Last
    	System.out.print("Add last => ");
    	app.addFirst(6);
    	System.out.println(app.toString());
    }
}