package org.masood.game.casino.services

import org.junit.runner.RunWith
import org.masood.game.casino.domain.Card
import org.masood.game.casino.domain.enums.{CardKinds, CardNumbers}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers.have
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CardServiceTest extends AnyFunSuite {

  val cardService = new CardService

  test("should be able to shuffle") {
    val deck = cardService.shuffle(Some(0))
    deck should have size 52
    deck.head shouldBe new Card(CardKinds.SPADE, CardNumbers.THREE)
    deck(1) shouldBe new Card(CardKinds.HEART, CardNumbers.SEVEN)
  }

}
