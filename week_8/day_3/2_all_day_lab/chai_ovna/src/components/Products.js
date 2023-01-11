import ProductItem from "./ProductItem"

const Products = ({teaProducts, onItemClick}) => {

    const productNodes = teaProducts.map((product, index) => {
        return <li key={index}><ProductItem product={product} onItemClick={onItemClick}/></li>
    })

    return(
        <ul>
            {productNodes}
        </ul>
    )
}

export default Products;