package org.masood.game.casino.api

import org.masood.game.casino.domain.Card
import org.masood.game.casino.services.CardService
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/card"))
class CardApi(cardService: CardService) {

  @GetMapping(path = Array("/deck"))
  def deck(): Array[Card] = cardService.shuffle()

}
