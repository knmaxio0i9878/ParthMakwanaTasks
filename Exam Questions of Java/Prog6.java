class Library{
    int ano,pages;
    String title;
}
class Book extends Library{
    String author;
    Book(String author){
        super.ano = 101;
        super.pages= 687;
        super.title = "XYZ";
        this.author = author;
    }
    public void showMaterialDetails(){
        System.out.println(super.ano+" "+super.pages+" "+super.title+" "+author);
    }
}
class Magezine extends Library{
    int issueno;
     Magezine(int issueno){
        this.issueno = issueno;
    }
    public void showMaterialDetails(){
        System.out.println(super.ano+" "+super.pages+" "+super.title+" "+issueno);
    }
}
public class Prog6 {
    public static void main(String[] args) {
         

        Book b = new Book("Parth");
        b.showMaterialDetails();
        Magezine m = new Magezine(9999);
        m.showMaterialDetails();
    }
    

}
