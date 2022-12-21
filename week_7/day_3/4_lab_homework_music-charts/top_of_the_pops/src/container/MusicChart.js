import React, {useState, useEffect} from 'react';
import SongList from "../component/SongList";

const MusicChart = () => {

    const [topTwenty, setTopTwenty] = useState([]);

    useEffect(() => {
        getTopTwenty();
    }, [])

    const getTopTwenty = function(){
        fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/json')
        .then(response => response.json())
        .then(data => setTopTwenty(data.feed.entry))
    }

    return (
        <>
        <h1>UK Top Twenty</h1>
        <SongList topTwenty={topTwenty}/>
        </>
    )
}

export default MusicChart;