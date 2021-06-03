package org.masood.game.casino.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.masood.game.casino.domain.enums.GameStatus;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class Game implements Serializable {
    protected String id;
    @EqualsAndHashCode.Exclude
    protected Set<User> players = new HashSet<>();
    protected GameStatus status;
}
