public class Main {

     public static void main(String[] args) {

        System.out.println("=== Word Document ===");
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.openDocument();

        System.out.println("\n=== PDF Document ===");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.openDocument();

        System.out.println("\n=== Excel Document ===");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.openDocument();
    }
    
}
