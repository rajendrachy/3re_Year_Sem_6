# HTML Canvas Quick Notes

## 1. Writing Text on Canvas

```javascript
ctx.font = "50px Arial";       // set font size and family
ctx.fillStyle = "red";        // text color
ctx.fillText("Rajendra", 200, 200);  // draw filled text at (x, y)

// ctx.strokeStyle = "red";
// ctx.strokeText("Rajendra", 200, 200);  // draw outlined text
```

* `font` → sets the font size and type
* `fillText(text, x, y)` → draws **filled text** on canvas
* `strokeText(text, x, y)` → draws **outlined text** on canvas
* Coordinates `(x, y)` → starting point for text



