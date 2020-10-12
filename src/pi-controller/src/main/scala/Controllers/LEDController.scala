package Controllers

import Interfaces.IResponsibility
import com.github.mbelling.ws281x.{Color, LedStripType, Ws281xLedStrip}

case class LEDController() extends IResponsibility {

  println("CONSTRUCTOR")

  override def start(): Unit = {
    println("STARTING")

    val ledStrip = new Ws281xLedStrip(
        16, 18, 800*1000, 10, 255, 0, false, LedStripType.WS2811_STRIP_RGB, false
    )

    ledStrip.setPixel(0, Color.RED)
    ledStrip.render()

    //    WS2812.get().init(16); //init a chain of 64 LEDs
//    WS2812.get().clear();
//    WS2812.get().setPixelColor(0, Color.RED); //sets the color of the fist LED to red
//    WS2812.get().show();
  }
}
