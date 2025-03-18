# Relations-Digraphs

This project was developed for my Discrete Structures class and focuses on performing matrix multiplication on two 4x4 adjacency matrices, which represent directed graphs. Each matrix describes how four vertices are connected, where a 1 indicates a directed edge from one vertex to another, and a 0 signifies no direct connection. By multiplying these matrices, the program determines how paths between vertices evolve when combining two graph structures.

The program uses boolean matrices (boolean[][]) to represent connections. It iterates through the matrices and checks whether a path exists by verifying if a connection in the first matrix aligns with a connection in the second. If a connection is found, the corresponding value in the resulting matrix is set to true. Additionally, the program counts the total number of connections in the final matrix and outputs the result.

To improve readability, the program prints Matrix One, Matrix Two, and the Resulting Matrix in a structured format. It also includes labels (X and =) to visually indicate the multiplication process, making the output easier to follow. This project provides a simple and effective way to understand graph theory, adjacency matrices, and basic matrix operations in Java, serving as a practical application of discrete mathematics concepts.

# Output:

![image](https://github.com/user-attachments/assets/f8ca3286-3fd5-48d8-9b2b-3eeafaeefcd1)
