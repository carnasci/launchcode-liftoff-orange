import { useState } from 'react'
import './App.css'
import Header from './Components/Header'
import Slideshow from './Components/Slideshow'
import Home from './Components/Home';
import Itinerary from './Components/Itinerary';
import ParkSearch from './Components/ParkSearch';
import Favorites from './Components/Favorites';
import { Route, Routes, BrowserRouter } from "react-router-dom";
import CreateReview from "./Components/CreateReview";

// ### ORIGINAL BEFORE ROUTER ###
// This page is being used as "home" page

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route index element={<Slideshow />} />
          <Route path="/" element={<Home />} />
          <Route path="/createreview" element={<CreateReview />} />
          <Route path="/parksearch" element={<ParkSearch />} />
          <Route path="/favorites" element={<Favorites />} />
          <Route path="/itineraty" element={<Itinerary />} />
        </Routes>
      </BrowserRouter>
    </>
  );
};

export default App
