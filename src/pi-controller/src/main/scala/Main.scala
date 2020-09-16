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

  /*
      Args:
      0 - PiResponsibility
      1 - WebServer IPAddress
      2 - WebServer Port
      3 - Auth (future problem)
      4 - This is too much. Should use a config file deployed alongside.
   */
  val responsibility = PiResponsibilities.get(args(0))
  val serverAddress = args(1)
  val portNumber = args(2)

  while(true){
    println("I'm running, running ..")
    if(responsibility == PiResponsibilities.LED_CONTROLLER)
      println("LIGHTS ON LIGHTS OFF")
    sleep(5000)
  }
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")
}