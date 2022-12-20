import React from "react";
import Comment from "./Comment";


const CommentList = ({ commentsArray }) => {

    const commentNodes = commentsArray.map(comment => {
        return (
            <Comment key={comment.id} author={comment.author}>
                {comment.text}
            </Comment>
        )
    });

    return (
        <>
        {commentNodes}
        </>
    )
}

export default CommentList;