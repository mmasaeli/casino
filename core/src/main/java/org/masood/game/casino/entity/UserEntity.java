package org.masood.game.casino.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.masood.game.casino.domain.User;
import org.masood.game.casino.domain.enums.UserType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "user")
public class UserEntity extends User {

    @Id
    String id;

    @Column(nullable = false)
    String name;

    @Column
    UserType userType = UserType.PLAYER;

    @Column
    int balance;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "game_user",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "game_id")}
    )
    Set<GameEntity> gamesEntity = new HashSet<>();

}
