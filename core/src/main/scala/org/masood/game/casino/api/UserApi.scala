package org.masood.game.casino.api

import org.masood.game.casino.domain.User
import org.masood.game.casino.services.UserService
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(path = Array("/user"))
class UserApi(userService: UserService) {

  @PostMapping
  def createUser(@RequestBody user: User): User = userService.createUser(user)

  @GetMapping(path = Array("/{userId}"))
  def getUser(@PathVariable userId: String): User = userService.getUser(userId)

  @PostMapping(path = Array("/{gameId}/{userId}"))
  def bind(@PathVariable gameId: String, @PathVariable userId: String): User = userService.bindUser(userId, gameId)

}
