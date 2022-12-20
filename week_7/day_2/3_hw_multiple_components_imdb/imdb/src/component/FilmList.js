import React from 'react';
import Film from './Film';

const FilmList = ({filmsArray}) => {

    const filmNodes = filmsArray.map(film =>{
        return (
            <Film key={film.id} url={film.url}>
                {film.name}
            </Film>
        )
    });

    return (
        <>
        {filmNodes}
        </>
    )
}

export default FilmList;