import './PokeEntry.css';
import PokeAbilities from './PokeAbilities';
import AddButton from './AddButton';

const PokeEntry = ({selectedPokemon, selectedPokemonDetail}) => {

    const pokeHeight = selectedPokemonDetail.height * 10;
    const pokeWeight = selectedPokemonDetail.weight / 10;

    const capitalizePokeName = (pokeName) => {
        return pokeName.charAt(0).toUpperCase() + pokeName.slice(1)
    }

    const pokeAbility = selectedPokemonDetail.abilities.map((ability, index) => {
        return <PokeAbilities key={index} ability={ability} index={index}/>
    })

    return (
        <>
        <h4>No. {selectedPokemonDetail.id}</h4>
        <h2>{capitalizePokeName(selectedPokemon.name)}</h2>
        <img src={selectedPokemonDetail.sprites.front_default} alt={selectedPokemon.name}></img>
        <p>Height: {pokeHeight} cms </p>
        <p>Weight: {pokeWeight} kg</p>
        <br></br>
        <h4>Abilities:</h4>
        <ol>{pokeAbility}</ol>
        <AddButton/>
        </>
    )
}

export default PokeEntry;