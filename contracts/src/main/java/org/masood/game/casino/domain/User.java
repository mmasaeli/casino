package org.masood.game.casino.domain;

import lombok.Data;
import org.masood.game.casino.domain.enums.UserType;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class User implements Serializable {
    protected String id;
    protected String name;
    protected UserType userType = UserType.PLAYER;
    protected int balance = 0;
    protected Set<Game> games = new HashSet<>();
}
