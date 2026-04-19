## 7. Difference Between Props and State in React

In React, **props** and **state** are used to manage and pass data in components, but they work in different ways.

| Feature       | Props                                                                 | State                                                                                  |
| ------------- | --------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| Definition    | Props are inputs passed from a parent component to a child component. | State is a built-in object that stores data inside a component.                        |
| Mutability    | Props are **read-only** and cannot be changed by the child component. | State **can be changed** by the component.                                             |
| Control       | Controlled by the **parent component**.                               | Controlled by the **component itself**.                                                |
| Purpose       | Used to pass data and configuration to components.                    | Used to manage dynamic data inside a component.                                        |
| Update Method | Cannot be updated directly.                                           | Updated using `setState()` in class components or `useState` in functional components. |

### Example of Props

```javascript
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

// Usage
<Welcome name="Alice" />
```

### Example of State (Functional Component)

```javascript
import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increase</button>
    </div>
  );
}
```



