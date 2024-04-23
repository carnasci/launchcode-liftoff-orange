package com.nationalParkApp.demo.Repository;

import com.nationalParkApp.demo.Model.Favorites;
import com.nationalParkApp.demo.Model.User;
import com.nationalParkApp.demo.entity.FavoritesEntity;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritesRepository extends JpaRepository<FavoritesEntity, Long> {

    public List<FavoritesEntity> findByParkCode(String parkCode);

    public List<FavoritesEntity> findByUserId(Long id);

    /*@Query(value = """
            select park_code
            from favorites
            left join user_favorites
            on user_favorites.favorites_id=favorites.id
            where user_id =?1
            """)
    public List<FavoritesEntity> findByUserId(Long id);*/

    /*@Query(value = "select id, park_code\n" +
            "from favorites\n" +
            "left join user_favorites\n" +
            "on user_favorites.favorites_id=favorites.id\n" +
            "where user_id =?1")
    public List<FavoritesEntity> findByUserId(Long id);*/


}
