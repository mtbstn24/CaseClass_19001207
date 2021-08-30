//19001207

import scala.math._
object CaseClass extends App{
  val p1 = Point(5,1)
  val p2 = Point(3,2)
  println("\n p1 : " + p1 + "\n p2 : " + p2)
  println("\nAddition of p1 and p2 : " + (p1+p2) )
  println("\nMove point p1 by (2,1) : " + p1.move(2,1) )
  println("\nDistance of p1 & p2 : " + p1.distance(p2) )
  println("\nInvert of p2 : " + p2.invert + "\n" )

}

case class Point(x:Int, y:Int){
  def +(that:Point) = Point(this.x+that.x, this.y+that.y)
  def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)
  def distance(that:Point): Double = (sqrt((this.x - that.x)*(this.x - that.x) + (this.y - that.y)*(this.y - that.y)))
  def invert() = Point(this.y,this.x)
}
