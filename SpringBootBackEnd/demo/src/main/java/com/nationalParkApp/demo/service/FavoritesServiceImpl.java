package com.nationalParkApp.demo.service;

import com.nationalParkApp.demo.Model.Favorites;
import com.nationalParkApp.demo.Repository.FavoritesRepository;
import com.nationalParkApp.demo.entity.FavoritesEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class FavoritesServiceImpl implements FavoritesService {

    private FavoritesRepository favoritesRepository;

    public FavoritesServiceImpl(FavoritesRepository favoritesRepository) { this.favoritesRepository = favoritesRepository; }

    @Override
    public Favorites addToFavorites(@RequestBody Favorites favorites) {
        FavoritesEntity favoritesEntity = new FavoritesEntity();

        BeanUtils.copyProperties(favorites, favoritesEntity);
        favoritesRepository.save(favoritesEntity);
        return favorites;
    }
}
