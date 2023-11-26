import ProductsListItem from './ProductsListItem'

function ProductList({ products, setActiveProduct }) {
   return (
      <ul style={{ padding: "0 20px", listStyle: "none" }}>
         {
            products.map((e, i) => <ProductsListItem product={e} setActiveProduct={() => setActiveProduct(i)} />)
         }
      </ul>
   )
}

export default ProductList;