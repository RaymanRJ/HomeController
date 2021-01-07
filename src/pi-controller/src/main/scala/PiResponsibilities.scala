import Exceptions.UnknownResponsibilityException

object PiResponsibilities extends Enumeration {
  val LED_CONTROLLER, CAMERA_CONTROLLER, MONITOR_CONTROLLER = Value

  def get(arg: String): PiResponsibilities.Value = {
    arg match {
      case "LED_CONTROLLER" => LED_CONTROLLER
      case "CAMERA_CONTROLLER" => CAMERA_CONTROLLER
      case "MONITOR_CONTROLLER" => MONITOR_CONTROLLER
      case _ => throw UnknownResponsibilityException(s"Unknown responsibility: ${arg}")
    }
  }
}
