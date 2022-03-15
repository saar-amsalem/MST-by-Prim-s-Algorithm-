// Saar Amsalem 315473066
// Noa Ben Sahel 208933440
package algo1;

public class MainTrain {

    public static void main(String[] args)
    {
        
        Graph graph = new Graph(20,false,true);
        graph.addEdge(0, 9, 42);
        graph.addEdge(0, 14, 68);
        graph.addEdge(0, 17, 35);
        graph.addEdge(0, 5, 1);
        graph.addEdge(0, 6, 70);
        graph.addEdge(0, 8, 25);
        graph.addEdge(1, 13, 79);
        graph.addEdge(1, 5, 59);
        graph.addEdge(1, 9, 63);
        graph.addEdge(1, 11, 65);
        graph.addEdge(1, 16, 6);
        graph.addEdge(1, 14, 46);
        graph.addEdge(2, 8, 82);
        graph.addEdge(2, 19, 28);
        graph.addEdge(2, 10, 62);
        graph.addEdge(2, 13, 92);
        graph.addEdge(2, 6, 96);
        graph.addEdge(2, 14, 43);
        graph.addEdge(3, 19, 28);
        graph.addEdge(3, 6, 37);
        graph.addEdge(3, 8, 92);
        graph.addEdge(3, 12, 5);
        graph.addEdge(3, 14, 4);
        graph.addEdge(4, 7, 54);
        graph.addEdge(4, 18, 93);
        graph.addEdge(4, 5, 83);
        graph.addEdge(4, 13, 22);
        graph.addEdge(4, 19, 17);
        graph.addEdge(5, 1, 59);
        graph.addEdge(5, 7, 19);
        graph.addEdge(5, 9, 96);
        graph.addEdge(5, 4, 83);
        graph.addEdge(5, 19, 48);
        graph.addEdge(5, 0, 1);
        graph.addEdge(6, 3, 37);
        graph.addEdge(6, 10, 27);
        graph.addEdge(6, 2, 96);
        graph.addEdge(6, 0, 70);
        graph.addEdge(7, 5, 19);
        graph.addEdge(7, 4, 54);
        graph.addEdge(7, 8, 72);
        graph.addEdge(7, 9, 39);
        graph.addEdge(8, 11, 70);
        graph.addEdge(8, 2, 82);
        graph.addEdge(8, 7, 72);
        graph.addEdge(8, 3, 92);
        graph.addEdge(9, 0, 42);
        graph.addEdge(9, 13, 13);
        graph.addEdge(9, 1, 63);
        graph.addEdge(9, 5, 96);
        graph.addEdge(9, 17, 68);
        graph.addEdge(9, 7, 39);
        graph.addEdge(9, 10, 100);
        graph.addEdge(10, 6, 27);
        graph.addEdge(10, 12, 36);
        graph.addEdge(10, 2, 62);
        graph.addEdge(10, 13, 95);
        graph.addEdge(10, 19, 4);
        graph.addEdge(10, 9, 100);
        graph.addEdge(11, 15, 12);
        graph.addEdge(11, 8, 70);
        graph.addEdge(11, 1, 65);
        graph.addEdge(11, 12, 23);
        graph.addEdge(12, 10, 36);
        graph.addEdge(12, 14, 34);
        graph.addEdge(12, 11, 23);
        graph.addEdge(12, 3, 5);
        graph.addEdge(13, 9, 13);
        graph.addEdge(13, 1, 79);
        graph.addEdge(13, 2, 92);
        graph.addEdge(13, 14, 74);
        graph.addEdge(13, 10, 95);
        graph.addEdge(13, 15, 65);
        graph.addEdge(13, 4, 22);
        graph.addEdge(14, 12, 34);
        graph.addEdge(14, 16, 42);
        graph.addEdge(14, 13, 74);
        graph.addEdge(14, 3, 3);
        graph.addEdge(14, 0, 68);
        graph.addEdge(14, 1, 46);
        graph.addEdge(14, 2, 43);
        graph.addEdge(15, 17, 12);
        graph.addEdge(15, 11, 12);
        graph.addEdge(15, 13, 65);
        graph.addEdge(15, 19, 54);
        graph.addEdge(16, 14, 42);
        graph.addEdge(16, 17, 69);
        graph.addEdge(16, 1, 6);
        graph.addEdge(17, 18, 48);
        graph.addEdge(17, 15, 12);
        graph.addEdge(17, 16, 69);
        graph.addEdge(17, 9, 68);
        graph.addEdge(17, 0, 35);
        graph.addEdge(18, 4, 93);
        graph.addEdge(18, 17, 48);
        graph.addEdge(19, 2, 28);
        graph.addEdge(19, 3, 28);
        graph.addEdge(19, 5, 48);
        graph.addEdge(19, 15, 54);
        graph.addEdge(19, 10, 4);
        graph.addEdge(19, 4, 17);
        graph.PrintGraph(graph);
        /*graph.Primexe(graph);

        System.out.println("question 1 MST :");
        graph.PrintGraph(graph.MST);
        System.out.println("*******************************************************");
        System.out.println("Question 2 NEW MST non effective Edge :");
        graph.NewMST(graph.MST, 7, 17, 48);
        System.out.println("*******************************************************");
        System.out.println("Question 2 NEW MST effective Edge :");
        graph.NewMST(graph.MST, 7, 17, 2);*/

        
        
        
    }
    
}