package T03_BFS;

import java.io.*;
import java.util.*;

/**
 * Created by icaynia on 2017. 7. 16..
 */
public class Main {
    static int V, E, S;
    static int x, y;

    static ArrayList<Integer>[] graph;
    static ArrayList<Integer> bfs;

    static boolean [] visit;
    static Queue<Integer> Q;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Input
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        graph = new ArrayList[E+1];

        for (int i = 1; i <= E; i++)
        {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < E; i++)
        {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            graph[x].add(y);
            graph[y].add(x);
        }

        // Sort
        for (int i = 1; i <= E; i++)
        {
            Collections.sort(graph[i]);
        }
        runBfs();

        // print
        for (int i = 0; i < bfs.size(); i++)
        {
            bw.write(bfs.get(i) + " ");
            bw.flush();
        }
    }

    public static void runBfs()
    {
        visit = new boolean[E+1];
        bfs = new ArrayList<Integer>();
        Q = new LinkedList<Integer>();
        Q.add(S);
        visit[S] = true;

        while(!Q.isEmpty())
        {
            int q = Q.poll();
            bfs.add(q);
            for (int i : graph[q])
            {
                if (!visit[i])
                {
                    Q.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}
