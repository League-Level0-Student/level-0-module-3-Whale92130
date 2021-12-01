   
void setup() {
 
  // set the size of your sketch
  size (800, 800);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int a = 700;
  for (int qwerty = 0; qwerty < 10; qwerty++) {
    if (qwerty%2 == 0) {
    fill(#00FFF0);
    }
    else {
     fill(#E9FF00); 
    }
  ellipse (400, 400, a, a);
  a = a - 75;
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
