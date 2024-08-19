let person = {
    firstName: 'John',
    lastName: 'Doe',
    age: 30,
    isStudent: false,
    address: {
      street: '123 Main St',
      city: 'Anytown',
      country: 'USA'
    },
    sayHello: function() {
      console.log('Hello, I am ' + this.firstName + ' ' + this.lastName + '!');
    }
  };
  