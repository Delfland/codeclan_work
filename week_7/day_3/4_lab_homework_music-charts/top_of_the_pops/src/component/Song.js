const Song = ({song, index}) => {

    return (
        <>
        <li>
            {song['im:artist'].label}
        </li>
        </>
    )
}

export default Song;