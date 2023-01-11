import React, {useState} from "react";
import { Link } from "react-router-dom";

const HomePage = ({onNameSubmit}) => {

    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");

    const handleFirstNameChange = (event) => {
        setFirstName(event.target.value);
    }

    const handleLastNameChange = (event) => {
        setLastName(event.target.value);
    }

    const handleNamesSubmit = (event) => {
        event.preventDefault();
        const fullName = `${firstName} ${lastName}`
        onNameSubmit(fullName);

        setFirstName("");
        setLastName("");
    }

    return (
        <>
        <h2>Welcome to Chaiovna, the experts in all things tea!</h2>
        <p>Please login to start browsing our wonderful selection of teas.</p>
        <form onSubmit={handleNamesSubmit}>
            <input
            type="text"
            placeholder="Enter First Name"
            value={firstName}
            onChange={handleFirstNameChange}
            />
            <input
            type="text"
            placeholder="Enter Last Name"
            value={lastName}
            onChange={handleLastNameChange}
            />
            <button type="submit"><Link to="/products">Submit</Link></button>
        </form>
        </>
    )
}

export default HomePage;