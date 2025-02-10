import rootReducer from './modules';
import { composeWithDevTools } from 'redux-devtools-extension';
import { createStore } from 'redux';
import { applyMiddleware } from 'redux';
import ReduxThunk from 'redux-thunk';
import logger from 'redux-logger';

const store = createStore(
    rootReducer,
    composeWithDevTools(applyMiddleware(ReduxThunk, logger))
);

export default store;

// // ... existing code ...
// import { configureStore } from '@reduxjs/toolkit';
// // ... existing code ...
// // Removed import { createStore } from 'redux';
// // ... existing code ...

// const store = configureStore({
//     reducer: rootReducer,
//     middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(logger),
//     devTools: process.env.NODE_ENV !== 'production',
// });

// export default store;