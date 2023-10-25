const show=()=>{
    const shows=document.querySelector("#signup");
    shows.classList.toggle("show");
    document.querySelector(".layer").style.display="block"
}

const hide=() =>{

    const hides = document.querySelector("#signup");
    hides.classList.remove("show")
    document.querySelector(".layer").style.display="none"
}