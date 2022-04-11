
object MyClass {
   

def main(args: Array[String]) {
var num1 = scala.io.StdIn.readInt()
var num2 = scala.io.StdIn.readInt()

var arr = new Array[Int](20)

for(i <- 0 to arr.length-1)
{
  if(i%2==0)
  {
    arr(i) = num1*i
  }
  else
  {
    arr(i) = num2*i
  }
}

for(i <- 0 to arr.length-1)
{
  print(arr(i)+" ")
}
    }
}
