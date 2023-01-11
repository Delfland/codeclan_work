const NewsListItem = ({story}) => {

    return (
        <li>
            <h4>{story.title}</h4>
            <p>posted by {story.by}</p>
        </li>
    )
}

export default NewsListItem;