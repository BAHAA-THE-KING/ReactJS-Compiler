package js.ExportStatement;


import java.util.List;

public class ExportDeclaration extends ExportChunk {

    String classId;


    public ExportDeclaration(String classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "ExportDeclaration{" +
                "classId='" + classId + '\'' +
                '}';
    }
}
