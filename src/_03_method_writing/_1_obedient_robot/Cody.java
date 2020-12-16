package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Cody {

	public static void main(String[] args) {

		Robot rob = new Robot();
		
		//Cody.drawSquare(rob);
		//Cody.drawTriangle(rob);
		
String shape=JOptionPane.showInputDialog("Pick a shape");
String color  =JOptionPane.showInputDialog("Pick a color");
if(color.equals("red")) {
	rob.setPenColor(Color.red);
}
if(color.equals("yellow")) {
	rob.setPenColor(Color.yellow);
}
	if(color.equals("blue")) {
		rob.setPenColor(Color.blue);
	}
rob.penDown();
rob.setSpeed(20);
if(shape.equals("square")) {
	drawSquare(rob);
	
}
else if(shape.equals("circle"))
	drawCircle(rob);
	  else {
		  
		  drawTriangle(rob);
		  
	  }

	}

	public static void drawSquare(Robot rob)
	{
		for (int i = 0; i < 4; i++) {
			rob.turn(90);
			rob.move(100);
		}
	}
	
	public static void drawTriangle(Robot rob)
	{
		//All Triangles have 180 degrees! hint!
		
		for (int i = 0; i < 3; i++) {
			rob.turn(120);
			rob.move(100);
		}
		//360 / numberofSides
		
			
		
	}
public static void drawCircle(Robot rob ) {
	
	for (int i = 0; i < 360; i++) {
		rob.turn(1);
		rob.move(1);
	}
	
	
}
}