const PokeEntry = ({selectedPokemon, selectedPokemonDetail}) => {

    return (
        <>
        <h2>{selectedPokemon.name}</h2>
        <img src={selectedPokemonDetail.sprites.back_default} alt={selectedPokemon.name}></img>
        </>
    )
}

export default PokeEntry;