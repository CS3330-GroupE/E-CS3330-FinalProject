package game;

public class PresetText {
	
	public void characterPrompt() {
	    System.out.println("===========================================");
	    System.out.println("|             Choose a Character          |");
	    System.out.println("===========================================");
	    System.out.println("|  Mage                                	  |");
	    System.out.println("|  Ranger                                 |");
	    System.out.println("|  Warrior                                |");
	    System.out.println("===========================================");
	}
	

	public void commandPrompt() {
		System.out.print("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|               Enter a Command           |");
	    System.out.println("===========================================");
	    System.out.println("|  Begin Battle                           |");
	    System.out.println("|  View Inventory                         |");
	    System.out.println("|  Visit Bazaar                           |");
	    System.out.println("|  Quit                                   |");
	    System.out.println("===========================================");
	}
	
	public void inventoryCommandPrompt() {
		System.out.print("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|          Enter Inventory Command        |");
	    System.out.println("===========================================");
	    System.out.println("|  Check Current Equipment                |");
	    System.out.println("|  Check Stats                            |");
	    System.out.println("|  Equip Item (Enter Item Index)          |");
	    System.out.println("|  Back                                   |");
	    System.out.println("===========================================");
	}
	
	public void battleCommandPrompt() {
		System.out.print("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|           Enter Battle Command          |");
	    System.out.println("===========================================");
	    System.out.println("|  Attack                                 |");
	    System.out.println("|  Use Health Potion                      |");
	    System.out.println("|  Run                                    |");
	    System.out.println("===========================================");
	}

	
	public void startGameLogo() {
	    System.out.println("===========================================");
	    System.out.println("|                                         |");
	    System.out.println("|           Adventures of JEBB            |");
	    System.out.println("|                                         |");
	    System.out.println("|                   BY:                   |");
	    System.out.println("|                                         |");
	    System.out.println("|            JONATHAN HATFIELD            |");
	    System.out.println("|             ETHAN ALEXANDER             |");
	    System.out.println("|               BRIAN BLUHM               |");
	    System.out.println("|              BLAKE SIMPSON              |");
	    System.out.println("|                                         |");
	    System.out.println("===========================================");
	    System.out.print("\n\n");
	}
	
	public void shopCommandPrompt() {
		System.out.print("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|           Welcome to the Bazarr!        |");
	    System.out.println("===========================================");
	    System.out.println("|  Buy Random Item (50 gold)              |");
	    System.out.println("|  Buy Health Potion (15 gold)            |");
	    System.out.println("|  Restore Full Health (20 gold)          |");
	    System.out.println("|  Back                                   |");
	    System.out.println("===========================================");
	}
	
	public void printGoblin() {
		
		System.out.println("          **            ");
		System.out.println("       *%###            ");
		System.out.println("       ##%%#            ");
		System.out.println("       #%#              ");
		System.out.println("      #%+    -  -       ");
		System.out.println("     %%    #****=-==    ");
		System.out.println("   *-#=  *+%@%##*++*#   ");
		System.out.println("   *#@%  +-:-==#%%**    ");
		System.out.println("  +%%@@#+#*=--=+%@@%*   ");
		System.out.println(" +*+ #@@##%#*=+=+++++%# ");
		System.out.println("+*+   +*   %#**+*%%%@%@#");
		System.out.println("         #%+%%#%%######*");
		System.out.println("        *#%##*=*%%#     ");
		System.out.println("          @%#+++%%*     ");
		System.out.println("           ##%#%%%*     ");
		System.out.println("          %%%@@%%       ");
		System.out.println("         #%##%%%%*      ");
		System.out.println("         +#*+=+*        ");	
	}
	
	public void printDragon() {
		
		System.out.println("                                 *******######**+ ");
		System.out.println("                            ++******+****###%*    ");
		System.out.println("  +****                *   **************##%#+    ");
		System.out.println(" *++***#*#####        ++ *****#####****###%##*    ");
		System.out.println("**+******####         ***##***********##%%%#*#+*  ");
		System.out.println(" **###########        **##***********##%#*        ");
		System.out.println("++*###**######%*       *#**#*****#####%%#         ");
		System.out.println("  *############        **********####%%%#*        ");
		System.out.println("    **###***###        *#******#####%#   **       ");
		System.out.println("       **##***#%*      *##****####%%#*            ");
		System.out.println("        ++*****###    **##****###%%##             ");
		System.out.println("      +*******#*#    ****#***###%%##*             ");
		System.out.println("       +=+****#*#   **##****##%#    *             ");
		System.out.println("        **++###*# *###****#####                   ");
		System.out.println("        -=+*##*######***#####*                    ");
		System.out.println("        =++*#######***#####*                      ");
		System.out.println("    +*  +++****###***####*                        ");
		System.out.println("   +++******#*########+                           ");
		System.out.println("   =+****#**##***######                           ");
		System.out.println("       ****  ****+**###+                          ");
		System.out.println("                *#****#***                        ");
		System.out.println("                *####******                       ");
		System.out.println("                ***+***#****+      ***+++         ");
		System.out.println("                   **+++*++**+   +*#*+ +++        ");
		System.out.println("                    *+  *+++***+*##+              ");
		System.out.println("                            *****++               ");
		
	}
	
	public void printOrc() {
		
		System.out.println("             +#                          ");
		System.out.println("           %@@@#*#                       ");
		System.out.println("          @@@@@@@%#*                     ");
		System.out.println("          %%#%##*@@##                    ");
		System.out.println("          %%##*#@@@##*                   ");
		System.out.println("        #######*%@%%*                    ");
		System.out.println("      ***#####*+=#%+=                    ");
		System.out.println("     *#%%%##**####=+-           ==       ");
		System.out.println("     *######%%##**-+::        ##%**      ");
		System.out.println("     *%#####%####*-**=-     %%%####%#    ");
		System.out.println("     #####+=#%%##++###*+==   %%%%%%%%#   ");
		System.out.println("      #%#*+=#%%#*+ ###*#####*++%%%%%%#** ");
		System.out.println("     +#%##+=#%#**      #%#%###*+%@%%%%   ");
		System.out.println("     ##%%##=-#%##*       ##%%     %%     ");
		System.out.println("    ##%%#%##*=+**+++  ##%%               ");
		System.out.println("    *####*%**#*****+-%%@                 ");
		System.out.println("     ####*-+*###****%+--                 ");
		System.out.println("     **##*-+#++*%#####*+==               ");
		System.out.println("     *+*#*=#*+##*+#######+=              ");
		System.out.println("      **##*#%%***+   #####*              ");
		System.out.println("      #*##%%        **#%%%#              ");
		System.out.println("    ######         #*#*#*+*              ");
		System.out.println("   =****#*           %%%%*               ");
		System.out.println("   ++**#+            %%#*+               ");
		System.out.println("  +%%##*=          @#%###+++*            ");
		System.out.println("  =%%*+#%%%%%%%@@@@@%%%%%%%**            ");
		System.out.println("  #%#*+%@@@@@@@@@@@@@@@@                 ");
		System.out.println(" *##+=+%@@@@@@@@                         ");
		System.out.println("  #%##%@@                                ");
		
	}
	
	public void printZombie() {
		
		System.out.println("         :-=-:                  ");
		System.out.println("       :=+==--:                 ");
		System.out.println("      :**-+***-                 ");
		System.out.println("      -##=####+.                ");
		System.out.println("      -+=*##*#*++=.             ");
		System.out.println("     .-+++==+#*+*++:            ");
		System.out.println("    :**+=--=+*###*+=:           ");
		System.out.println("   .+###**+++*#*##**+-.         ");
		System.out.println("   .*%###*+*+*##*#####:         ");
		System.out.println("   .*####*###%%%##+*%#*+:       ");
		System.out.println("   =##*#%%%%##%%%##.=*###=.     ");
		System.out.println(" .=*#+.%%%%#%##%%%#:   .+#*=..  ");
		System.out.println(" -***::%%%#%%##%%%-.      -*+=+-");
		System.out.println(".*#+..#%#%%%%%%%%%+        =-.+#");
		System.out.println("*#-  .#=%%%%%%%%##*             ");
		System.out.println("*#+   ::#%#%%%%#**#=            ");
		System.out.println("+*+:   .+%##%%%#####.           ");
		System.out.println("+#-=.   +%######*+##:           ");
		System.out.println("-+.     +%###%##**##=           ");
		System.out.println("        =#####*##**#-           ");
		System.out.println("        .#####+:###*-           ");
		System.out.println("         *####=.+#**.           ");
		System.out.println("        :####=-:####-           ");
		System.out.println("        +%%%%: .####*-:         ");
		System.out.println("       :#%%%*  .###%*=.         ");
		System.out.println("       -%%%*:   *###+ -         ");
		System.out.println("       -%%#-    -###=           ");
		System.out.println("       +%%+     -##%-           ");
		System.out.println("       =##.     .##%=           ");
		System.out.println("       **#.     =###=           ");
		System.out.println("      .**#-    :***+.           ");
		System.out.println("              -**#*.            ");
		
	}
	
	
	
	
	

}
