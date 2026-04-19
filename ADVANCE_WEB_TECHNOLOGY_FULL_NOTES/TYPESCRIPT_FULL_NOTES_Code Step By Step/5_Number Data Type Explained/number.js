// var var_name : data_type = value
var num1 = 10;
var num2 = 32;
var num3 = "30";
// How to add number 
var total = num1 + num2; // not able to add num3 i.e string
console.log(total);
// How to use binary and hexadecimal number
var oct = 32769;
var hexa = 1;
var binary = 0x00001;
console.log(oct + 10);
// convert string to number
var item1 = 100;
var item2 = "50";
var item2Convert = Number(item2);
console.log(item1 + item2Convert);
// redeclare issue
// - which is in the let and const keyword
// 
//  var data = 30;
//  data = 40;
//  data = "anil sidhu";
var data = 30;
data = "anil sidhu";
