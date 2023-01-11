import React, {useState} from "react";
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import HomePage from "../components/HomePage";
import Products from "../components/Products";
import Basket from "../components/Basket";
import NavBar from "../components/NavBar";

const Chaiovna = () => {

    const [basketItems, setBasketItems] = useState([])
    const [userName, setUserName] = useState("")

    const teaProducts = [
        {name: "Earl Grey", cost: 5, image:"https://upload.wikimedia.org/wikipedia/commons/1/1d/Earl_Grey_Tea.jpg"},
        {name: "Darjeeling", cost: 10, image:"https://upload.wikimedia.org/wikipedia/commons/5/54/Loose_leaf_darjeeling_tea_twinings.jpg"},
        {name: "Rooibos", cost: 15, image: "https://upload.wikimedia.org/wikipedia/commons/4/46/Rooibos_geschnitten.jpg"}
      ]

    const onItemClick = function(product) {
        const toBeAddedToBasket = [...basketItems]
        toBeAddedToBasket.push(product)
        setBasketItems(toBeAddedToBasket)
    }

    const onNameSubmit = function(name) {
        setUserName(name)
    }

    return (
    <Router>
        <NavBar/>
        <Routes>
            <Route path="/" element={ <HomePage onNameSubmit={onNameSubmit}/> } />
            <Route path="/products" element={<Products teaProducts={teaProducts} onItemClick={onItemClick}/>} />
            <Route path="/basket" element={<Basket basketItems={basketItems} userName={userName}/>} />
        </Routes>
    </Router>
    )
}

export default Chaiovna;