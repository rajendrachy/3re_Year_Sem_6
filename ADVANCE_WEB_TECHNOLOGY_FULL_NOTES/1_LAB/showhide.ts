
const pass = document.getElementById("password") as HTMLInputElement;
const toggleBtn = document.getElementById("toggle") as HTMLButtonElement;

toggleBtn.addEventListener("click", () => {
    if (pass.type === "password") {
        pass.type = "text";
        toggleBtn.textContent = "Hide";
    } else {
        pass.type = "password";
        toggleBtn.textContent = "Show";
    }
});






