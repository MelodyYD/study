import { GET_POKEMONS } from "../modules/PokemonModule";

export function callGetPokemonsAPI(url, params) {

    const requestURL = url || 'https://pokeapi.co/api/v2/pokemon'; 

    return async function getPokemons(dispatch, getState) {
        // redux-thunk 미들웨어가 적용되어 있어서 
        // dispatch와 getState를 매개변수로 받는 함수를 반환할 수 있습니다.
        // 이를 통해 비동기 작업을 처리할 수 있습니다.
        const result = await fetch(requestURL).then(res => res.json());
    
        console.log('result : ', result);
    
        dispatch({ type: GET_POKEMONS, payload: result });
    }
}
