# Assignment-1-File-Overview

| File/Class         | Responsibilities & Functionality                                                                              |
|--------------------|--------------------------------------------------------------------------------------------------------------|
| Item.java          | Interface for all purchasable items. Requires cost retrieval, text display, and visitor acceptance.           |
| Hammer.java        | Concrete tool. Implements Item; stores name and cost; displays info; accepts visitor.                        |
| Screwdriver.java   | Concrete tool. Like Hammer.java, but for screwdrivers.                                                       |
| Apple.java         | Concrete grocery. Implements Item; stores name, cost, calories; displays info; accepts visitor.              |
| Orange.java        | Concrete grocery. Like Apple.java, but for oranges.                                                          |
| Visitor.java       | Visitor interface with methods to handle each kind of item (hammer, screwdriver, apple, orange).             |
| CostVisitor.java   | Implements Visitor. Calculates total cost, GST for tools, splits grocery/tool revenue.                       |
| ShoppingCart.java  | Holds a user's purchased items. Supports item addition, printing, and batch visitor operations.               |
| Customer.java      | Models a customer (name, cash, cart, reference to store), filling cart, making purchases, displaying receipt.|
| RetailStore.java   | Maintains all customers, computes costs, tracks revenue, stores stats, records completed purchases.          |
| Main.java          | Runs the system: creates customers, fills carts, processes purchases, displays results/statistics.           |
