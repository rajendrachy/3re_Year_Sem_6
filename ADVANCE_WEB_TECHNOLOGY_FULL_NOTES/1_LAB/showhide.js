var pass = document.getElementById("password");
var toggleBtn = document.getElementById("toggle");
toggleBtn.addEventListener("click", function () {
    if (pass.type === "password") {
        pass.type = "text";
        toggleBtn.textContent = "Hide";
    }
    else {
        pass.type = "password";
        toggleBtn.textContent = "Show";
    }
});











