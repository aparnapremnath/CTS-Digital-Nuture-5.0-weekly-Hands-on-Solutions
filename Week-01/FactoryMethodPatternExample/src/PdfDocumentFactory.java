public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        System.out.println("Factory: Creating PDF Document...");
        return new PdfDocument();
    }
}