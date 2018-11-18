
package templateexemplo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;


public abstract class ExportFiles {

    BufferedWriter out = null;
    XWPFDocument document;
    FileOutputStream out1 = null;

    public void export(String txt){
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }   
        save();
    }

    
    protected abstract void printLine(String line);
    protected abstract void save();

}
