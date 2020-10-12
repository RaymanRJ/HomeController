package Controllers

import Interfaces.IResponsibility
import com.github.mbelling.ws281x.{Color, LedStripType, Ws281xLedStrip}

case class LEDController() extends IResponsibility {

  override def start(): Unit = {
    println("Starting LEDController")

    val ledStrip = new Ws281xLedStrip(
        16, 18, 800*1000, 10, 255, 0, false, LedStripType.WS2811_STRIP_GRB, true
    )

    ledStrip.setPixel(0, Color.RED)
    ledStrip.setPixel(1, Color.GREEN)
    ledStrip.setPixel(2, Color.BLUE)
    ledStrip.render()


    Thread.sleep(5 * 1000)

    println("Finished LEDController")
  }
}
