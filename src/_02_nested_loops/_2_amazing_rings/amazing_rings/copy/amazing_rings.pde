int x1 = 200;
int x2 = 800;
int speed = 1;
void setup() {
  size(1000,1000);
}

void draw() {
  background(#F2F565);
  int ringDiameter = 40;
  int width = 400;
  int height = 400;
  
  for( int i = 1; i < 10; ++i ){

    noFill();
  
      
      ellipse(x1, 200, width - (ringDiameter * i), height - (ringDiameter * i));
      ellipse(x2, 200, width - (ringDiameter * i), height - (ringDiameter * i));
    
      
      
      
    
  }
  x1=speed+x1;
  x2=x2-speed;
  if(x2==200||x2==800){
    speed=speed*-1;
  }
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
