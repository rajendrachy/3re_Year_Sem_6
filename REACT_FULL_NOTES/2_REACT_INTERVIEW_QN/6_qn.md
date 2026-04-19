## State in React

State is a built-in object in React components that allows components to create and manage their own data, which can change over time. Unlike props, state is local to the component and can be updated to trigger re-rendering of the component.

### Key Points

* State is mutable, unlike props which are read-only.
* Updating state causes the component to re-render with the new values.

### Functional Component Example (using useState)

```javascript
import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0); // initialize state

  const increment = () => {
    setCount(count + 1); // updating state
  };

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={increment}>Increment</button>
    </div>
  );
}

export default Counter;
```

### Class Component Example

```javascript
import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 }; // initialize state
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 }); // updating state
  };

  render() {
    return (
      <div>
        <p>Count: {this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
      </div>
    );
  }
}

export default Counter;
```

### How to Update State

* **Functional Components:** Use the `setState` function returned by `useState` hook.
* **Class Components:** Use `this.setState()` method.
* Updating state triggers a re-render so the UI reflects the new state.

