import "./App.css";
import "./index.css";
import meatImage from "./images/meat.jpg";
import fruitImage from "./images/fruit.jpg";
import vegetableImage from "./images/vegetable.webp";
import chickenImage from "./images/chicken.webp";

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
    name: "fruit",
    details:
      "Fruits are a vital part of our diet, providing essential nutrients and a source of natural sweetness. They come in a variety of colors and flavors, each with its own unique health benefits. From the tart taste of citrus fruits to the sweetness of berries, fruits offer a range of flavors that can complement any meal. They are also a great source of fiber, vitamins, and minerals, making them a healthy choice for anyone's diet.",
    url: fruitImage,
  },
  {
    id: 3,
    name: "vegetable",
    details:
      "Vegetables are a vital part of a healthy diet, providing a wide range of nutrients. They are low in calories but high in vitamins, minerals, and fiber. They also offer a variety of flavors and textures, making them a versatile addition to any meal. Some of the most common vegetables include carrots, broccoli, and spinach, but there are many more to explore.",
    url: vegetableImage,
  },
  {
    id: 4,
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
        <ProductList products={products} setActiveProduct={setIndex} />
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
        display: "felx",
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

function ProductList({ products, setActiveProduct }) {
  return (
    <ul style={{ padding: "0 20px", listStyle: "none" }}>
      {products.map((e, i) => (
        <ProductsListItem
          product={e}
          setActiveProduct={() => setActiveProduct(i)}
        />
      ))}
    </ul>
  );
}

createRoot(<App />);
