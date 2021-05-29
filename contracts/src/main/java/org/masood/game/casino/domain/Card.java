package org.masood.game.casino.domain;

import org.masood.game.casino.domain.enums.CardKinds;
import org.masood.game.casino.domain.enums.CardNumbers;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Card {
    private final CardKinds kind;
    private final CardNumbers number;
}
