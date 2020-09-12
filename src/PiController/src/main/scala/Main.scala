import java.lang.Thread.sleep

object Main extends App {

  while(true){
    println("I'm running, running ..")
    sleep(5000)
  }
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")
}