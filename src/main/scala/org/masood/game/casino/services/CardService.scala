package org.masood.game.casino.services

import org.masood.game.casino.domain.{Card, CardKinds, CardNumbers}
import org.springframework.stereotype.Service

import scala.util.Random

@Service
class CardService() {
  def shuffle(seed: Option[Int] = null): Array[Card] = {
    val rand = seed match {
      case Some(s) => new Random(s)
      case _ => new Random
    }
    set().sortWith { (_, _) =>
      rand.nextBoolean()
    }
  }

  private def set(): Array[Card] = {
    CardKinds.values().flatMap { kind =>
      CardNumbers.values().map {
        (kind, _)
      }
    }.map { cardInfo =>
      Card(cardInfo._1, cardInfo._2)
    }
  }

}
