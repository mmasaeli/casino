package org.masood.game.casino.domain

case class Card(
               kind: CardKinds,
               number: CardNumbers
               ) extends Serializable {
  def value(valueMap: Map[CardNumbers, Byte]): Option[Byte] = valueMap.get(number)
}
