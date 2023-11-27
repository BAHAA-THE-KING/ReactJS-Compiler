package js.ImportStatement;

public class FileImportBlock extends ImportChunk {
    String fileName;

    public FileImportBlock(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "FileImportBlock{" + "fileName='" + fileName + '\'' + '}';
    }
}
