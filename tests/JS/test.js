// Define a class
class Animal {
  constructor(name, type) {
    this.name = name;
    this.type = type;
  }

  sound() {
    console.log(`${this.name} the ${this.type} makes a sound`);
  }
}

// Create instances of the class
const dog = new Animal('Buddy', 'Dog');
const cat = new Animal('Whiskers', 'Cat');

// Function using higher-order functions and arrow function
const greet = (name) => (message) => {
  console.log(`Hello, ${name}! ${message}`);
};

const greetMessage = greet('John');
greetMessage('How are you?');

// Array manipulation
const numbers = [1, 2, 3, 4, 5];
const doubledNumbers = numbers.map(num => num * 2);
console.log(doubledNumbers);

// Promises and asynchronous operations
const fetchData = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve('Data fetched!');
    }, 2000);
  });
};

fetchData()
  .then(data => console.log(data))
  .catch(error => console.error(error));

// Template literals and string manipulation
const name = 'Alice';
const age = 30;
console.log(`My name is ${name} and I'm ${age} years old.`);

// Event handling (in a browser context)
const button = document.createElement('button');
button.textContent = 'Click me';
button.addEventListener('click', () => {
  console.log('Button clicked!');
});

document.body.appendChild(button);
