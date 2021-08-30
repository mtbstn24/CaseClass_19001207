//19001207

import scala.Math._
CaseClass extends App{
  p1 = Point(5,1)
  p2 = Point(3,2)
  println("The 2 points are: ")
  println(p1)
  println(p2)
  println("Addition of p1 and p2: " + p1+p2 )
  

}

case class Point(x:Int, y:Int){
  def +(that:Point) = Point(this.x+that.x, this.y+that.y)
  def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)
  def distance(that:Point): Double = (sqrt(((this.x - that.x)*(this.x - that.x)) + ((this.y - that.y)*(this.y - that.y))))
  def invert() = Point(this.y,this.x)
}
