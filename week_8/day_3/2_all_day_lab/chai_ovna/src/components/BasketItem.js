const BasketItem = ({product}) => {

    return (
        <>
            <h4>{product.name}</h4> 
            <p>£ {product.cost}</p>
            <img src={product.image} alt={product.name} width="200"/>
        </>
    )
}

export default BasketItem;