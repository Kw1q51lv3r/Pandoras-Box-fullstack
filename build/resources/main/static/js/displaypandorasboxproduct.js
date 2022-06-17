const products = new ProductController();

/*products.addProduct("Lite Box", "Box, Small", "01", 49, "Contains 1 spa item, 1 bath item, and 1 clothing item. Made of recycleable cardboard.", "Please recycle, or seal used products inside for returning. Single-use plastics account for a majority of global marine litter.", "I", 2, "E", "F");

products.addProduct("Standard Box", "Box, Standard", "02", 59, "Contains 1 spa item, 2 bath items, and 1 clothing item. Made of recycleable cardboard.", "Please recycle, or seal used products inside for returning. in 2017, 65% of all recycling waste in the US went to landfill.", "I", 2, "E", "F");

products.addProduct("Premium Box", "Box, Delux", "03", 79,"Contains 2 spa items, 2 bath items, and 2 clothing items. Made of recycleable cardboard. Please recycle, or seal used products inside for returning.", "The damage to a road from a cargo truck is estimated at up to 2500 times that of a family car.", "I", 2, "E", "F");
*/

products.addProduct("Bodywash, Lemongrass, 500ml", "04", 25, "Treat your skin and let it heal after a long day. Rinse away the dirt and grime of life with the scent of lemongrass and natural oils.", "From 1936 to 1950, a cartel of motor and oil companies successfully conspired to replace rail transport in Los Angeles with buses.", "images/menbodywash.jpg", 2, "E", "Bodywashes");

products.addProduct("Moisturiser, Hair, 500ml", "05", 49, "Your hair dries out a lot in the sun, but it doesn't have to. Keep it strong and healthy with a moisturiser, because that's what a moisturiser does.", "The construction industry makes up 40% of global energy consumption.", "images/moisturiser.jpg", 4, "E", "Moisturisers");

products.addProduct("Bodywash, Grapefruit, 500ml", "06", 29, "Feel fresh and energised with the light pep from the citrus kick of this grapefruit bodywash. If you want to be performing at your best, you'll want all the help you can get.", "The US Military consumes more fossil fuels than the entire country of Finland.", "images/shampoo1.jpg", 2, "E", "Bodywashes");

products.addProduct("Facewash, Exfoliating, 200ml", "07", 27, "The face is one of the most sensitive parts of your body, and it helps to keep it radiant and healthy- no, not in that way, use this facewash instead!", "Disposable coffee cups cannot be properly recycled, and even compostable ones last for decades in landfills.", "images/facewash.jpg", 3, "E", "Face Washes");

//(productName, productID, productPrice, productDescription, productTrivia, productImg, productRemarks, productCategory)

products.addProduct("Moisturiser, Hand, Shea Butter, 200ml", "08", 18, "When you interface with the world every day, what do you use? Your hands. You live your life through them; you owe it to yourself to take care of them.", "In 1992, McDonald's served Stella Liebeck coffee that gave her third-degree burns and disabled her for two years afterwards. She sued McDonald's to cover her $200,000 medical expense, where the jury voted to also award her the now-famous $2.7 million in punitive damages. She did not get the money.", "images/handcream.jpg", 6, "E", "Hand Cream");

products.addProduct("Face Oil, Rosehip, 200ml", "09", 49, "You go through life face-first. When people identify you, it is by your face. Significant aspects of communcation are done with your face. Doll your face up and give life the Glasgow Kiss it deserves.", "'Do not operate heavy machinery' most often specifically means driving your car.", "images/menbodywash.jpg", 6, "E", "Facial Oil");

products.addProduct("Toothpaste, Charcoal, 150g", "10", 4, "Charcoal has been used as a medicinal agent for centuries, preventing the absorption of harmful substances by the body. It's edible, too. Makes sense to clean your mouth with it.", "Environmentalists were successful in getting Germany to de-nuclearise its power grid, resulting in greatly increased lignite coal production... which they burn in Poland.", "images/essentialoil.jpg", 2, "E", "Oral Care");

products.addProduct("Toothbrush, Medium Bristles", "B", 11, "... it's just a toothbrush.", "Three-quarters of all transportation-associated pollution comes from road vehicles.", "images/menbodywash.jpg", 4, "E", "Oral Care");

products.addProduct("Dental Floss, Mint, Waxed, 75m", "12", 3, "There's a few places that your toothbrush can't reach. Use this to reach them.", "Marine transportation has a future in sustainable technologies, but air transport does not.", "images/menbodywash.jpg", 3, "E", "Oral Care");

products.addProduct("Ladies' Top, Supima Cotton, Cropped Cut", "13", 48, "Women's crop cut. For satisfying your fashion and/or aesthetic needs. Made to last. If worn out or otherwise no longer desired, please bundle and return with our box.", "Fast fashion contributes almost 100 million tons to landfill disposal every year.", "images/pinkcrop.jpg", 6, "E", "Apparel");

products.addProduct("Unisex Tee, Cotton/Polyester Blend, Wide Cut", "14", 35, "Unisex loose cut. For satisfying your fashion and/or aesthetic needs. Light, airy, and comfortable. Made to last. If worn out or otherwise no longer desired, please bundle and return with our box.", "Clothing sales doubled between 2000 and 2015, with the average clothing item being worn 20% less.", "images/blackshirt.jpg", 6, "E", "Apparel");

products.addProduct("Polo Shirt, Cotton/Polyester Blend, Standard Cut", "15", 39, "Unisex. For satisfying your fashion and/or aesthetic needs. Light, breathable, and comfortable. Made to last. If worn out or otherwise no longer desired, please bundle and return with our box.", "The anti-nuclear movement, as a subsection of the environmentalist movement, is heavily funded by fossil fuel interests.", "images/mwwhiteshirt.jpg", 6, "E", "Apparel");


//METHODS AND FUNCTIONS

//1) Execute the displaySpottingRecocrd method with parameter "All"

products.displayProduct("All");

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
    products.filterProducts(event.target.innerText);
} //end of categoryTypeClicked function

