public class Main {
    public static void main(String[] args) {
        TextFileHandler handler1 = new TextFileHandler("handler1");
        RichTextFileHandler handler2 = new RichTextFileHandler("handler2");
        DocFileHandler handler3 = new DocFileHandler("handler3");
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        File myFile = new File("readme", "txt", "C:Desktop");
        File yourFile = new File("readyou", "rtf", "C:");
        File ourFile = new File("readus", "doc", "D:");
        handler1.process(myFile);
        handler1.process(yourFile);
        handler1.process(ourFile);

    }
}