const PokeballEntry = ({selectedPokeball}) => {

    const capitalizePokeName = (pokeName) => {
        return pokeName.charAt(0).toUpperCase() + pokeName.slice(1)
    }

    return (
        <>
        <h2>{capitalizePokeName(selectedPokeball.name)}</h2>
        <img src={selectedPokeball.sprites.front_default} alt={selectedPokeball.name}></img>
        </>
    )
}

export default PokeballEntry;