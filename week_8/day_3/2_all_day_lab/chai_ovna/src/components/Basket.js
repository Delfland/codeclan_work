import BasketItem from "./BasketItem";

const Basket = ({basketItems, userName, onCheckout}) => {

    let runningTotal = 0

    const basketNodes = basketItems.map((product, index) => {
        runningTotal = runningTotal + product.cost
        return <li key={index}><BasketItem product={product}/></li>
    })

    const handleClick = () => {
        onCheckout()
    }

    return (
        <>
        {userName? <h2> Welcome {userName} </h2>: <h2>Welcome</h2>}
        {basketItems.length > 0? <h3>Please review the contents of your basket prior to checkout.</h3>:<h3>Your basket is currently empty.</h3>}
        <ul>
            {basketNodes}
        </ul>
        <h3>Total: £ {runningTotal}</h3>
        <button onClick={handleClick}>Checkout</button>
        </>
    )
}

export default Basket;