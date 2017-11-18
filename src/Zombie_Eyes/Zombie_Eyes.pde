PImage face;
void setup(){
 face = loadImage("zombieface.jpg");
image(face, 0, 0);
size(400,350);
//face.resize(200,200);

}
void draw (){
 image(face, 0, 0);
  if(mousePressed) {
   println(mouseX+"  "+mouseY);
   
 }
if(mouseX<139){
    mouseX=139;
}
if(mouseX>155){
    mouseX=155;
}
if(mouseY<108){
    mouseY=108;
}
if(mouseY>121){
    mouseY=121;
}
 fill(#D8C7C8);
  ellipse(148,114,31,31);
  ellipse(285,117,31,31);
  fill(#E01724);
  ellipse(mouseX,mouseY,10,10);
  ellipse(mouseX+137,mouseY+3,10,10);
  
}