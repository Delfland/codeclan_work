import React, {useState, useEffect} from "react";
import Dropdown from "../component/Dropdown";
import PokeEntry from "../component/PokeEntry";


const MyPokedex = () => {

    const [allPokemons, setAllPokemons] = useState([]);
    const [selectedPokemon, setSelectedPokemon] = useState(null);
    const [selectedPokemonDetail, setSelectedPokemonDetail] = useState(null);


    useEffect(() => {
        getPokemons();
    },[])

    useEffect(() => {
        if(selectedPokemon){
            getSinglePokemon()
        }
        
    }, [selectedPokemon])

    const getPokemons = function(){
        fetch('https://pokeapi.co/api/v2/pokemon?limit=151')
        .then(res => res.json())
        .then(data => setAllPokemons(data.results))
    }

    const getSinglePokemon = function(){
        console.log(selectedPokemon.url);
        fetch(selectedPokemon.url)
        .then(res => res.json())
        .then(data => setSelectedPokemonDetail(data))
    }

    const onPokemonSelected = function(pokemon) {
        setSelectedPokemon(pokemon)
    }


    return (
        <>
        <h1>My Pokedex</h1>
        <Dropdown allPokemons={allPokemons} onPokemonSelected={onPokemonSelected}/>
        {selectedPokemonDetail? <PokeEntry selectedPokemon={selectedPokemon} selectedPokemonDetail={selectedPokemonDetail}/> : null}
        </>
    );
}

export default MyPokedex;