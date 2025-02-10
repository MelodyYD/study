import { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import PokemonCard from "../items/PokemonCard";
import { callGetPokemonsAPI } from "../../apis/PokemonAPICalls";

function PokemonList() {

    const result = useSelector(state => state.pokemonReducer);
    console.log('pokemonReducer result : ', result);

    const pokemons = result.results;
    console.log('pokemons : ', pokemons);

    const dispatch = useDispatch();

    useEffect(
        () => {
            dispatch(callGetPokemonsAPI())
        },
        []
    );

    return (
        pokemons && (
            <div>
                <h3>총 포켓몬 수 : { result.count }</h3>
                <button onClick={ () => dispatch(callGetPokemonsAPI(result.prev)) } >이전</button>
                <button onClick={ () => dispatch(callGetPokemonsAPI(result.next)) } >다음</button>
                { pokemons.map(pokemon => <PokemonCard key={ pokemon.url } pokemon={ pokemon }/> ) }
            </div>
        )
    );
}

export default PokemonList;