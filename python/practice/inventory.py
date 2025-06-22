'''Write a program to manage an inventory using dictionaries, 
where keys are item names and values are tuples containing price and quantity.
Implement functions to add, remove, and update items, and to calculate total inventory value. 
Use loops and conditionals for menu-driven interaction.'''

def display_menu():
    print("\n1. Add item")
    print("2. Remove item")
    print("3. Update item")
    print("4. Calculate total inventory value")
    print("5. Exit")

def add_item(inventory):
    name = input("Enter item name: ")
    price = float(input("Enter item price: "))
    quantity = int(input("Enter item quantity: "))
    inventory[name] = (price, quantity)
    print(f"{name} added to inventory.")

def remove_item(inventory):
    name = input("Enter item name to remove: ")
    if name in inventory:
        del inventory[name]
        print(f"{name} removed from inventory.")
    else:
        print(f"{name} not found in inventory.")

def update_item(inventory):
    name = input("Enter item name to update: ")
    if name in inventory:
        price = float(input("Enter new price: "))
        quantity = int(input("Enter new quantity: "))
        inventory[name] = (price, quantity)
        print(f"{name} updated in inventory.")
    else:
        print(f"{name} not found in inventory.")

def calculate_total_value(inventory):
    total_value = 0
    for item, (price, quantity) in inventory.items():
        total_value += price * quantity
    print(f"Total inventory value: ${total_value:.2f}")

def main():
    inventory = {}

    while True:
        display_menu()
        choice = input("Enter your choice (1-5): ")

        if choice == '1':
            add_item(inventory)
        elif choice == '2':
            remove_item(inventory)
        elif choice == '3':
            update_item(inventory)
        elif choice == '4':
            calculate_total_value(inventory)
        elif choice == '5':
            print("Exiting program.")
            break
        else:
            print("Invalid choice. Please enter a number between 1 and 5.")

if __name__ == "__main__":
    main()

