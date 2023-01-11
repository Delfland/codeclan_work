import BasketItem from "./BasketItem";

const Basket = ({basketItems, userName}) => {

    const basketNodes = basketItems.map((product, index) => {
        return <li key={index}><BasketItem product={product}/></li>
    })

    

    return (
        <>
        {userName? <h2> Welcome {userName} </h2>: <h2>Welcome</h2>}
        <h3>Please review the contents of your basket prior to checkout.</h3>
        <ul>
            {basketNodes}
        </ul>
        </>
    )
}

export default Basket;