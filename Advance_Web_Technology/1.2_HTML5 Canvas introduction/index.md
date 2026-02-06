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

---

## 4. Key Points

* Coordinates `(x, y)` start from **top-left corner**
* `fillRect` and `strokeRect` can overlap
* You can mix filled and outlined rectangles with different colors




