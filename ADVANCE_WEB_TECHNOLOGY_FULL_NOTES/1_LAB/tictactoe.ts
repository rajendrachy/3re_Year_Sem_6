
  
const boardEl = document.getElementById("board") as HTMLDivElement;
const statusEl = document.getElementById("status") as HTMLHeadingElement;
const resetBtn = document.getElementById("resetBtn") as HTMLButtonElement;

let board: string[] = Array(9).fill("");
let currentPlayer: string = "X";
let gameOver: boolean = false;

function renderBoard() {
  boardEl.innerHTML = "";

  board.forEach((cell, index) => {
    const div = document.createElement("div");
    div.classList.add("cell");
    div.innerText = cell;

    div.addEventListener("click", () => handleClick(index));

    boardEl.appendChild(div);
  });
}


function handleClick(index: number) {
  if (board[index] !== "" || gameOver) return;

  board[index] = currentPlayer;

  if (checkWinner()) {
    statusEl.innerText = `Player ${currentPlayer} wins!`;
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
  statusEl.innerText = `Player ${currentPlayer}'s turn`;

  renderBoard();
}



function checkWinner(): boolean {
  const wins = [
    [0,1,2],[3,4,5],[6,7,8],
    [0,3,6],[1,4,7],[2,5,8],
    [0,4,8],[2,4,6]
  ];

  return wins.some(([a,b,c]) =>
    board[a] && board[a] === board[b] && board[a] === board[c]
  );
}

function resetGame() {
  board = Array(9).fill("");
  currentPlayer = "X";
  gameOver = false;
  statusEl.innerText = `Player ${currentPlayer}'s turn`;
  renderBoard();
}

resetBtn.addEventListener("click", resetGame);

function init() {
  statusEl.innerText = `Player ${currentPlayer}'s turn`;
  renderBoard();
}

init();










