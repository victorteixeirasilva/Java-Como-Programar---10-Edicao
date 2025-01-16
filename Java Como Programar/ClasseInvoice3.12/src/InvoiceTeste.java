public class InvoiceTeste {
    public static void main(String[] args) {


        Invoice invoice = new Invoice("1223", "dsadasd", 3, 3.00);

        System.out.println(invoice.getInvoiceAmount(invoice));

        Invoice invoice2 = new Invoice("1223", "dsadasd", 0, 3.00);

        System.out.println(invoice.getInvoiceAmount(invoice2));

        Invoice invoice3 = new Invoice("1223", "dsadasd", 0, 0.00);

        System.out.println(invoice.getInvoiceAmount(invoice3));

        Invoice invoice4 = new Invoice("1223", "dsadasd", 3, 0.00);

        System.out.println(invoice.getInvoiceAmount(invoice4));

    }
}