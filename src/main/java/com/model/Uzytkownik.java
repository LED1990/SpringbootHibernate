package com.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Uzytkownik {
    private Long id;
    private String uid;
    private String password;
    private StatusUzytkownika statusUzytkownika;
}
