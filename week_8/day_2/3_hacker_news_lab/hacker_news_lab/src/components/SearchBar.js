import React, {useState} from "react";

const SearchBar = ({onTextSubmit}) => {

    const [text, setText] = useState("")

    const handleTextInput = (event) => {
        setText(event.target.value)
    }

    const handleTextSubmit = (event) => {
        event.preventDefault();
        const textToSubmit = text.toLowerCase()
        onTextSubmit(textToSubmit);

        setText("");
    }

    return(
        
        <form onSubmit={handleTextSubmit}>
            <input
            type="text"
            name="searchBar"
            id="searchBar"
            value={text}
            placeholder="search by title"
            onChange={handleTextInput}
            />
            <input
            type="submit"
            value="Submit"
            />
        </form>
    )
}

export default SearchBar;