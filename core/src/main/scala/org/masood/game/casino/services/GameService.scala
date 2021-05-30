package org.masood.game.casino.services

import org.masood.game.casino.domain.Game
import org.masood.game.casino.domain.enums.GameStatus
import org.masood.game.casino.entity.{GameEntity, GameRepository}
import org.springframework.stereotype.Service

import java.util
import java.util.UUID
import scala.collection.JavaConverters.asScalaSetConverter

@Service
class GameService(gameRepository: GameRepository, userService: UserService) {

  def getGame(id: String): Game = {
    val game = gameRepository.findById(id).get()
    game.getPlayers.addAll(game.getPlayersEntity)
    game
  }

  def createGame(id: String = UUID.randomUUID().toString): Game =
    gameRepository.save(new GameEntity(id, null, GameStatus.NEW))

  def updateGame(game: Game): Game = {
    gameRepository.save(new GameEntity(
      game.getId,
      new util.HashSet(),
      game.getStatus
    ))
    game.getPlayers.asScala.foreach(u => userService.bindUser(u.getId, game.getId))
    getGame(game.getId)
  }

}
