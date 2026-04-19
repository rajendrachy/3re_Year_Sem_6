var Account = /** @class */ (function () {
    function Account(name, bal) {
        if (bal === void 0) { bal = 0; }
        this.name = name;
        this.bal = bal;
    }
    Account.prototype.show = function () {
        console.log("".concat(this.name, " Balance: $").concat(this.bal));
    };
    Account.prototype.deposit = function (amount) {
        if (amount > 0)
            this.bal += amount;
    };
    Account.prototype.withdraw = function (amount) {
        if (amount > 0 && amount <= this.bal)
            this.bal -= amount;
    };
    return Account;
}());
var a1 = new Account("Abc", 1000);
a1.show();
a1.deposit(500);
a1.withdraw(200);
a1.show();
