function add(a, b) {
    return a + b;
}
function handleAdd() {
    var i1 = document.getElementById("input1").value;
    var i2 = document.getElementById("input2").value;
    var n1 = Number(i1);
    var n2 = Number(i2);
    var r = (!isNaN(n1) && !isNaN(n2)) ? add(n1, n2) : add(i1, i2);
    document.getElementById("result").innerText = "Result: " + r;
}






