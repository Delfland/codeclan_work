import React, {useEffect, useState} from "react";
import NewsList from "../components/NewsList";
import SearchBar from "../components/SearchBar";

const HackerNews = () => {

    const [storyIds, setStoryIds] = useState([]);
    const [stories, setStories] = useState([]);
    const [searchTerm, setSearchTerm] = useState("")
    const [filteredStories, setFilteredStories] = []

    useEffect( () => {
        fetch( 'https://hacker-news.firebaseio.com/v0/topstories.json' )
        .then (res => res.json())
        .then( data => setStoryIds(data))
    }, [])

    useEffect( () => {
        const storyPromises = storyIds.slice(0, 20).map(storyId => {
            return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`)
            .then(response => response.json())
        });

        Promise.all(storyPromises)
        .then(data => {setStories(data)})
    },[storyIds])

    useEffect( () => {
        const storiesToFilter = stories.filter((story) => {
            return story.title.includes(searchTerm)
        })
        setFilteredStories(storiesToFilter)

    }, [searchTerm])

    const onTextSubmit = function(text){
        setSearchTerm(text)
    }

    return (
        <>
        <h1>Welcome to Hacker News</h1>
        <SearchBar onTextSubmit={onTextSubmit}/>
        <NewsList stories={stories} filteredStories={filteredStories}/>
        </>
    )
}

export default HackerNews;