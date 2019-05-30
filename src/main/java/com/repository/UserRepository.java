package com.repository;

import com.model.User;
import org.springframework.stereotype.Repository;

/**
 * @Repository - informacja dla spring że dany interfejs będzie odpowiadał za dostep do danych, dodatkowo wystawia interfejs jako bean do wstrzyknięcia
 * korzystając z @repository spring automatycznie tworzy beana w miejscu wstrzyknięcia interfejsu i implementuje jego metody (tylko te ze spring data).
 * to jest DAO!!
 */
@Repository
public interface UserRepository extends BaseRepository<User, Long> {
}
