package org.masood.game.casino.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.masood.game.casino.domain.enums.CardKinds;
import org.masood.game.casino.domain.enums.CardNumbers;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Card implements Serializable {
    private CardKinds kind;
    private CardNumbers number;

    public Integer value() {
        return value(new HashMap<CardNumbers, Integer>());
    }

    public Integer value(@NotNull Map<CardNumbers, Integer> values) {
        if (values.containsKey(number)) return values.get(number);
        switch (number) {
            case ACE:
                return 1;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
                return 10;
            case JACK:
                return 11;
            case QUEEN:
                return 12;
            case KING:
                return 13;
            default:
                return 0;
        }
    }
}
