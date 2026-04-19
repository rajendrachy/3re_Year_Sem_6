# 2. What is JSX and How Is It Converted into JavaScript?

JSX (JavaScript XML) is a syntax extension for JavaScript used in React. It allows developers to write HTML-like code inside JavaScript to define UI components. JSX makes code more readable and easier to write.

### Example of JSX
const element = <h1>Hello, World!</h1>;

### How JSX is Converted into JavaScript

Browsers cannot understand JSX directly, so it is **transformed into standard JavaScript** using tools like Babel. JSX is converted into `React.createElement()` calls.

Example Conversion:

JSX:
const element = <h1>Hello, World!</h1>;

Converted JavaScript:
const element = React.createElement(
  'h1',
  null,
  'Hello, World!'
);

`React.createElement()` creates a React element, which is a **plain JavaScript object** describing what should appear on the UI. React then uses the **Virtual DOM** to efficiently update the real DOM with any changes.

### Key Points

- JSX is **syntactic sugar** for `React.createElement()`.
- Improves **readability** and **maintainability** of UI code.
- JSX code is **compiled to plain JavaScript** before running in the browser.
- Allows combining HTML structure and JavaScript logic in one place.

### Summary

JSX helps React developers write declarative and intuitive UI code. Behind the scenes, it is converted into standard JavaScript objects that React uses to render the UI efficiently.
