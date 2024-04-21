import React from "react";
import ItineraryServices from "../Services/ItineraryServices";
import ReviewServices from "../Services/ReviewServices";
import FavoritesServices from "../Services/FavoritesServices";

const User2 = () => {
  let userItineraries = ItineraryServices.getItinerariesByUserId(2);
  let userReviews = ReviewServices.getReviewsByUserId(2);
  let userFavorites = FavoritesServices.getFavoritesByUserId(2);

  const [user2, setuser2] = useState({
    id: 2,
    username: "",
    password: "",
    itiniraries: [],
    reviews: [],
    favorites: [],
  });

  setuser2({
    id: 2,
    username: "",
    password: "",
    itiniraries: userItineraries,
    reviews: userReviews,
    favorites: userFavorites,
  });

  console.log(user2);

  return <div>User2</div>;
};

export default User2;
