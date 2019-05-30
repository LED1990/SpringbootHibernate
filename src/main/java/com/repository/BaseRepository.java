package com.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * BaseRepository - to interfejs który będzie definiował metody wspólne dla wszystkich konkretnych repozytoriów
 *
 * @NoRepositoryBean - jest po to żeby spring nie starał się tworzyć obiektu na podstawie tego interfejsu
 * Reposity - jeden z interfejsów spring data (pozwala ręcznie dodawać metody spring data zamiast automatycznego dodwania wszystkich)
 * inne interfejsy automatycznie np. udostępniają wszystkie metody CRUD (interfejs CrudRepository )
 */

@NoRepositoryBean
interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
    T save(T persisted);
}
