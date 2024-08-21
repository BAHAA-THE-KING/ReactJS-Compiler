function createRoot(root) {
  document.getElementById("root").append(root);
}
function createElement(type, props = {}, children) {
  const element = document.createElement(type);

  for (let [key, value] of Object.entries(props)) {
    if (key === "style" && typeof value === "object") {
      Object.assign(element.style, value);
    } else if (key.startsWith("on") && typeof value === "function") {
      const event = key.slice(2).toLowerCase();
      element.addEventListener(event, value);
    } else {
      element.setAttribute(key, value);
    }
  }

  function parseChilds(children) {
    children.forEach((child) => {
      if (typeof child === "string" || typeof child === "number") {
        element.appendChild(document.createTextNode(child));
      } else if (child instanceof Node) {
        element.appendChild(child);
      } else if (Array.isArray(child)) {
        parseChilds(child);
      }
    });
  }
  parseChilds(children);

  return element;
}class Component {
  constructor(props) {
    this.props = props || {};
    this.state = {};
    this._rootElement = null;
    this.componentWillMount();
  }

  setState(newState) {
    this.state = { ...this.state, ...newState };
    this.updateComponent();
  }

  updateComponent() {
    const newElement = this.render();
    if (this._rootElement && this._rootElement.parentNode) {
      this._rootElement.parentNode.replaceChild(newElement, this._rootElement);
    }
    this._rootElement = newElement;
    this.componentDidUpdate(this.props, this.state);
  }

  componentWillMount() {}
  componentDidMount() {}
  componentWillUpdate(nextProps, nextState) {}
  componentDidUpdate(prevProps, prevState) {}
  componentWillUnmount() {}

  render() {
    throw new Error("Component.render must be implemented");
  }

  mount() {
    this._rootElement = this.render();
    this.componentDidMount();
    return this._rootElement;
  }

  unmount() {
    this.componentWillUnmount();
  }
}
;
;
const meatImage = "./images/meat.jpg";
const fruitImage = "./images/fruit.jpg";
const vegetableImage = "./images/vegetable.webp";
const chickenImage = "./images/chicken.webp";
const products = [{
id:1, name:"meat", details:"Meat is a vital source of protein for many people, providing essential nutrients for muscle growth and repair. It is also a rich source of vitamins and minerals, including B vitamins, iron, and zinc. However, it's important to consume meat in moderation due to its high saturated fat content. Additionally, the production of meat can have significant environmental impacts, including deforestation and greenhouse gas emissions.", url:meatImage
}, {
id:2, name:"fruit", details:"Fruits are a vital part of our diet, providing essential nutrients and a source of natural sweetness. They come in a variety of colors and flavors, each with its own unique health benefits. From the tart taste of citrus fruits to the sweetness of berries, fruits offer a range of flavors that can complement any meal. They are also a great source of fiber, vitamins, and minerals, making them a healthy choice for anyone's diet.", url:fruitImage
}, {
id:3, name:"vegetable", details:"Vegetables are a vital part of a healthy diet, providing a wide range of nutrients. They are low in calories but high in vitamins, minerals, and fiber. They also offer a variety of flavors and textures, making them a versatile addition to any meal. Some of the most common vegetables include carrots, broccoli, and spinach, but there are many more to explore.", url:vegetableImage
}, {
id:4, name:"chicken", details:"Chicken is a versatile and widely consumed type of meat. It is known for its tender and flavorful meat, which is often used in a variety of dishes. Chicken is also a good source of protein and is low in fat. It is commonly raised for its meat, but also for its eggs. Chicken is a popular choice for many people due to its affordability and ease of preparation.", url:chickenImage
}];
class App extends Component{
constructor(props = {

}){
super( props );
this.props = props;
this.state = {
state_1:0
}
};
render(){
const {

} = this.props;
const [index, setIndex] = [this.state.state_1, (value)=>{
this.setState( {
...this.state, state_1:value
} );
}];
return (createElement( "div", {
className:"App", style:{

display:"flex", flexFlow:"row nowrap", justifyContent:"flex-start", alignContent:"center"

}
}, [createElement( "div", {
style:{

flex:1, maxHeight:"100vh", overflowY:"auto"

}
}, [new ProductList( {
products:products, setActiveProduct:setIndex, children:[]
} ).render()] ), createElement( "div", {
style:{

flex:3, maxHeight:"100vh", overflowY:"auto"

}
}, [new ProductView( {
product:products[index], children:[]
} ).render()] )] ))
}
};
class ProductView extends Component{
constructor(props = {

}){
super( props );
this.props = props;
this.state = {

}
};
render(){
const {
product:{
name:name, url:url, details:details
}
} = this.props;
return (createElement( "div", {

}, [createElement( "h1", {

}, [name] ), createElement( "img", {
src:url, style:{

width:"500px"

}
}, [] ), createElement( "p", {

}, [details] )] ))
}
};
class ProductsListItem extends Component{
constructor(props = {

}){
super( props );
this.props = props;
this.state = {

}
};
render(){
const props = this.props;
const productData = props.product;
const setActiveProduct = props.setActiveProduct;
return (createElement( "li", {
style:{

display:"felx", flexDirection:"column", justifyContent:"flex-start", cursor:"pointer", margin:"30px 0", padding:"10px 10px", border:"1px solid black"

}, onClick:setActiveProduct
}, [createElement( "h2", {

}, [productData.name] ), createElement( "img", {
src:productData.url, style:{

width:"100%"

}
}, [] )] ))
}
};
class ProductList extends Component{
constructor(props = {

}){
super( props );
this.props = props;
this.state = {

}
};
render(){
const {
products:products, setActiveProduct:setActiveProduct
} = this.props;
return (createElement( "ul", {
style:{

padding:"0 20px", listStyle:"none"

}
}, [products.map( (e, i)=>{
return (new ProductsListItem( {
product:e, setActiveProduct:()=>{
return setActiveProduct( i );
}, children:[]
} ).render());
} )] ))
}
};
createRoot( new App( {
children:[]
} ).mount() );
