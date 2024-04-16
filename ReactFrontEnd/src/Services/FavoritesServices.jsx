import axios from "axios";

const ITINERARY_API_BASE_URL = "http://localhost:8080/api/v1/itinerary";

class FavoritesService {

    AddToFavorites(favorites) {
        return axios.post(ITINERARY_API_BASE_URL, favorites);
    }
}

export default new FavoritesService();