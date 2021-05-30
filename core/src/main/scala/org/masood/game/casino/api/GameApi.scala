package org.masood.game.casino.api

import org.masood.game.casino.domain.{Card, Game}
import org.masood.game.casino.services.{CardService, GameService}
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(path = Array("/game"))
class GameApi(cardService: CardService, gameService: GameService) {

  @GetMapping(path = Array("/new-deck"))
  def deck: Array[Card] = cardService.shuffle()

  @PostMapping
  def newGame: Game = gameService.createGame()

  @GetMapping(path = Array("/{gameId}"))
  def getGame(@PathVariable gameId: String): Game = gameService.getGame(gameId)

}
