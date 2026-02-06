# HTML Canvas Quick Notes

## 1. Basic Setup

```html
<canvas id="canva" width="600" height="600" style="border: 3px solid black;"></canvas>
```

* `id="canva"` → used to access canvas in JavaScript
* `width` and `height` → size of the canvas
* `style="border: 3px solid black;"` → optional, just to see the canvas border

---

## 2. Accessing Canvas in JavaScript

```javascript
let canvas = document.getElementById("canva");
let ctx = canvas.getContext("2d");  // 2D drawing context
```

* `ctx` is the **2D rendering context** → used for all drawing operations

---

## 3. Drawing Shapes

### a) Filled Rectangle

```javascript
ctx.fillStyle = "blue";    // fill color
ctx.fillRect(100, 200, 250, 100);  // x, y, width, height
```

* `fillStyle` → sets color to **fill the shape**
* `fillRect(x, y, width, height)` → draws **filled rectangle**

### b) Unfilled Rectangle (Outline)

```javascript
ctx.strokeStyle = "red";   // outline color
ctx.strokeRect(100, 200, 300, 200);  // x, y, width, height
```

* `strokeStyle` → sets color for **shape border**
* `strokeRect(x, y, width, height)` → draws **only the border**

### c) Circle

```javascript
ctx.beginPath(); // start a new path
ctx.arc(300, 200, 100, 0, 2 * Math.PI, false); // x, y, radius, startAngle, endAngle, anticlockwise
ctx.fillStyle = "blue"; // fill color
ctx.fill(); // fill the circle
// ctx.strokeStyle = "blue";
// ctx.stroke(); // outline instead of fill
```

* `ctx.arc()` → creates a circle or arc
* `beginPath()` → ensures a new shape is drawn independently
* `fill()` → fills the shape with color
* `stroke()` → draws only the outline

---

## 4. Key Points

* Coordinates `(x, y)` start from **top-left corner**
* `fillRect`, `strokeRect`, and `arc` can overlap
* You can mix filled and outlined shapes with different colors



