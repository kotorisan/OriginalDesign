import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
  size(800, 800, P3D);
  background(0);
  lights();
  //change framerate at will
  frameRate(10);
}

public void draw() {
  //cube deleted sorry cube
  background(0);

  awesomeSphere();
}

public void awesomeSphere()
{
  pushMatrix();
  translate(400, 400, 0);
  rotateY((int)(Math.random()*360)+1);
  rotateX((int)(Math.random()*360)+1);
  rotateZ((int)(Math.random()*360)+1);

  noFill();
  stroke(100, 20, 30);
  sphere(280);
  popMatrix();
}
// fuck you - brandon fong 2015
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
