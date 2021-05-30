package org.masood.game.casino.domain;

import lombok.Data;
import org.masood.game.casino.domain.enums.GameStatus;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class Game implements Serializable {
    protected String id;
    protected Set<User> players = new HashSet<>();
    protected GameStatus status;
}
