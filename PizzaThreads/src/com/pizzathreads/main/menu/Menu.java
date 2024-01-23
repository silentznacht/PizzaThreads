
import java.util.*;

public class Menu implements Runnable { 
	static Thread thread;
	private static void startMenu() {
		    System.out.println
                (
                        """
                                            [Frank's Pizza]

                                1. Order Pizza 
                                2. Check Our Menu
                                3. Leave
                            
                        """ 
                );
			
	}

	@Override
	public void run() {
		// TODO: Menu Thread
		startMenu();

	}


}
