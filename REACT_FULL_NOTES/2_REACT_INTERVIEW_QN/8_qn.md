## 11. What are Hooks in React and why were they introduced?

### What are Hooks?

Hooks are special functions in React that allow developers to use **state and other React features inside functional components**. Before Hooks were introduced, these features were only available in **class components**.

Hooks make functional components more powerful and easier to manage.

### Why were Hooks Introduced?

Hooks were introduced in React to:

* Use **state in functional components**.
* Avoid writing complex **class components**.
* Reuse stateful logic between components.
* Make code **cleaner, simpler, and easier to understand**.

### Common React Hooks

1. **useState** – Used to manage state in functional components.
2. **useEffect** – Used to handle side effects like API calls or DOM updates.
3. **useContext** – Used to access React context easily.
4. **useRef** – Used to access or store DOM elements.

### Example: useState Hook

```javascript
import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>
        Increase
      </button>
    </div>
  );
}

export default Counter;
```

### Output

* Initially shows **Count: 0**
* Each button click increases the count by **1**.

