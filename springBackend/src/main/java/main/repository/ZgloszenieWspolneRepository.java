package main.repository;

import main.Model.ZgloszenieWspolne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository - informacja dla spring że dany interfejs będzie odpowiadał za dostep do danych, dodatkowo wystawia interfejs jako bean do wstrzyknięcia
 * dziedziczony interfejs: pochodzi od spring DATA, implementuje podstawowe operacje na bazie i pozwala implementowac własne.
 * Pod maską używa EntityManagera do zarządzania połaczeniem z baza danych
 *
 * korzystając z @repository spring automatycznie tworzy beana w miejscu wstrzyknięcia interfejsu i implementuje jego metody.
 *
 * to jest DAO!!
 */

@Repository
public interface ZgloszenieWspolneRepository extends JpaRepository<ZgloszenieWspolne, Long> {
}
