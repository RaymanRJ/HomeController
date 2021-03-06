import java.lang.Thread.sleep

import Controllers.{CameraController, LEDController, MonitorController}
import Interfaces.IController

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
  val controller: IController = responsibility match {
    case PiResponsibilities.LED_CONTROLLER => LEDController()
    case PiResponsibilities.MONITOR_CONTROLLER => MonitorController()
    case PiResponsibilities.CAMERA_CONTROLLER => CameraController()
    case _ => throw new NotImplementedError(s"The passed responsibility ($responsibility) does not exist.")
  }

  println(s"Starting controller: $controller.")
  val thread = new Thread{
    controller.start()
  }

  thread.setDaemon(true)
  thread.start()
  println("Finished Main")
}