package org.masood.game.casino.api

import org.springframework.web.bind.annotation.{DeleteMapping, PostMapping, RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/bank"))
class BankApi {

  @PostMapping(path = Array("/bank"))
  def registerBank() {}

  @PostMapping(path = Array("/gambler"))
  def registerGambler() {}

  @DeleteMapping(path = Array("/bank"))
  def deregisterBank() {}

  @DeleteMapping(path = Array("/gambler"))
  def deregisterGambler() {}

}
