package com.nationalParkApp.demo.service;

import com.nationalParkApp.demo.Model.Favorites;
import org.springframework.stereotype.Service;

@Service
public interface FavoritesService {

    Favorites addToFavorites(Favorites favorites);
}
