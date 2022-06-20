const productsControl = new ProductController();

//METHODS AND FUNCTIONS

//1) Execute the displaySpottingRecocrd method with parameter "All"
productsControl.displayItem()
//productsControl.renderProductPage("All");

/* Search button codes here */

//3) Event listener for the category buttons

//return all the category types into an array so that we can loop them

const categoryT = document.getElementsByClassName("categoryTypes");
console.log(categoryT);

//loop to find the button which is clicked
for (let i=0; i<categoryT.length; i++) {
    categoryT[i].addEventListener("click", categoryTypeClicked);
} //end of for loop

//To read text in button (the aircraft type) and pass it as a parameter to the filterAircraft method and hence also to my 3rd condition in the displaySpottingRecord method to display only the filtered aircraft type

function categoryTypeClicked(event) {
    productsControl.filterProducts(event.target.innerText);
} //end of categoryTypeClicked function

