import { useState } from "react";
import "./App.css";
import Header from "./Components/Header";
import Slideshow from "./Components/Slideshow";
import Home from "./Components/Home";
import Itinerary from "./Components/Itinerary";
import ParkSearch from "./Components/ParkSearch";
import Favorites from "./Components/Favorites";
import { BrowserRouter, Route, Routes } from "react-router-dom";

// ### ORIGINAL BEFORE ROUTER ###
// This page is being used as "home" page

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route index element={<Home />} />
          <Route path="/" element={<Home />} />
          <Route path="/parkSearch" element={<ParkSearch />} />
          <Route path="/favorites" element={<Favorites />} />
          <Route path="/itineraty" element={<Itinerary />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
