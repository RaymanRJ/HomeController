import java.lang.Thread.sleep

object Main extends App {

  // 0. Config
  // --- Register with WebServer*
  // 1. Instantiate Kafka Consumer.
  // 2. Instantiate Kafka Producer.
  // 3. Instantiate Heartbeat thread.
  // 4. Depending on job:
  // --- Start camera worker
  // --- Start LED Controller
  while(true){
    println("I'm running, running ..")
    sleep(5000)
  }
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")
}