package unionFind;

import java.util.Scanner;

public class UF {
    private int[] id;
    private int count;

    public UF(int N){
        count = N;
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public int count() {return count;}

    public boolean connected(int p, int q){return find(p) == find(q);}

    public void union(int p, int q){
        int pID = find(p);
        int qID = find(q);
        if(pID == qID) return;
        for(int i = 0; i < id.length; i++){
            if(id[i] == pID) id[i] = qID;
        }
        count --;

    }
    public  int find(int p){
        return  id[p];
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.valueOf(reader.nextLine());
        UF uf = new UF(num);
        for(int i = 0; i < num; i++){
            int p = reader.nextInt();
            int q = reader.nextInt();

            if(uf.connected(p,q)) continue;
            uf.union(p,q);
        }
        System.out.println(uf.count);
    }
}
