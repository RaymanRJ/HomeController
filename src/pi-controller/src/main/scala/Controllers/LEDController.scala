package Controllers

import Interfaces.IController
import com.github.mbelling.ws281x.{Color, LedStripType, Ws281xLedStrip}
import Messaging.LEDSequence

trait LEDControllerTraits{
  var ledStrip: Ws281xLedStrip
  var ledSequence: LEDSequence.Value
  var timing: Int
  var color: Color
}

case class LEDController() extends IController with LEDControllerTraits{

  override var ledSequence: LEDSequence.Value = LEDSequence.SOLID_COLOUR
  override var timing: Int = -1
  override var color: Color = Color.GREEN
  override var ledStrip = new Ws281xLedStrip(
    16, 18, 800 * 1000,
    10, 255, 0,
    false, LedStripType.WS2811_STRIP_GRB, true
  )

  override def start(): Unit = {
    println("Starting LEDController")
    ledStrip.setStrip(color)
    ledStrip.render()

    Thread.sleep(5 * 1000)

    println("Finished LEDController")
  }

  override def stop(): Unit = { }
}