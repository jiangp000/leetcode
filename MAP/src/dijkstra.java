import java.util.Arrays;

public class dijkstra {
    public static void main(String[] args) {
        char[] vertix = {'A','B','C','D','E','F','G'};
        int[][] matrix = new int[vertix.length][vertix.length];
        final int N = 65535;
        matrix[0] = new int[]{N,5,7,N,N,N,2};
        matrix[1] = new int[]{5,N,N,9,N,N,3};
        matrix[2] = new int[]{7,N,N,N,8,N,N};
        matrix[3] = new int[]{N,9,N,N,N,4,N};
        matrix[4] = new int[]{N,N,8,N,N,5,4};
        matrix[5] = new int[]{N,N,N,4,5,N,6};
        matrix[6] = new int[]{2,3,N,N,4,6,N};

        Graph graph = new Graph(vertix,matrix);
        graph.showGraph();
        System.out.println();
        System.out.println();
        graph.dsj(6);
        graph.showDsj();

    }
}



class Graph{
    private char[] vertix;
    private int[][] matrix;
    private  VisitedVetrix visitedVetrix;

    public Graph(char[] vertix, int[][] matrix) {
        this.vertix = vertix;
        this.matrix = matrix;
    }
    public void showGraph(){
        for(int[] link: matrix){
            for(int node :link){
                System.out.printf("%12d",node);
            }
            System.out.println();
        }
    }
    public void showDsj(){
        visitedVetrix.show();
    }
    private  void update(int index){
        int len = 0;
        for(int i = 0; i < matrix[index].length; i++){
            len = visitedVetrix.getDis(index) + matrix[index][i];
            if(!visitedVetrix.in(i) && len < visitedVetrix.getDis(i)){
                visitedVetrix.upatePre(i,index);
                visitedVetrix.updateDis(i,len);
            }
        }
    }
    public void dsj(int index){
        visitedVetrix = new VisitedVetrix(vertix.length,index);
        update(index);
        for(int i = 0; i < vertix.length; i++){
            index = visitedVetrix.updateArr();
            update(index);
        }
    }
}

// 记录已经访问的顶点
class VisitedVetrix{
    public int[] already_arr;

    public int[] pre_visited;

    public int[] dis;

    public VisitedVetrix(int length,int index) {
        this.already_arr = new int[length];
        this.pre_visited =  new int[length];
        this.dis = new int[length];
        Arrays.fill(dis,65536);
        this.already_arr[index] = 1;
        this.dis[index] = 0;
    }

    public boolean in(int index){
        return already_arr[index] == 1;
    }

    public void updateDis(int index,int len){
        dis[index] = len;
    }
    public void upatePre(int pre, int index){
        pre_visited[pre] = index;
    }
    public int getDis(int index){
        return dis[index];
    }
    public int updateArr(){
        int min = 65535, index = 0;
        for(int i = 0; i < already_arr.length; i++){
            if(already_arr[i] ==0 && dis[i] < min){
                min = dis[i];
                index= i;
            }
        }
        already_arr[index] = 1;
        return index;
    }
    public void show(){
        System.out.println("-----------------------------------------------------");
        System.out.println();
        for(int i:pre_visited){
            System.out.print(i +" ");
        }
        System.out.println();
        for(int di : dis){
            System.out.print(di + " ");
        }
        System.out.println();

        char[] vertix = {'A','B','C','D','E','F','G'};
        int count = 0;
        for(int i :dis){
            if(i != 65535){
                System.out.println(vertix[count]+"- > "+ i);
            }
            else{
                System.out.println("N ");
            }
            count++;

        }
        System.out.println();
    }

}
