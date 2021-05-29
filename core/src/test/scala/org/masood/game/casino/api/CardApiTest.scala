package org.masood.game.casino.api

import org.junit.Test
import org.junit.runner.RunWith
import org.masood.game.casino.services.CardService
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@RunWith(classOf[SpringRunner])
@WebMvcTest(Array(classOf[CardApi], classOf[CardService]))
class CardApiTest {

  import org.springframework.beans.factory.annotation.Autowired

  @Autowired private var mvc: MockMvc = null

  @Test
  def cardsDeck() {
    mvc.perform(
      get("/card/deck")
    )
      .andExpect(MockMvcResultMatchers.status().isOk)
      .andExpect(MockMvcResultMatchers.jsonPath("$").isArray)
  }

}
