public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        System.out.println("Factory: Creating Word Document...");
        return new WordDocument();
    }
}