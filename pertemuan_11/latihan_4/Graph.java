package pertemuan_11.latihan_4;
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

    public void addVertex(char lab) {
        vertexList[nVerts] = new Vertex(lab);
    }
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

