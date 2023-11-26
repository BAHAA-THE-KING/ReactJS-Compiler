import React from 'react'

function ProductsListItem(props) {
   const productData = props.product;
   const setActiveProduct = props.setActiveProduct;
   return (
      <li
         style={{
            display: "felx",
            flexDirection: "column",
            justifyContent: "flex-start",
            cursor: "pointer",
            margin: "30px 0",
            padding: "10px 10px",
            border: "1px solid black"
         }}
         onClick={setActiveProduct}
      >
         <h2>{productData.name}</h2>
         <img src={productData.url} style={{ width: "100%" }} />
      </li>
   )
}

export default ProductsListItem;