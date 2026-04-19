class Account {
    private bal: number;
    name: string;

    constructor(name: string, bal: number = 0) {
        this.name = name;
        this.bal = bal;
    }

    show() {
        console.log(`${this.name} Balance: $${this.bal}`);
    }

    deposit(amount: number) {
        if (amount > 0) this.bal += amount;
    }

    withdraw(amount: number) {
        if (amount > 0 && amount <= this.bal) this.bal -= amount;
    }
}

let a1 = new Account("Alice", 1000);
a1.show();
a1.deposit(500);
a1.withdraw(200);
a1.show();


