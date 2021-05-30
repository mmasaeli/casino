package org.masood.game.casino.entity

import org.springframework.data.repository.CrudRepository

trait UserRepository extends CrudRepository[UserEntity, String]
