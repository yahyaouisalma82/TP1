var queryselector= 
document.querySelector("head title");
var queryselectorAll=document.querySelectorAll("#monMenu .item span");
console.log('ce que me donne querySelector: '+ queryselector.textContent);
console.log('Ce que donne le querySelectorAll : ');
for(var i=0;i<queryselectorAll.length;i++){
console.log(queryselectorAll[i].textContent);
}
let query=document.querySelector('li');
console.log(query.textContent);
