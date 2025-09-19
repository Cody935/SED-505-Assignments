# SED-505-Assignment 1

Filename	        Description
Item.h	          Abstract base class/interface for items (tools, groceries) with virtual methods like GetCost(), display(), and accept(visitor) declaration.
Tool.h       	    Tool item base and concrete classes (e.g., Hammer, Screwdriver), inheriting from Item and implementing accept.
Grocery.h	        Grocery item base and concrete classes (e.g., Apple, Orange), inheriting from Item and implementing accept.
ShoppingCart.h	  Class containing collection of Item*; methods to add items, and accept a visitor for processing.
ShoppingCart.cpp  Implementation of ShoppingCart methods.
Visitor.h	        Visitor interface declaration with visit methods for all concrete item types.
CostVisitor.h	    Concrete visitor class to calculate cost, tax, and track statistics.
CostVisitor.cpp	  Implementation of the concrete visitor methods.
Customer.h 	      Customer class containing ShoppingCart, name, cash, pointer to RetailStore; methods to fill cart and purchase.
Customer.cpp	    Implementation of Customer methods.
RetailStore.h	    RetailStore class managing customers, purchases, and statistics.
RetailStore.cpp	  Implementation of RetailStore methods.
main.cpp	        Test program creating customers, running purchases, and displaying output/statistics.
