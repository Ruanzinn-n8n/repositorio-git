'use strict';

const switcher = document.querySelector('.butao');

switcher.addEventListener('click', function(){
    document.body.classList.toggle('dark-theme');

    var className = document.body.className;
    if(className == "light-theme") {
        this.textContent = "Light";
    }
    else{
        this.textContent = "Dark";
    }
    console.log('current class name: ' + className);
});