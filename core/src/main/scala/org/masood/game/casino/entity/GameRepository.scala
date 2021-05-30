package org.masood.game.casino.entity

import org.springframework.data.repository.CrudRepository

trait GameRepository extends CrudRepository[GameEntity, String]
