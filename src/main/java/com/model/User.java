package com.model;

import com.model.enums.UserStatus;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String uid;
    @Column(nullable = false, length = 100)
    private String password;
    @Transient
    private UserStatus userStatus;
}
