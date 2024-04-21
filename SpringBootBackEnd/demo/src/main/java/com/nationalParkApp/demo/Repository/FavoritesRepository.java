package com.nationalParkApp.demo.Repository;

import com.nationalParkApp.demo.entity.FavoritesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritesRepository extends JpaRepository<FavoritesEntity, Long> {

    public List<FavoritesEntity> findByParkCode(String parkCode);

    public List<FavoritesEntity> findByUserId(Long id);
}
