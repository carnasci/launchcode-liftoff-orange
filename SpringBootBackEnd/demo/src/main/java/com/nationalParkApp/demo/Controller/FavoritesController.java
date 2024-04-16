package com.nationalParkApp.demo.Controller;

import com.nationalParkApp.demo.Model.Favorites;
import com.nationalParkApp.demo.service.FavoritesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class FavoritesController {

    private FavoritesService favoritesService;

    public FavoritesController(FavoritesService favoritesService) { this.favoritesService =favoritesService; }

    @GetMapping("/favorites")
    public boolean getFavoritesById(@RequestBody Long id) {
        if (favoritesService.getFavoritesById(id)) {
            return true;
        } else {
            return false;
        }
    }

    @PostMapping("/favorites")
    public Favorites addToFavorites(@RequestBody Favorites favorites) {
        return favoritesService.addToFavorites(favorites);
    }

    @GetMapping("/listFavorites")
    public List<Favorites> getAllFavorites() {
        return favoritesService.getAllFavorites();
    }

    @DeleteMapping("/deleteFavorites")
    public ResponseEntity<Object> deleteFavorite(@RequestBody Long id) {
        boolean deleted = false;
        deleted = favoritesService.deleteFromFavorites(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }
}
