package Messaging

import java.awt.Color
import java.time.LocalDateTime

trait IMessage {
  var messageType: MessageType.Value
  var timeSent: LocalDateTime
}

trait LEDMessage extends IMessage{
  var sequence: LEDSequence.Value
  var timing: Option[Int]
  var color: Option[Either[Color, (Int, Int, Int)]]
}
