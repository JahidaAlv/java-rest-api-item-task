#################### java-rest-api-item-task ####################


A simple Spring Boot REST API for managing items with add and get-by-id functionality using in-memory storage.

####################
  About the Code 
####################

->This project is built using Spring Boot and follows a simple layered structure.

->Item Model (Item.java)
Defines the item entity with fields like id, name, and description.

->Controller (ItemController.java)
Contains REST endpoints to:

   -> Add a new item (POST /items)
   -> Get an item by ID (GET /items/{id})

-> In-Memory Storage
Uses an ArrayList to store items during runtime (no database used).

-> Input Validation
Ensures required fields such as name and description are provided before adding an item.

The application is lightweight and designed for demonstration purposes.


***OUTPUT IMAGES***


![WhatsApp Image 2026-02-11 at 3 27 12 PM](https://github.com/user-attachments/assets/cd389705-0a4b-4597-a8fd-5c6b79a22713)
![WhatsApp Image 2026-02-11 at 3 26 26 PM](https://github.com/user-attachments/assets/a9cc8ccf-f27f-4763-8abb-543e446dd751)


