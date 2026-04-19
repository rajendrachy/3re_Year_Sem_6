var boardEl = document.getElementById("board");
var statusEl = document.getElementById("status");
var resetBtn = document.getElementById("resetBtn");
var board = Array(9).fill("");
var currentPlayer = "X";
var gameOver = false;
function renderBoard() {
    boardEl.innerHTML = "";
    board.forEach(function (cell, index) {
        var div = document.createElement("div");
        div.classList.add("cell");
        div.innerText = cell;
        div.addEventListener("click", function () { return handleClick(index); });
        boardEl.appendChild(div);
    });
}

function handleClick(index) {
    if (board[index] !== "" || gameOver)
        return;
    board[index] = currentPlayer;
    if (checkWinner()) {
        statusEl.innerText = "Player ".concat(currentPlayer, " wins!");
        gameOver = true;
        renderBoard();
        return;
    }
    if (!board.includes("")) {
        statusEl.innerText = "Draw!";
        gameOver = true;
        return;
    }
    currentPlayer = currentPlayer === "X" ? "O" : "X";
    statusEl.innerText = "Player ".concat(currentPlayer, "'s turn");
    renderBoard();
}
function checkWinner() {
    var wins = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],
        [0, 3, 6], [1, 4, 7], [2, 5, 8],
        [0, 4, 8], [2, 4, 6]
    ];
    return wins.some(function (_a) {
        var a = _a[0], b = _a[1], c = _a[2];
        return board[a] && board[a] === board[b] && board[a] === board[c];
    });
}
function resetGame() {
    board = Array(9).fill("");
    currentPlayer = "X";
    gameOver = false;
    statusEl.innerText = "Player ".concat(currentPlayer, "'s turn");
    renderBoard();
}
resetBtn.addEventListener("click", resetGame);
function init() {
    statusEl.innerText = "Player ".concat(currentPlayer, "'s turn");
    renderBoard();
}
init();


