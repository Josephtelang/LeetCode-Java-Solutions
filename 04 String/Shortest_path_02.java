
public class Shortest_path_02 {
    public static void main(String arg[]){
        String path = "WNEENESENNN";
        System.out.println("The shortest path is : "+shortestPath(path));
    }

    public static double shortestPath(String path){
        int n = path.length();
        int x = 0;
        int y = 0;
     
        for (int i =0 ; i<n ; i++){
            //North
            if (path.charAt(i) == 'N'){
                y++;
            }
            //East
            else if (path.charAt(i) == 'E'){
                x++;
            }
            //South
            else if (path.charAt(i) == 'S'){
                y--;
            }
            //West
            else{
                x--;
            }

        }

        double shortest_path = Math.sqrt(x*x + y*y);
        return shortest_path;
    }
    
    
}
