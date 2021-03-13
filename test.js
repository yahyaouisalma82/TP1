   
    const ol=document.querySelector('ol')
         ol.addEventListener('click',(e)=> e.target.style.color='#' + ((1<<24)*(Math.random()+1)|0).toString(16).substr(1))
     