import java.util.Arrays;
public class Triangle {
	public String message;
	Triangle(int a, int b, int c){
        int edge[] = new int[3];
        edge[0] = a;
        edge[1] = b;
        edge[2] = c;
        Arrays.sort(edge);
        if(a > 0&&b > 0&&c > 0) {
        	if(edge[0] + edge[1] > edge[2] && edge[2] - edge[0] < edge[1]){
                if(edge[0] == edge[1]||edge[0] == edge[2]||edge[1] == edge[2]){
                    if(edge[0] == edge[1]&&edge[0] == edge[2])
                        message = "equilateral";
                    else
                        message = "isosceles";
                }
                else
                    message = "scalene";

            }
            else{
                message = "Not a Triangle";
            }

        }
        else {
        	message = "illegal";
        }    

    }
	
}
