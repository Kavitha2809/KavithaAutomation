Feature: Demoshop wishlist
Scenario: Demoshop Add to cart

Given Navigate to Testshop
Then I add four different products to my wish list
When I view my wishlist table 
Then I find total four selected items in my wishlist
And I am able to add the lowest price item to my cart
Then I am able to verify the item in my cart