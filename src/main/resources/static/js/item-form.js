// Initialize a new ItemsController with currentId set to 0
const itemsController = new ProductController(0);

// Select the New Item Form
const newItemForm = document.querySelector('.newItemForm');

// Add an 'onsubmit' event listener
newItemForm.addEventListener('submit', (event) => {
    // Prevent default action
    event.preventDefault();

    // Select the inputs
    const newItemProduct = document.querySelector('#newItemProduct');
    const newItemName = document.querySelector('#newItemName');
    const newItemID = document.querySelector('#newItemID');  
    const newItemPrice = document.querySelector('#newItemPrice');      
    const newItemDescription = document.querySelector('#newItemDescription');    
    const newItemTrivia = document.querySelector('#newItemTrivia');    
    const newItemImage = document.querySelector('#newItemImage');    
    const newItemRD = document.querySelector('#newItemRD');    
    const newItemRemarks = document.querySelector('#newItemRemarks');    
    const newItemCategory = document.querySelector('#newItemCategory');      


    // Get the values of the input
    const product = newItemProduct.value;
    const name = newItemName.value;
    const id = newItemID.value;
    const price = newItemPrice.value;
    const desc = newItemDescription.value;
    const trivia = newItemTrivia.value;
    const img = newItemImage.value.replace("C;\\fakepath\\", "");
    const recoDelivery = newItemRD.value;
    const remarks = newItemRemarks.value;
    const category = newItemCategory.value;
  

    /*
        Validation code here
    */

    // Add the item to the ItemsController
    itemsController.addProduct(product, name, id, price, desc, trivia, img, recoDelivery, remarks, category, storeImage);

    // Clear the form
    newItemProduct.value = '';
    newItemName.value = '';
    newItemID.value = '';
    newItemPrice.value = '';
    newItemDescription.value = '';
    newItemTrivia.value = '';
    newItemImage.value = '';
    newItemRD.value = '';
    newItemRemarks.value = '';
    newItemCategory.value = '';
});

// add event listener
input.addEventListener('change', () => {
    storeImage = input.files[0];
});
