## React Component

A React component is a reusable, self-contained piece of UI that can be used to build complex user interfaces in a modular way. Components can be written as functions or classes and they can accept inputs called "props" and maintain internal state.

### Types of React Components

1. **Functional Components**

   * Defined as JavaScript functions.
   * Accept `props` as an argument.
   * Can use hooks to manage state and side effects.

2. **Class Components**

   * Defined using ES6 classes.
   * Extend `React.Component`.
   * Have lifecycle methods and can manage state.

### Example

**Functional Component:**

```javascript
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}
```

**Class Component:**

```javascript
class Greeting extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}!</h1>;
  }
}
```

### Difference between Functional and Class Components

| Feature           | Functional Component         | Class Component                                                           |
| ----------------- | ---------------------------- | ------------------------------------------------------------------------- |
| Syntax            | Function                     | ES6 Class                                                                 |
| State Management  | Use `useState` hook          | `this.state` and `this.setState()`                                        |
| Lifecycle Methods | Use `useEffect` hook         | Built-in lifecycle methods like `componentDidMount`, `componentDidUpdate` |
| `this` Keyword    | Not required                 | Required to access props and state                                        |
| Performance       | Generally faster and simpler | Slightly heavier due to class overhead                                    |

Components help in:

* Reusability
* Separation of concerns
* Easier maintenance
* Building dynamic UIs



