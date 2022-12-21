import Song from "./Song";

const SongList = ({topTwenty}) => {

    const songNodes = topTwenty.map((song, index) => {
        return <Song song={song} key={index}/>
    })

    return (
        <>
        {songNodes}
        </>
    )
}

export default SongList;