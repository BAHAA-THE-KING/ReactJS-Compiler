import "App.css";
import "index.css";
import meatImage from "images/meat.jpg";
import fruitImage from "images/fruit.jpg";
import vegetableImage from "images/vegetable.webp";
import chickenImage from "images/chicken.webp";

const products = [
  {
    id: 1,
    name: "meat",
    details:
      "Meat is a vital source of protein for many people, providing essential nutrients for muscle growth and repair. It is also a rich source of vitamins and minerals, including B vitamins, iron, and zinc. However, it's important to consume meat in moderation due to its high saturated fat content. Additionally, the production of meat can have significant environmental impacts, including deforestation and greenhouse gas emissions.",
    url: meatImage,
  },
  {
    id: 2,
    name: "chicken",
    details:
      "Chicken is a versatile and widely consumed type of meat. It is known for its tender and flavorful meat, which is often used in a variety of dishes. Chicken is also a good source of protein and is low in fat. It is commonly raised for its meat, but also for its eggs. Chicken is a popular choice for many people due to its affordability and ease of preparation.",
    url: chickenImage,
  },
];

function App() {
  const [index, setIndex] = useState(0);
  return (
    <div
      className="App"
      style={{
        display: "flex",
        flexFlow: "row nowrap",
        justifyContent: "flex-start",
        alignContent: "center",
      }}
    >
      <div style={{ flex: 1, maxHeight: "100vh", overflowY: "auto" }}>
        <ProductList
          products={products}
          setActiveProduct={setIndex}
          index={index}
        />
      </div>
      <div style={{ flex: 3, maxHeight: "100vh", overflowY: "auto" }}>
        <ProductView product={products[index]} />
      </div>
    </div>
  );
}

function ProductView({ product: { name, url, details } }) {
  return (
    <>
      <h1>{name}</h1>
      <img src={url} style={{ width: "500px" }} />
      <p>{details}</p>
    </>
  );
}

function ProductsListItem(props) {
  const productData = props.product;
  const setActiveProduct = props.setActiveProduct;
  return (
    <li
      style={{
        display: "flex",
        flexDirection: "column",
        justifyContent: "flex-start",
        cursor: "pointer",
        margin: "30px 0",
        padding: "10px 10px",
        border: "1px solid black",
      }}
      onClick={setActiveProduct}
    >
      <h2>{productData.name}</h2>
      <img src={productData.url} style={{ width: "100%" }} />
    </li>
  );
}

function ProductList({ products, setActiveProduct, index }) {
  return (
    <ul style={{ padding: "0 20px", listStyle: "none" }}>
      {products.map((e, i) => (
        <ProductsListItem
          product={e}
          setActiveProduct={() =>
            index === 1 ? setActiveProduct(0) : setActiveProduct(1)
          }
        />
      ))}
    </ul>
  );
}

createRoot(<App />);
