const text =
"The quick brown fox jumps over the lazy dog";

const textDisplay = document.getElementById("text") as HTMLElement;
const input = document.getElementById("input") as HTMLTextAreaElement;
const startBtn = document.getElementById("start") as HTMLButtonElement;
const timeDisplay = document.getElementById("time") as HTMLElement;
const wpmDisplay = document.getElementById("wpm") as HTMLElement;

let startTime: number;
let timer: any;

startBtn.onclick = () => {

textDisplay.innerText = text;

input.disabled = false;
input.value = "";
input.focus();

startTime = Date.now();

timer = setInterval(() => {

let time = (Date.now() - startTime) / 1000;

timeDisplay.innerText = "Time: " + time.toFixed(1) + " sec";

}, 100);

};

input.oninput = () => {

let typed = input.value;

let time = (Date.now() - startTime) / 1000;

let wordsTyped = typed.trim().split(" ").length;

let wpm = Math.round((wordsTyped / time) * 60);

if (!isNaN(wpm)) {
wpmDisplay.innerText = "WPM: " + wpm;
}

if (typed === text) {

clearInterval(timer);

input.disabled = true;

}

};








