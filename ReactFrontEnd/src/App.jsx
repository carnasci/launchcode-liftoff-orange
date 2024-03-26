import { useState } from 'react'
import './App.css'
import Header from './Components/Header'
import Slideshow from './Components/Slideshow'
import Home from './Components/Home';
import Itinerary from './Components/Itinerary';
import ParkSearch from './Components/ParkSearch';
import Favorites from './Components/Favorites';
import { BrowserRouter, Route, Routes } from 'react-router-dom'


// ### ORIGINAL BEFORE ROUTER ###
// This page is being used as "home" page

function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route index element={<Home/>} />
      <Route element={<ParkSearch />} />
      <Route element={<Favorites />} />
      <Route element={<Itinerary />} />
    </Routes>
  </BrowserRouter>
  )
}

export default App
