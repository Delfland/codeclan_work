import React from 'react';

const Film = ({url, children}) => {
    return (
        <p><a href={url}>{children}</a></p>
    )
}

export default Film;