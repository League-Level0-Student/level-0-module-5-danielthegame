package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int happinessLevel =0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet =JOptionPane.showInputDialog("what kinda pet of pet do you want to buy");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while (happinessLevel<10) {
			
	
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to make your pet happy", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "playtime", "groom" }, null);
if(task==0) {
	food();
}
if(task==1) {
	playtime();
}
if(task==2) {
	groom();
}
		}
			// 5. Use user input to call the appropriate method created in step 4.

if(happinessLevel>=10) {
	JOptionPane.showInputDialog("You can take a break");
	
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	
	static void food() {
		JOptionPane.showMessageDialog(null,"I gave you're dog food");
		happinessLevel+=5;
	}
static void playtime() {
	JOptionPane.showMessageDialog(null,"I took you're dog out to play");
	happinessLevel+=5;
}
static void groom () {
	JOptionPane.showMessageDialog(null,"I cleaned you're dog");
	happinessLevel+=3;
}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	
}