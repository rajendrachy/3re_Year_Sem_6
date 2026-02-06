# HTML Canvas Quick Notes

## 1. Drawing Lines / Shapes with Paths

```javascript
ctx.beginPath();           // start a new path
ctx.moveTo(100, 100);      // starting point (x, y)
ctx.lineTo(100, 300);      // draw line to (x, y)
ctx.lineTo(300, 300);      // draw line to next point
ctx.lineTo(100, 100);      // connect back to starting point

ctx.strokeStyle = "red";  // line color
ctx.stroke();               // draw the lines
```

* `beginPath()` → starts a new drawing path
* `moveTo(x, y)` → sets starting point of the path
* `lineTo(x, y)` → draws line from current point to new point
* `stroke()` → renders the path as an outline
* Useful for **custom shapes or polygons**


