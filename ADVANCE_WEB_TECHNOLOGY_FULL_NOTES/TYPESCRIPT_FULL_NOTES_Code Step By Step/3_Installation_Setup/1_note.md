## TypeScript Installation and Setup Guide

---

### 1. Install Node.js (Prerequisite)
TypeScript runs using Node.js.

Download and install from:
https://nodejs.org

Verify installation:
    node -v
    npm -v

If both versions show, Node.js is installed correctly.

---

### 2. Install TypeScript

#### Option A: Global Installation (Recommended for Beginners)
    npm install -g typescript

Check installation:
    tsc -v

You should see the TypeScript version.

#### Option B: Local Installation (Recommended for Projects)

Inside your project folder:
    npm init -y
    npm install typescript --save-dev

Run TypeScript using:
    npx tsc -v

---

### 3. Create a TypeScript File

Create a file:
    index.ts

Example code:
    let message: string = "Hello TypeScript";
    console.log(message);

---

### 4. Compile TypeScript to JavaScript

TypeScript must be compiled to JavaScript:
    tsc index.ts

This generates:
    index.js

Run it using:
    node index.js

---

### 5. Create tsconfig.json (Project Configuration)

Generate config file:
    tsc --init

This creates:
    tsconfig.json

Important options inside:
    {
      "compilerOptions": {
        "target": "ES6",
        "module": "commonjs",
        "strict": true,
        "outDir": "./dist"
      }
    }

Now compile the whole project:
    tsc

---

### 6. Using TypeScript with VS Code

Install Visual Studio Code

Install extensions (optional):
- ESLint  
- Prettier  

VS Code has built-in TypeScript support.

---

### Quick Setup Summary
- Install Node.js  
- Install TypeScript (`npm install -g typescript`)  
- Create `.ts` file  
- Compile using `tsc`  
- Run with `node`  

---

### Watch Mode
    npx tsc app.ts --watch