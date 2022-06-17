
class ProductController {

    //CONSTRUCTOR

    constructor() {
        this.allProductItems = [];
        this.filteredProducts = [];
    }// end of constructor

    //METHODS

    //MTD 1: addProduct method - to add individual productItem object
    addProduct(productName, productID, productPrice, productDescription, productTrivia, productImg, recoDelivery, productRemarks, productCategory){

        const productItem = {
            name: productName,
            id: productID,
            price: productPrice,
            desc: productDescription,
            trivia: productTrivia,
            img: productImg,
            recoDelivery: recoDelivery,
            remarks: productRemarks,
            category: productCategory,

        } //end of productItem object with properties

        //push each indivisual productItem to allProductItems array
        this.allProductItems.push(productItem);
        console.log(this.allProductItems)
        
    } // end of MTD 1


    //MTD 2: displayProduct method to display all the individual productItems in one space
    displayProduct(category) {
        let showProductItem = "";
        let moreBtnId = "";

        //Create an getProducts array for the list of products to be displayed
        let getProducts = [];

        //Displayed Products result - 3 possibilities

        
        //1) - by default, show all products when the page loads - from the allProductItems category
        if (category == "All") {getProducts = this.allProductItems}


        /*
        //2) else if search bar contain input, filter based on search input value
        else if (!this.searchCategory == "") {getProducts = this.searchCategory}
        */


        //3) else filter based on filter button selected

        else { getProducts = this.filteredProducts }

        //Display whatever is in the getProducts array
        getProducts.forEach ((item, index) => {   
            
            moreBtnId = "item" + index;

            showProductItem +=
            `  
            <div class="col-md-4 productcards">
            <a id="${moreBtnId}" href="#" data-bs-toggle="modal" data-bs-target="#exampleModalLive">
            <img src="${item.img}">
              <h4 class="paddingtopimages">${item.name}</h4>
              <h4>$${item.price}</h4></a>
            
            </div>
            `
        });

        document.querySelector(".productsstuff").innerHTML =  showProductItem;

        this.allProductItems.forEach ((item, index) => {
            moreBtnId = "item" + index;
            document.getElementById(moreBtnId).addEventListener("click", function(){ displayItemDetail(item) });
        });

   
    }//end of MTD 2


    //MTD 3: filterProducts method to filter the products

filterProducts(getSelectedCategory) {
    this.filteredProducts = this.allProductItems.filter(x => x.category.includes(getSelectedCategory))
    console.log(this.filteredProducts);

//display the filtered products
this.displayProduct(getSelectedCategory);

} // end of MTD 3

} // end of productController

function displayItemDetail(item) {
    //Handle each 'More' button click to show the Product details
   document.querySelector("#itemTitle").innerHTML = `${item.name} | $${item.price}`;
   document.querySelector("#itemDesc").innerHTML = item.desc;
   document.querySelector("#itemRecoDelivery").innerHTML = `Recommended delivery: every ${item.recoDelivery} months`;
   document.querySelector("#itemTrivia").innerHTML = `<i>${item.trivia}</i>`;
   document.querySelector("#itemImage").src = item.img;
}


