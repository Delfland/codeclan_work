const ProductItem = ({product, onItemClick}) => {

    const handleClick = (event) => {
        onItemClick(product)
    }

    return (
        <>
            <h4>{product.name}</h4> 
            <p>£{product.cost}</p>
            <img src={product.image} alt={product.name} width="200"/>
            <button onClick={handleClick}>Add to Basket</button>
        </>
    )
}

export default ProductItem;