import { combineReducers } from "redux";
import pokemonReducer from "./PokemonModule";

const rootReducer = combineReducers({
    pokemonReducer
});

export default rootReducer;