package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Cody {

	public static void main(String[] args) {

		Robot rob = new Robot();
		
		Cody.drawSquare(rob);
		Cody.drawTriangle(rob);
		

	}
	
	public static void drawSquare(Robot rob)
	{
		rob.penDown();
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
	}
	
	public static void drawTriangle(Robot rob)
	{
		//All Triangles have 180 degrees! hint!
		rob.move(150);
		rob.turn(90);
		rob.turn(90);
		rob.move(150);
		rob.turn(90);
		rob.move(50);
		
	}

}