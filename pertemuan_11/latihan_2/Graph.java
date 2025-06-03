package pertemuan_11.latihan_2;
import pertemuan_11.latihan_1.Vertex;

public class Graph {
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts];

        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        for (int i = 0; i < maxVerts; i++)
            for (int j = 0; j < maxVerts; j++)
                adjMat[i][j] = 0;
    }
}
