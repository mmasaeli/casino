package org.masood.game.casino.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.masood.game.casino.domain.enums.CardKinds;
import org.masood.game.casino.domain.enums.CardNumbers;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Card {
    private final CardKinds kind;
    private final CardNumbers number;
}
