package org.masood.game.casino.services

import org.masood.game.casino.domain.User
import org.masood.game.casino.entity.{GameRepository, UserEntity, UserRepository}
import org.springframework.stereotype.Service

import java.util
import scala.collection.JavaConverters.asScalaSetConverter

@Service
class UserService(userRepository: UserRepository, gameRepository: GameRepository) {

  def getUser(id: String): User = {
    val user = userRepository.findById(id).get()
    user.getGames.addAll(user.getGamesEntity)
    user
  }

  def createUser(user: User): User = {
    val u = userRepository.save(new UserEntity(
      user.getId, user.getName, user.getUserType, user.getBalance, new util.HashSet()
    ))
    if (!user.getGames.isEmpty) {
      user.getGames.asScala.foreach(g => bindUser(u.getId, g.getId))
      getUser(u.getId)
    } else u
  }

  def bindUser(id: String, gameId: String): User = {
    val game = gameRepository.findById(gameId).get()
    val player = userRepository.findById(id).get()
    player.getGamesEntity.add(game)
    userRepository.save(player)
    getUser(id)
  }

  def removeUser(id: String, gameId: String): Unit = ???

}
