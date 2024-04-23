import { React, useState, useEffect } from "react";
import { Link } from "react-router-dom";
import Slideshow from "./Slideshow";
import Header from "./Header";
import Footer from "./Footer";
import { useQuery, useQueryClient } from "@tanstack/react-query";
import axios from "axios";
import FavoritesServices from "../Services/FavoritesServices";

function Home() {
  //const [parkCodes, setParkCodes] = useState();

  // useEffect(() => {
  //   const getParkCodes = async () => {
  //     const mappedParkCodes = [];

  //     try {
  //       const response = await FavoritesServices.getFavoritesByUserId(2);
  //       //console.log(response.data.parkCode);
  //       console.log(response.data);

  //       response.data.map((data) => {
  //         mappedParkCodes.push(data.parkCode);
  //       });

  //       console.log(mappedParkCodes);
  //     } catch {
  //       console.log(error);
  //     }
  //     setParkCodes(mappedParkCodes);
  //   };

  //   getParkCodes();

  //   //console.log(mappedParkCodes);
  //   console.log(parkCodes);
  // }, []);

  return (
    <>
      <div className="bg-nps-green-300 h-lvh">
        <Header />
        <Slideshow />
        <div className="flex flex-col border border-nps-green-999 rounded-xl my-10 mx-auto p-6 lg:w-1/2">
          <div className="text-center">"Welcome to Park Trippin'!</div>
          <div>
            {" "}
            Here, you'll effortlessly discover the natural wonders and serene
            beauty of our country's most cherished landscapes. Whether you seek
            rugged trails, tranquil lakes, or breathtaking vistas, embark on
            your next adventure with us. Start exploring, and let the journey to
            our nation's heart begin!
          </div>
        </div>
      </div>
    </>
  );
}

export default Home;
