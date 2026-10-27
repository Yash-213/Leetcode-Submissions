class Solution {
    public String[] createGrid(int n, int m) {
        StringBuilder s = new StringBuilder();
        String[] grid = new String[n];

        int l = 0;
        while (l++ < m) 
            s.append('.');
        
        int idx = 0;
        grid[idx++] = s.toString();
        
        int r = 1;
        while (r++ < n) {
            StringBuilder sb = new StringBuilder();

            l = 0;
            while (l++ < m - 1) sb.append('#');
            
            sb.append('.');
            grid[idx++] = sb.toString();
        }
        return grid;
    }
}