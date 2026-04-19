var text = "The quick brown fox jumps over the lazy dog";

var textDisplay = document.getElementById("text");
var input = document.getElementById("input");
var startBtn = document.getElementById("start");
var timeDisplay = document.getElementById("time");
var wpmDisplay = document.getElementById("wpm");
var startTime;
var timer;


startBtn.onclick = function () {
    textDisplay.innerText = text;
    input.disabled = false;
    input.value = "";
    input.focus();

    startTime = Date.now();
    timer = setInterval(function () {
        var time = (Date.now() - startTime) / 1000;
        timeDisplay.innerText = "Time: " + time.toFixed(1) + " sec";
    }, 100);
};


input.oninput = function () {
    var typed = input.value;
    var time = (Date.now() - startTime) / 1000;
    var wordsTyped = typed.trim().split(" ").length;
    var wpm = Math.round((wordsTyped / time) * 60);
    if (!isNaN(wpm)) {
        wpmDisplay.innerText = "WPM: " + wpm;
    }
    if (typed === text) {
        clearInterval(timer);
        input.disabled = true;
    }
};

















