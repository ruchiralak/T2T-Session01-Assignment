package org.ruchiraLakshan;

class Document implements Cloneable{
     private String title;
     private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Document clone()  {
        try{
            return (Document) super.clone();
        }catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }
    @Override
    public String toString() {
        return "Document{title='" + title + "', content='" + content + "'}";
    }



}

public class PrototypeDemo {
    public static void main(String[] args)  {
        Document doc = new Document("The Song of Ice and Fire","A story about 7 kingdoms");
        Document doc1 = doc.clone();

        System.out.println("Original :" + doc);
        System.out.println("Clone :" + doc1 );

        //Modify clone
        doc1.setTitle("Robin Hood");
        doc1.setContent("A Story about a hero/thief");

        System.out.println("\nAfter modifying clone");
        System.out.println("Original :" + doc);
        System.out.println("Clone :" + doc1);

    }
}