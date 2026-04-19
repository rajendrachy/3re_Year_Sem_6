# HTML Canvas Quick Notes

## 1. Creating Gradients

```javascript
let gradient = ctx.createLinearGradient(0, 0, 200, 0); // x0, y0, x1, y1
gradient.addColorStop(0, "yellow");  // start color
gradient.addColorStop(1, "red");     // end color

ctx.fillStyle = gradient;              // set gradient as fill style
ctx.fillRect(0, 0, 200, 200);         // draw filled rectangle with gradient
```

* `createLinearGradient(x0, y0, x1, y1)` → creates a linear gradient from start `(x0, y0)` to end `(x1, y1)`
* `addColorStop(offset, color)` → defines color stops along the gradient (0 to 1)
* Set `ctx.fillStyle` to gradient to use it for shapes



