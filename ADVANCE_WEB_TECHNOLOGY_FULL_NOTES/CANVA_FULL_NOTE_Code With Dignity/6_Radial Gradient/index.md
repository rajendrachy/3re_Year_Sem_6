# HTML Canvas Quick Notes

## 1. Creating Radial Gradients

```javascript
let gradient = ctx.createRadialGradient(50, 50, 20, 50, 50, 50); // x0, y0, r0, x1, y1, r1
gradient.addColorStop(0, "yellow");   // inner color
gradient.addColorStop(0.5, "pink");   // middle color
gradient.addColorStop(1, "red");      // outer color

ctx.fillStyle = gradient;               // set gradient as fill style
ctx.fillRect(0, 0, 200, 200);          // draw filled rectangle with radial gradient
```

* `createRadialGradient(x0, y0, r0, x1, y1, r1)` → creates a radial gradient from inner circle `(x0, y0, r0)` to outer circle `(x1, y1, r1)`
* `addColorStop(offset, color)` → defines color stops along the gradient (0 to 1)
* Set `ctx.fillStyle` to gradient to apply it to shapes





