function ProductView({ product: { name, url, details } }) {
   return (
      <>
         <h1>{name}</h1>
         <img src={url} style={{ width: "500px" }} />
         <p>{details}</p>
      </>
   );
}

export default ProductView;