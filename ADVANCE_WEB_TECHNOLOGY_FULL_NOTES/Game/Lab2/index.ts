function add(a: number, b: number): number;
function add(a: string, b: string): string;
function add(a: any, b: any): any {
  return a + b;
}

function handleAdd() {
  let i1 = (document.getElementById("input1") as HTMLInputElement).value;
  let i2 = (document.getElementById("input2") as HTMLInputElement).value;

  let n1 = Number(i1);
  let n2 = Number(i2);

  let r = (!isNaN(n1) && !isNaN(n2)) ? add(n1, n2) : add(i1, i2);

  (document.getElementById("result") as HTMLElement).innerText = "Result: " + r;
}





