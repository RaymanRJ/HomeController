package Controllers

import java.awt.Color

import com.pi4j.io.gpio.{GpioController, GpioFactory, GpioPinDigitalInput, PinPullResistance, RaspiPin}
import Interfaces.IResponsibility
import de.pi3g.pi.ws2812.WS2812

case class LEDController() extends IResponsibility {

  val gpio: GpioController = GpioFactory.getInstance
  val dataController: GpioPinDigitalInput = gpio.provisionDigitalInputPin(RaspiPin.GPIO_01)
  import com.pi4j.wiringpi.Gpio

  import com.pi4j.wiringpi.SoftPwm

  WS2812.get().init(16); //init a chain of 64 LEDs
  WS2812.get().clear();
  WS2812.get().setPixelColor(0, Color.RED); //sets the color of the fist LED to red

  override def start(): Unit = {
    WS2812.get().show();
  }
}
