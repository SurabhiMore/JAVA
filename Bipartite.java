// BFS implementation
class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {

        int[] color = new int[V];	// vector to store color of vertex
        Arrays.fill(color, -1);		// assign all as uncolored(-1)

		// to store BFS (vertex)
        Queue<Integer> q = new LinkedList<>();

        boolean isBapartite = true;

        for(int i = 0; i < V; i++)
        {
			// if not colored
            if(color[i] == -1)
            {
				// coloring the uncolored with color i.e. 0
                q.add(i);
                color[i] = 0;
				
                while(!q.isEmpty())
                {
                    int u = q.poll();
					// traversing vertexes connected to current vertex
                    for(Integer v : adj.get(u))
                    {
						// if uncolored
                        if(color[v] == -1)
                        {
							// coloring with opst color to that of parent
                            color[v] = color[u] ^ 1;
                            q.add(v);
                        }
                        else 
							is_Bipratite = is_Bipratite & (color[u] != color[v]);
                    }

                }
            }
        }
        return isBapartite;
    }
};