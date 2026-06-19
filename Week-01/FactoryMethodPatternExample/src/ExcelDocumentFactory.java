public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        System.out.println("Factory: Creating Excel Document...");
        return new ExcelDocument();
    }
}