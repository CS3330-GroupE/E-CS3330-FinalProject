package game;

public class PresetText {
	
	protected void characterPrompt() {
	    System.out.println("===========================================");
	    System.out.println("|             Choose a Character          |");
	    System.out.println("===========================================");
	    System.out.println("|  Mage                                	  |");
	    System.out.println("|  Ranger                                 |");
	    System.out.println("|  Warrior                                |");
	    System.out.println("===========================================");
	}

	protected void commandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|               Enter a Command           |");
	    System.out.println("===========================================");
	    System.out.println("|  Begin Battle                           |");
	    System.out.println("|  View Inventory                         |");
	    System.out.println("|  Visit Bazaar                           |");
	    System.out.println("|  Quit                                   |");
	    System.out.println("===========================================");
	}
	
	protected void inventoryCommandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|          Enter Inventory Command        |");
	    System.out.println("===========================================");
	    System.out.println("|  Check Current Equipment                |");
	    System.out.println("|  Check Stats                            |");
	    System.out.println("|  Equip Item (Enter Item Index)          |");
	    System.out.println("|  Back                                   |");
	    System.out.println("===========================================");
	}
	
	protected void battleCommandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|           Enter Battle Command          |");
	    System.out.println("===========================================");
	    System.out.println("|  Attack                                 |");
	    System.out.println("|  Use Health Potion                      |");
	    System.out.println("|  Run                                    |");
	    System.out.println("===========================================");
	}

	
	protected void startGameLogo() {
	    System.out.println("===========================================");
	    System.out.println("|                                         |");
	    System.out.println("|               GAME TITLE                |");
	    System.out.println("|                                         |");
	    System.out.println("|                   BY:                   |");
	    System.out.println("|                                         |");
	    System.out.println("|            JONATHAN HATFIELD            |");
	    System.out.println("|             ETHAN ALEXANDER             |");
	    System.out.println("|               BRIAN BLUHM               |");
	    System.out.println("|              BLAKE SIMPSON              |");
	    System.out.println("|                                         |");
	    System.out.println("===========================================");
	    System.out.println("\n\n");
	}
	
	protected void shopCommandPrompt() {
		System.out.println("\n\n\n");
	    System.out.println("===========================================");
	    System.out.println("|           Welcome to the Bazarr!        |");
	    System.out.println("===========================================");
	    System.out.println("|  Buy Random Item (50 gold)              |");
	    System.out.println("|  Buy Health Potion (15 gold)            |");
	    System.out.println("|  Restore Full Health (20 gold)          |");
	    System.out.println("|  Back                                   |");
	    System.out.println("===========================================");
	}
	
	protected void printGoblin() {
		
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
	
	protected void printDragon() {
		
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
	
	protected void printOrc() {
		
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
	
	protected void printZombie() {
		
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
