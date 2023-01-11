import FilteredListItem from "./FilteredListItem";
import NewsListItem from "./NewsListItem";

const NewsList = ({stories, filteredStories}) => {

    const storyItem = stories.map((story, index) => {
        return <NewsListItem key={index} story={story} />
    })  
    
    if (filteredStories.length() > 0) {

        const filteredStoryItem = filteredStories.map((filteredStory, index) => {
            return <FilteredListItem key={index} filteredStory={filteredStory}/>
        })

        return (
            <ul>{filteredStoryItem}</ul>
       )
    } else {
        return (
            <ul>{storyItem}</ul>
       )
    }
}

export default NewsList;