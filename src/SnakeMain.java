import javax.swing.JFrame;

/**
 * @author Rayhan Almer Kusumah, ITS
 */

public class SnakeMain{


	public static void main(String[] args) {
		
		System.out.println("Press A for Astar");
		System.out.println("Press B for BFS");
		System.out.println("Press D for DFS");


		SnakeFrame window=new SnakeFrame();
		window.setVisible(true);

	}

}
