$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoShopTest.feature");
formatter.feature({
  "line": 1,
  "name": "Demoshop wishlist",
  "description": "",
  "id": "demoshop-wishlist",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Demoshop Add to cart",
  "description": "",
  "id": "demoshop-wishlist;demoshop-add-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Navigate to Testshop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I add four different products to my wish list",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I view my wishlist table",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I find total four selected items in my wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I am able to add the lowest price item to my cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I am able to verify the item in my cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});