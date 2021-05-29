package org.masood.game.casino.domain;


import lombok.Getter;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Getter
public class Hand implements Serializable {
    protected Set<Card> cards = new HashSet<>();

    public boolean put(Card card) {
        return cards.add(card);
    }

    public boolean put(Collection<Card> cs) {
        return cards.addAll(cs);
    }

    boolean pop(Card card) {
        return cards.remove(card);
    }

    public Integer value() {
        return cards.stream().mapToInt(Card::value).sum();
    }
}
