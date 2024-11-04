package q5;

public class TestInvoice {
    public static void main(String[] args) {
        // Creating an Invoice object
        Invoice invoice = new Invoice("1234", "Hammer", 10, 15.5);

        // Display invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());

        // Testing with invalid values
        invoice.setQuantity(-5);       // Invalid quantity
        invoice.setPricePerItem(-20);  // Invalid price per item

        // Display updated invoice details
        System.out.println("\nAfter setting invalid values:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}