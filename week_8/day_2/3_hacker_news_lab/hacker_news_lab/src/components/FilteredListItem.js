const FilteredListItem = ({Filteredstory}) => {

    return (
        <li>
            <h4>{Filteredstory.title}</h4>
            <p>posted by {Filteredstory.by}</p>
        </li>
    )
}

export default FilteredListItem;