import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;

public class Grafo {
 
    private List<Nodo> nodos = new LinkedList<>();
    
    Grafo(String path) {
        BufferedReader reader;
        try{
        reader=new BufferedReader(new FileReader(path));
        String line = reader.readLine();
            while (line!=null) {
                
                if (nodos.isEmpty()){
                    addNode();
                }
                
                String arr[]=line.split(",");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                    
                }
                
                System.out.println("");
                
                line = reader.readLine();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Grafo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Grafo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void addNode(Nodo node) {
        if (nodos == null) {
            nodos = new ArrayList<>();
        }
        nodos.add(node);
    }
 
    public List<Nodo> getNodes() {
        return nodos;
    }
 
    @Override
    public String toString() {
        return "Grafo [nodos=" + nodos + "]";
    }
 
}