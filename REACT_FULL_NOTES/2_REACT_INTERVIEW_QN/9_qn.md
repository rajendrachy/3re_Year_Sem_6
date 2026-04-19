## 12. How does the `useState` Hook work?

`useState` is a React Hook that allows functional components to **store and update state**. It returns an array with two values: the current state value and a function used to update that state.

### Syntax

```javascript
const [state, setState] = useState(initialValue);
```

* **state** – the current value of the state.
* **setState** – a function used to update the state.
* **initialValue** – the starting value of the state.

### How it Works

1. React initializes the state with the provided **initial value**.
2. The component displays the state value in the UI.
3. When the **setState function** is called, React updates the state.
4. The component **re-renders automatically** with the new value.

### Example

```javascript
import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  const increase = () => {
    setCount(count + 1);
  };

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={increase}>Increase</button>
    </div>
  );
}

export default Counter;
```

### Output

* Initially: **Count: 0**
* After clicking the button: **Count increases by 1 each time**.


