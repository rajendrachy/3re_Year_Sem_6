# HTML Canvas – 50 MCQs (Answers with Reasons)

---

## Section 1: Basics & Paths

**Q1. What does `beginPath()` do?**  
A. Ends drawing  
B. Starts a new path  
C. Fills shape  
D. Clears canvas  
**Answer:** B  
**Reason:** Starts a fresh path and resets previous drawing path.

---

**Q2. What is the purpose of `moveTo(x, y)`?**  
A. Draws rectangle  
B. Sets starting point  
C. Fills color  
D. Ends path  
**Answer:** B  
**Reason:** Moves cursor without drawing.

---

**Q3. `lineTo(x, y)` is used to:**  
A. Move cursor  
B. Draw line  
C. Fill text  
D. Clear path  
**Answer:** B  
**Reason:** Draws a line from current point.

---

**Q4. Which method actually draws the path?**  
A. moveTo()  
B. lineTo()  
C. stroke()  
D. fillText()  
**Answer:** C  
**Reason:** Renders the outline.

---

**Q5. Default coordinate origin is:**  
A. Center  
B. Bottom-left  
C. Top-left  
D. Top-right  
**Answer:** C  
**Reason:** Canvas starts from top-left.

---

## Section 2: Drawing Logic

**Q6. Canvas draws in which order?**  
A. Random  
B. Last to first  
C. Code order  
D. Circular  
**Answer:** C  
**Reason:** Executes top to bottom.

---

**Q7. Overlap means:**  
A. Deleting shapes  
B. Same area covered  
C. Resizing shapes  
D. Rotating shapes  
**Answer:** B  
**Reason:** Multiple drawings share same region.

---

**Q8. Which appears on top?**  
A. First drawn  
B. Last drawn  
C. Both equal  
D. None  
**Answer:** B  
**Reason:** Latest drawing overwrites visually.

---

**Q9. What does `strokeStyle` define?**  
A. Fill color  
B. Border color  
C. Font size  
D. Gradient  
**Answer:** B  
**Reason:** Controls outline color.

---

**Q10. A closed shape is formed by:**  
A. stroke()  
B. beginPath()  
C. Connecting last to first  
D. fillText()  
**Answer:** C  
**Reason:** Completes the shape loop.

---

## Section 3: Text on Canvas

**Q11. `ctx.font` is used to:**  
A. Set color  
B. Set font and size  
C. Draw line  
D. Clear text  
**Answer:** B  
**Reason:** Defines text style.

---

**Q12. Which method draws filled text?**  
A. strokeText()  
B. fillText()  
C. drawText()  
D. textFill()  
**Answer:** B  
**Reason:** Creates solid text.

---

**Q13. `strokeText()` creates:**  
A. Filled text  
B. Outlined text  
C. Gradient text  
D. Shadow text  
**Answer:** B  
**Reason:** Only border is drawn.

---

**Q14. Coordinates in `fillText()` represent:**  
A. Center  
B. Top-right  
C. Starting point  
D. End point  
**Answer:** C  
**Reason:** Text begins from this point.

---

**Q15. Example font format:**  
A. Arial 50px  
B. 50px Arial  
C. px50 Arial  
D. Arial size 50  
**Answer:** B  
**Reason:** Uses CSS format.

---

## Section 4: Rectangles

**Q16. `fillRect()` does:**  
A. Draw outline  
B. Draw filled rectangle  
C. Draw line  
D. Draw text  
**Answer:** B  
**Reason:** Creates solid rectangle.

---

**Q17. `strokeRect()` does:**  
A. Fill rectangle  
B. Outline rectangle  
C. Clear rectangle  
D. Rotate rectangle  
**Answer:** B  
**Reason:** Draws border only.

---

**Q18. Rectangles can:**  
A. Only be filled  
B. Only be outlined  
C. Overlap  
D. Cannot overlap  
**Answer:** C  
**Reason:** Shapes can share space.

---

**Q19. Default canvas size is:**  
A. 500×500  
B. 300×150  
C. 100×100  
D. Full screen  
**Answer:** B  
**Reason:** Default HTML size.

---

**Q20. Overlapping depends on:**  
A. Color  
B. Drawing order  
C. Size  
D. Font  
**Answer:** B  
**Reason:** Order controls visibility.

---

## Section 5: Gradients

**Q21. `createLinearGradient()` creates:**  
A. Circle  
B. Line  
C. Gradient  
D. Text  
**Answer:** C  
**Reason:** Defines linear color transition.

---

**Q22. Parameters of linear gradient represent:**  
A. Width & height  
B. Start and end points  
C. Color  
D. Radius  
**Answer:** B  
**Reason:** Defines gradient direction.

---

**Q23. `addColorStop()` is used to:**  
A. Add border  
B. Define colors  
C. Draw shape  
D. Clear gradient  
**Answer:** B  
**Reason:** Sets gradient colors.

---

**Q24. Offset range is:**  
A. 0–100  
B. 1–10  
C. 0–1  
D. 0–255  
**Answer:** C  
**Reason:** Uses normalized values.

---

**Q25. Gradient is applied using:**  
A. strokeStyle  
B. fillStyle  
C. font  
D. lineTo  
**Answer:** B  
**Reason:** Fill style controls color.

---

## Section 6: Radial Gradient

**Q26. `createRadialGradient()` creates:**  
A. Square  
B. Circle gradient  
C. Line  
D. Path  
**Answer:** B  
**Reason:** Creates circular gradient.

---

**Q27. Number of parameters required:**  
A. 2  
B. 4  
C. 6  
D. 8  
**Answer:** C  
**Reason:** Two circles need center and radius.

---

**Q28. `r0` represents:**  
A. Outer radius  
B. Inner radius  
C. Width  
D. Height  
**Answer:** B  
**Reason:** Starting circle radius.

---

**Q29. Gradient moves from:**  
A. Left to right  
B. Inner to outer  
C. Top to bottom  
D. Random  
**Answer:** B  
**Reason:** Color spreads outward.

---

**Q30. Middle color uses offset:**  
A. 0  
B. 0.5  
C. 1  
D. 2  
**Answer:** B  
**Reason:** Middle of gradient.

---

## Section 7: Advanced Concepts

**Q31. Canvas uses which coordinate system?**  
A. Cartesian  
B. Polar  
C. 3D  
D. Matrix  
**Answer:** A  
**Reason:** Uses x and y axes.

---

**Q32. Increasing x moves:**  
A. Up  
B. Down  
C. Right  
D. Left  
**Answer:** C  
**Reason:** X increases horizontally.

---

**Q33. Increasing y moves:**  
A. Up  
B. Down  
C. Left  
D. Right  
**Answer:** B  
**Reason:** Y increases downward.

---

**Q34. `stroke()` draws:**  
A. Fill  
B. Outline  
C. Text  
D. Gradient  
**Answer:** B  
**Reason:** Draws border.

---

**Q35. Multiple `lineTo()` create:**  
A. Circles  
B. Polygons  
C. Text  
D. Gradients  
**Answer:** B  
**Reason:** Forms shapes.

---

## Section 8: Mixed Concepts

**Q36. Canvas is part of:**  
A. CSS  
B. HTML  
C. Python  
D. SQL  
**Answer:** B  
**Reason:** HTML element.

---

**Q37. JavaScript is used to:**  
A. Style canvas  
B. Draw on canvas  
C. Create HTML  
D. Store data  
**Answer:** B  
**Reason:** Used for drawing.

---

**Q38. Without `stroke()` lines will:**  
A. Show  
B. Not appear  
C. Turn red  
D. Fill  
**Answer:** B  
**Reason:** Not rendered.

---

**Q39. Without `beginPath()` shapes may:**  
A. Clear  
B. Mix with previous paths  
C. Delete  
D. Resize  
**Answer:** B  
**Reason:** Path continues.

---

**Q40. `fillStyle` affects:**  
A. Borders  
B. Fill color  
C. Font  
D. Size  
**Answer:** B  
**Reason:** Controls fill.

---

## Section 9: Final Questions

**Q41. Canvas element is:**  
A. `<div>`  
B. `<canvas>`  
C. `<draw>`  
D. `<svg>`  
**Answer:** B  
**Reason:** Correct HTML tag.

---

**Q42. Canvas requires:**  
A. CSS  
B. JavaScript  
C. SQL  
D. Python  
**Answer:** B  
**Reason:** Used for drawing.

---

**Q43. Path must start with:**  
A. stroke()  
B. beginPath()  
C. fillText()  
D. font  
**Answer:** B  
**Reason:** Initializes path.

---

**Q44. Shape edges use:**  
A. fill()  
B. stroke()  
C. font()  
D. style()  
**Answer:** B  
**Reason:** Draws outline.

---

**Q45. Gradient colors defined by:**  
A. addColorStop()  
B. fillRect()  
C. moveTo()  
D. strokeText()  
**Answer:** A  
**Reason:** Sets color stops.

---

**Q46. Canvas supports:**  
A. Only shapes  
B. Only text  
C. Both  
D. None  
**Answer:** C  
**Reason:** Supports both.

---

**Q47. Coordinates format:**  
A. (y, x)  
B. (x, y)  
C. (z, x)  
D. (a, b)  
**Answer:** B  
**Reason:** Standard format.

---

**Q48. Overlapping depends on:**  
A. Speed  
B. Drawing order  
C. Color  
D. Size  
**Answer:** B  
**Reason:** Later covers earlier.

---

**Q49. `moveTo()` draws:**  
A. Line  
B. Nothing  
C. Text  
D. Rectangle  
**Answer:** B  
**Reason:** Only moves cursor.

---

**Q50. Canvas is used for:**  
A. Database  
B. Graphics  
C. Networking  
D. Storage  
**Answer:** B  
**Reason:** Used for drawing visuals.

---