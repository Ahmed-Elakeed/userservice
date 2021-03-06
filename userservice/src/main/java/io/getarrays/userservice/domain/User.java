package io.getarrays.userservice.domain;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String name;

    private String username;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();


}
