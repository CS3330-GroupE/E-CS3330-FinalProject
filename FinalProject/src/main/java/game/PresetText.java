package game;

public class PresetText {
	
	public void characterPrompt() {
	    System.out.print("===========================================\n");
	    System.out.print("|             Choose a Character          |\n");
	    System.out.print("===========================================\n");
	    System.out.print("|  Mage                                	  |\n");
	    System.out.print("|  Ranger                                 |\n");
	    System.out.print("|  Warrior                                |\n");
	    System.out.print("===========================================\n");
	}
	

	public void commandPrompt() {
		System.out.print("\n\n\n");
	    System.out.print("===========================================\n");
	    System.out.print("|               Enter a Command           |\n");
	    System.out.print("===========================================\n");
	    System.out.print("|  Begin Battle                           |\n");
	    System.out.print("|  View Inventory                         |\n");
	    System.out.print("|  Visit Bazaar                           |\n");
	    System.out.print("|  Quit                                   |\n");
	    System.out.print("===========================================\n");
	}
	
	public void inventoryCommandPrompt() {
		System.out.print("\n\n\n");
	    System.out.print("===========================================\n");
	    System.out.print("|          Enter Inventory Command        |\n");
	    System.out.print("===========================================\n");
	    System.out.print("|  Check Current Equipment                |\n");
	    System.out.print("|  Check Stats                            |\n");
	    System.out.print("|  Equip Item (Enter Item Index)          |\n");
	    System.out.print("|  Back                                   |\n");
	    System.out.print("===========================================\n");
	}
	
	public void battleCommandPrompt() {
		System.out.print("\n\n\n");
	    System.out.print("===========================================\n");
	    System.out.print("|           Enter Battle Command          |\n");
	    System.out.print("===========================================\n");
	    System.out.print("|  Attack                                 |\n");
	    System.out.print("|  Use Health Potion                      |\n");
	    System.out.print("|  Run                                    |\n");
	    System.out.print("===========================================\n");
	}

	
	public void startGameLogo() {
	    System.out.print("===========================================\n");
	    System.out.print("|                                         |\n");
	    System.out.print("|           Adventures of JEBB            |\n");
	    System.out.print("|                                         |\n");
	    System.out.print("|                   BY:                   |\n");
	    System.out.print("|                                         |\n");
	    System.out.print("|            JONATHAN HATFIELD            |\n");
	    System.out.print("|             ETHAN ALEXANDER             |\n");
	    System.out.print("|               BRIAN BLUHM               |\n");
	    System.out.print("|              BLAKE SIMPSON              |\n");
	    System.out.print("|                                         |\n");
	    System.out.print("===========================================\n");
	    System.out.print("\n\n");
	}
	
	public void shopCommandPrompt() {
		System.out.print("\n\n\n");
	    System.out.print("===========================================\n");
	    System.out.print("|           Welcome to the Bazarr!        |\n");
	    System.out.print("===========================================\n");
	    System.out.print("|  Buy Random Item (50 gold)              |\n");
	    System.out.print("|  Buy Health Potion (15 gold)            |\n");
	    System.out.print("|  Restore Full Health (20 gold)          |\n");
	    System.out.print("|  Back                                   |\n");
	    System.out.print("===========================================\n");
	}
	
	public void printGoblin() {
		
		System.out.print("          **            \n");
		System.out.print("       *%###            \n");
		System.out.print("       ##%%#            \n");
		System.out.print("       #%#              \n");
		System.out.print("      #%+    -  -       \n");
		System.out.print("     %%    #****=-==    \n");
		System.out.print("   *-#=  *+%@%##*++*#   \n");
		System.out.print("   *#@%  +-:-==#%%**    \n");
		System.out.print("  +%%@@#+#*=--=+%@@%*   \n");
		System.out.print(" +*+ #@@##%#*=+=+++++%# \n");
		System.out.print("+*+   +*   %#**+*%%%@%@#\n");
		System.out.print("         #%+%%#%%######*\n");
		System.out.print("        *#%##*=*%%#     \n");
		System.out.print("          @%#+++%%*     \n");
		System.out.print("           ##%#%%%*     \n");
		System.out.print("          %%%@@%%       \n");
		System.out.print("         #%##%%%%*      \n");
		System.out.print("         +#*+=+*        \n");	
	}
	
	public void printDragon() {
		
		System.out.print("                                 *******######**+ \n");
		System.out.print("                            ++******+****###%*    \n");
		System.out.print("  +****                *   **************##%#+    \n");
		System.out.print(" *++***#*#####        ++ *****#####****###%##*    \n");
		System.out.print("**+******####         ***##***********##%%%#*#+*  \n");
		System.out.print(" **###########        **##***********##%#*        \n");
		System.out.print("++*###**######%*       *#**#*****#####%%#         \n");
		System.out.print("  *############        **********####%%%#*        \n");
		System.out.print("    **###***###        *#******#####%#   **       \n");
		System.out.print("       **##***#%*      *##****####%%#*            \n");
		System.out.print("        ++*****###    **##****###%%##             \n");
		System.out.print("      +*******#*#    ****#***###%%##*             \n");
		System.out.print("       +=+****#*#   **##****##%#    *             \n");
		System.out.print("        **++###*# *###****#####                   \n");
		System.out.print("        -=+*##*######***#####*                    \n");
		System.out.print("        =++*#######***#####*                      \n");
		System.out.print("    +*  +++****###***####*                        \n");
		System.out.print("   +++******#*########+                           \n");
		System.out.print("   =+****#**##***######                           \n");
		System.out.print("       ****  ****+**###+                          \n");
		System.out.print("                *#****#***                        \n");
		System.out.print("                *####******                       \n");
		System.out.print("                ***+***#****+      ***+++         \n");
		System.out.print("                   **+++*++**+   +*#*+ +++        \n");
		System.out.print("                    *+  *+++***+*##+              \n");
		System.out.print("                            *****++               \n");
		
	}
	
	public void printOrc() {
		
		System.out.print("             +#                          \n");
		System.out.print("           %@@@#*#                       \n");
		System.out.print("          @@@@@@@%#*                     \n");
		System.out.print("          %%#%##*@@##                    \n");
		System.out.print("          %%##*#@@@##*                   \n");
		System.out.print("        #######*%@%%*                    \n");
		System.out.print("      ***#####*+=#%+=                    \n");
		System.out.print("     *#%%%##**####=+-           ==       \n");
		System.out.print("     *######%%##**-+::        ##%**      \n");
		System.out.print("     *%#####%####*-**=-     %%%####%#    \n");
		System.out.print("     #####+=#%%##++###*+==   %%%%%%%%#   \n");
		System.out.print("      #%#*+=#%%#*+ ###*#####*++%%%%%%#** \n");
		System.out.print("     +#%##+=#%#**      #%#%###*+%@%%%%   \n");
		System.out.print("     ##%%##=-#%##*       ##%%     %%     \n");
		System.out.print("    ##%%#%##*=+**+++  ##%%               \n");
		System.out.print("    *####*%**#*****+-%%@                 \n");
		System.out.print("     ####*-+*###****%+--                 \n");
		System.out.print("     **##*-+#++*%#####*+==               \n");
		System.out.print("     *+*#*=#*+##*+#######+=              \n");
		System.out.print("      **##*#%%***+   #####*              \n");
		System.out.print("      #*##%%        **#%%%#              \n");
		System.out.print("    ######         #*#*#*+*              \n");
		System.out.print("   =****#*           %%%%*               \n");
		System.out.print("   ++**#+            %%#*+               \n");
		System.out.print("  +%%##*=          @#%###+++*            \n");
		System.out.print("  =%%*+#%%%%%%%@@@@@%%%%%%%**            \n");
		System.out.print("  #%#*+%@@@@@@@@@@@@@@@@                 \n");
		System.out.print(" *##+=+%@@@@@@@@                         \n");
		System.out.print("  #%##%@@                                \n");
		
	}
	
	public void printZombie() {
		
		System.out.print("         :-=-:                  \n");
		System.out.print("       :=+==--:                 \n");
		System.out.print("      :**-+***-                 \n");
		System.out.print("      -##=####+.                \n");
		System.out.print("      -+=*##*#*++=.             \n");
		System.out.print("     .-+++==+#*+*++:            \n");
		System.out.print("    :**+=--=+*###*+=:           \n");
		System.out.print("   .+###**+++*#*##**+-.         \n");
		System.out.print("   .*%###*+*+*##*#####:         \n");
		System.out.print("   .*####*###%%%##+*%#*+:       \n");
		System.out.print("   =##*#%%%%##%%%##.=*###=.     \n");
		System.out.print(" .=*#+.%%%%#%##%%%#:   .+#*=..  \n");
		System.out.print(" -***::%%%#%%##%%%-.      -*+=+-\n");
		System.out.print(".*#+..#%#%%%%%%%%%+        =-.+#\n");
		System.out.print("*#-  .#=%%%%%%%%##*             \n");
		System.out.print("*#+   ::#%#%%%%#**#=            \n");
		System.out.print("+*+:   .+%##%%%#####.           \n");
		System.out.print("+#-=.   +%######*+##:           \n");
		System.out.print("-+.     +%###%##**##=           \n");
		System.out.print("        =#####*##**#-           \n");
		System.out.print("        .#####+:###*-           \n");
		System.out.print("         *####=.+#**.           \n");
		System.out.print("        :####=-:####-           \n");
		System.out.print("        +%%%%: .####*-:         \n");
		System.out.print("       :#%%%*  .###%*=.         \n");
		System.out.print("       -%%%*:   *###+ -         \n");
		System.out.print("       -%%#-    -###=           \n");
		System.out.print("       +%%+     -##%-           \n");
		System.out.print("       =##.     .##%=           \n");
		System.out.print("       **#.     =###=           \n");
		System.out.print("      .**#-    :***+.           \n");
		System.out.print("              -**#*.            \n");
		
	}
	
	
	
	
	

}
