import './PokeEntry.css';

const PokeEntry = ({selectedPokemon, selectedPokemonDetail}) => {

    const pokeHeight = selectedPokemonDetail.height * 10;
    const pokeWeight = selectedPokemonDetail.weight / 10;

    return (
        <>
        <h4>No. {selectedPokemonDetail.id}</h4>
        <h2>{selectedPokemon.name}</h2>
        <img src={selectedPokemonDetail.sprites.front_default} alt={selectedPokemon.name}></img>
        <p>Height: {pokeHeight} cms Weight: {pokeWeight} kg</p>

        </>
    )
}

export default PokeEntry;