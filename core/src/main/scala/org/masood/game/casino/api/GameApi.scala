package org.masood.game.casino.api

import org.masood.game.casino.domain.Game
import org.masood.game.casino.services.GameService
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(path = Array("/game"))
class GameApi(gameService: GameService) {

  @PostMapping
  def newGame: Game = gameService.createGame()

  @PutMapping
  def updateGame(@RequestBody game: Game): Unit = gameService.updateGame(game)

  @GetMapping(path = Array("/{gameId}"))
  def getGame(@PathVariable gameId: String): Game = gameService.getGame(gameId)

}
