package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import game.PresetText;

public class PresetTextTest {

	@Test
	public void characterPromptTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.characterPrompt();
		
	   String expectedOutput  = "===========================================\r\n|             Choose a Character          |\r\n===========================================\r\n|  Mage                                	  |\r\n|  Ranger                                 |\r\n|  Warrior                                |\r\n===========================================\r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void commandPromptTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.commandPrompt();
		
	   String expectedOutput  = "\n\n\n\r\n===========================================\r\n|               Enter a Command           |\r\n===========================================\r\n|  Begin Battle                           |\r\n|  View Inventory                         |\r\n|  Visit Bazaar                           |\r\n|  Quit                                   |\r\n===========================================\r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void inventoryCommandPromptTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.inventoryCommandPrompt();
		
	   String expectedOutput  = "\n\n\n\r\n===========================================\r\n|          Enter Inventory Command        |\r\n===========================================\r\n|  Check Current Equipment                |\r\n|  Check Stats                            |\r\n|  Equip Item (Enter Item Index)          |\r\n|  Back                                   |\r\n===========================================\r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void battleCommandPromptTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.battleCommandPrompt();
		
	   String expectedOutput  = "\n\n\n\r\n===========================================\r\n|           Enter Battle Command          |\r\n===========================================\r\n|  Attack                                 |\r\n|  Use Health Potion                      |\r\n|  Run                                    |\r\n===========================================\r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void startGameLogoTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.startGameLogo();
		
	   String expectedOutput  = "===========================================\r\n|                                         |\r\n|           Adventures of JEBB            |\r\n|                                         |\r\n|                   BY:                   |\r\n|                                         |\r\n|            JONATHAN HATFIELD            |\r\n|             ETHAN ALEXANDER             |\r\n|               BRIAN BLUHM               |\r\n|              BLAKE SIMPSON              |\r\n|                                         |\r\n===========================================\r\n\n\n\r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void shopCommandPromptTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.shopCommandPrompt();
		
	   String expectedOutput  = "\n\n\n\r\n===========================================\r\n|           Welcome to the Bazarr!        |\r\n===========================================\r\n|  Buy Random Item (50 gold)              |\r\n|  Buy Health Potion (15 gold)            |\r\n|  Restore Full Health (20 gold)          |\r\n|  Back                                   |\r\n===========================================\r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void printGoblinTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.printGoblin();
		
	   String expectedOutput  = "          **            \r\n       *%###            \r\n       ##%%#            \r\n       #%#              \r\n      #%+    -  -       \r\n     %%    #****=-==    \r\n   *-#=  *+%@%##*++*#   \r\n   *#@%  +-:-==#%%**    \r\n  +%%@@#+#*=--=+%@@%*   \r\n +*+ #@@##%#*=+=+++++%# \r\n+*+   +*   %#**+*%%%@%@#\r\n         #%+%%#%%######*\r\n        *#%##*=*%%#     \r\n          @%#+++%%*     \r\n           ##%#%%%*     \r\n          %%%@@%%       \r\n         #%##%%%%*      \r\n         +#*+=+*        \r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void printDragonTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.printDragon();
		
	   String expectedOutput  = "                                 *******######**+ \r\n                            ++******+****###%*    \r\n  +****                *   **************##%#+    \r\n *++***#*#####        ++ *****#####****###%##*    \r\n**+******####         ***##***********##%%%#*#+*  \r\n **###########        **##***********##%#*        \r\n++*###**######%*       *#**#*****#####%%#         \r\n  *############        **********####%%%#*        \r\n    **###***###        *#******#####%#   **       \r\n       **##***#%*      *##****####%%#*            \r\n        ++*****###    **##****###%%##             \r\n      +*******#*#    ****#***###%%##*             \r\n       +=+****#*#   **##****##%#    *             \r\n        **++###*# *###****#####                   \r\n        -=+*##*######***#####*                    \r\n        =++*#######***#####*                      \r\n    +*  +++****###***####*                        \r\n   +++******#*########+                           \r\n   =+****#**##***######                           \r\n       ****  ****+**###+                          \r\n                *#****#***                        \r\n                *####******                       \r\n                ***+***#****+      ***+++         \r\n                   **+++*++**+   +*#*+ +++        \r\n                    *+  *+++***+*##+              \r\n                            *****++               \r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void printOrcTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.printOrc();
		
	   String expectedOutput  = "             +#                          \r\n           %@@@#*#                       \r\n          @@@@@@@%#*                     \r\n          %%#%##*@@##                    \r\n          %%##*#@@@##*                   \r\n        #######*%@%%*                    \r\n      ***#####*+=#%+=                    \r\n     *#%%%##**####=+-           ==       \r\n     *######%%##**-+::        ##%**      \r\n     *%#####%####*-**=-     %%%####%#    \r\n     #####+=#%%##++###*+==   %%%%%%%%#   \r\n      #%#*+=#%%#*+ ###*#####*++%%%%%%#** \r\n     +#%##+=#%#**      #%#%###*+%@%%%%   \r\n     ##%%##=-#%##*       ##%%     %%     \r\n    ##%%#%##*=+**+++  ##%%               \r\n    *####*%**#*****+-%%@                 \r\n     ####*-+*###****%+--                 \r\n     **##*-+#++*%#####*+==               \r\n     *+*#*=#*+##*+#######+=              \r\n      **##*#%%***+   #####*              \r\n      #*##%%        **#%%%#              \r\n    ######         #*#*#*+*              \r\n   =****#*           %%%%*               \r\n   ++**#+            %%#*+               \r\n  +%%##*=          @#%###+++*            \r\n  =%%*+#%%%%%%%@@@@@%%%%%%%**            \r\n  #%#*+%@@@@@@@@@@@@@@@@                 \r\n *##+=+%@@@@@@@@                         \r\n  #%##%@@                                \r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void printZombieTest() throws Exception {
		PresetText p = new PresetText();
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		
	    p.printZombie();
		
	   String expectedOutput  = "         :-=-:                  \r\n       :=+==--:                 \r\n      :**-+***-                 \r\n      -##=####+.                \r\n      -+=*##*#*++=.             \r\n     .-+++==+#*+*++:            \r\n    :**+=--=+*###*+=:           \r\n   .+###**+++*#*##**+-.         \r\n   .*%###*+*+*##*#####:         \r\n   .*####*###%%%##+*%#*+:       \r\n   =##*#%%%%##%%%##.=*###=.     \r\n .=*#+.%%%%#%##%%%#:   .+#*=..  \r\n -***::%%%#%%##%%%-.      -*+=+-\r\n.*#+..#%#%%%%%%%%%+        =-.+#\r\n*#-  .#=%%%%%%%%##*             \r\n*#+   ::#%#%%%%#**#=            \r\n+*+:   .+%##%%%#####.           \r\n+#-=.   +%######*+##:           \r\n-+.     +%###%##**##=           \r\n        =#####*##**#-           \r\n        .#####+:###*-           \r\n         *####=.+#**.           \r\n        :####=-:####-           \r\n        +%%%%: .####*-:         \r\n       :#%%%*  .###%*=.         \r\n       -%%%*:   *###+ -         \r\n       -%%#-    -###=           \r\n       +%%+     -##%-           \r\n       =##.     .##%=           \r\n       **#.     =###=           \r\n      .**#-    :***+.           \r\n              -**#*.            \r\n";
	   // Do the actual assertion.
	   assertEquals(expectedOutput, outContent.toString());
	}
	
}
