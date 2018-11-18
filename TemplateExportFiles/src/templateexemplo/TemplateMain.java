
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
        ExportFiles html = new HtmlFile();
        ExportFiles word = new WordFile();
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                

      html.export(texto);
      word.export(texto);
    }
    
}
