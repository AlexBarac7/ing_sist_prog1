package Laborator10;


public class Importer {
    void startImport(IStudentiImport strategyInstance, String fileName)
    {
        strategyInstance.doImport(fileName);
    }
}