package Controllers

import Interfaces.IController
import com.github.mbelling.ws281x.{Color, LedStripType, Ws281xLedStrip}
import Messaging.LEDSequence

trait LEDControllerTraits{
  var ledStrips: List[Ws281xLedStrip]
  var ledSequence: LEDSequence.Value
  var timing: Int
  var color: Color
}

case class LEDController() extends IController with LEDControllerTraits{

  override var ledSequence: LEDSequence.Value = LEDSequence.SOLID_COLOUR
  override var timing: Int = -1
  override var color: Color = Color.BLUE
  override var ledStrips = List(
    new Ws281xLedStrip(
      16, 18, 800 * 1000,
      10, 255, 0,
      false, LedStripType.WS2811_STRIP_GRB, true
    ),
    new Ws281xLedStrip(
      16, 12, 800 * 1000,
      10, 255, 0,
      false, LedStripType.WS2811_STRIP_GRB, true
    )
  )

  override def start(): Unit = {
    println("Starting LEDController")
    ledStrips.foreach(s => {
      s.setStrip(color)
      s.render()
    })

    ledStrips.head.setStrip(Color.WHITE)
    ledStrips.head.render()

    Thread.sleep(5 * 1000)

    println("Finished LEDController")
  }

  override def stop(): Unit = { }
}