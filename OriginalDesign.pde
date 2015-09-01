void setup()
{
  size(800, 800, P3D);
  background(0);
  lights();
  //change framerate at will
  frameRate(10);
}

void draw() {
  //cube deleted sorry cube
  background(0);

  awesomeSphere();
}

void awesomeSphere()
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