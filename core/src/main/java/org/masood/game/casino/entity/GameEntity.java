package org.masood.game.casino.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.masood.game.casino.domain.Game;
import org.masood.game.casino.domain.enums.GameStatus;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "game")
public class GameEntity extends Game {
    @Id
    String id;

    @JsonIgnore
    @ManyToMany(mappedBy = "gamesEntity", fetch = FetchType.LAZY)
    Set<UserEntity> playersEntity = new HashSet<>();

    @Column
    GameStatus status;

}
