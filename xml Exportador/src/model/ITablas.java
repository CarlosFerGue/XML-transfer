package model;

import org.w3c.dom.NodeList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public interface ITablas {
    String traducir();

    void insertar(NodeList lista);

    //Default se aplica igual a todas las clases que la implementen,
    //en lugar de que se creen funciones vacias como las de
    //traducir e insertar

    default void mostrarXML(String xml_mostrar) {
        System.out.println(xml_mostrar);
    }

    default void exportar(String xml_exportar, String tabla) {
        try {
            //Creamos un archivo donde guardar el xml
            File archivo = new File("Archivos/" + tabla + "Exportados.xml");

            //Creamos un FileWriter para escribir en ese archivo
            FileWriter escritor = new FileWriter(archivo);

            //Escribimos en el archivo
            escritor.write(xml_exportar);

            //Cerramos el FileWriter
            escritor.close();
            System.out.println("¡El archivo " + tabla + "Exportados.xml ha sido creado!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    default NodeList xmlToSQL(String xml_importar, String tabla, String item) {
        NodeList listaDatos = null;


    }


}
