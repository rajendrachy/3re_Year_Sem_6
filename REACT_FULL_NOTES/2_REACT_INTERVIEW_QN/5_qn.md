## Props and Default Props in React

### Props

* **Props** (short for properties) are read-only inputs passed from a parent component to a child component.
* They allow components to be dynamic and reusable.

**Example:**

```javascript
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}

<Greeting name="Alice" />
```

### Default Props

* **Default props** are values set for props in case the parent component does not provide them.
* They ensure components have fallback values.

**Example:**

```javascript
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}

Greeting.defaultProps = {
  name: 'Guest'
};
```

