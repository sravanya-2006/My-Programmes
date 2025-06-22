import sys
import matplotlib.pyplot as plt
import numpy as np

# Node class represents each state in the maze
class Node():
    def __init__(self, state, parent, action):
        self.state = state
        self.parent = parent
        self.action = action

# StackFrontier class for DFS
class StackFrontier():
    def __init__(self):
        self.frontier = []

    def add(self, node):
        self.frontier.append(node)

    def contains_state(self, state):
        return any(node.state == state for node in self.frontier)

    def empty(self):
        return len(self.frontier) == 0

    def remove(self):
        if self.empty():
            raise Exception("Empty frontier")
        else:
            node = self.frontier[-1]
            self.frontier = self.frontier[:-1]
            return node

# Maze class that reads maze file, solves, and displays the maze
class Maze():
    def __init__(self, filename):
        with open(filename) as f:
            contents = f.read()

        # Validate start and goal
        if contents.count("A") != 1:
            raise Exception("Maze must have exactly one start point")
        if contents.count("B") != 1:
            raise Exception("Maze must have exactly one goal")

        # Determine height and width of maze
        contents = contents.splitlines()
        self.height = len(contents)
        self.width = max(len(line) for line in contents)

        # Keep track of walls
        self.walls = []
        for i in range(self.height):
            row = []
            for j in range(self.width):
                try:
                    if contents[i][j] == "A":
                        self.start = (i, j)
                        row.append(False)  # Open space
                    elif contents[i][j] == "B":
                        self.goal = (i, j)
                        row.append(False)  # Open space
                    elif contents[i][j] == "%":
                        row.append(True)  # Wall
                    else:
                        row.append(False)  # Open space
                except IndexError:
                    row.append(False)
            self.walls.append(row)

        self.solution = None

    # Print the maze with the solution path (if any)
    def print(self):
        solution = self.solution[1] if self.solution is not None else None
        print()
        for i, row in enumerate(self.walls):
            for j, col in enumerate(row):
                if col:
                    print("%", end="")  # Wall
                elif (i, j) == self.start:
                    print("A", end="")  # Start
                elif (i, j) == self.goal:
                    print("B", end="")  # Goal
                elif solution is not None and (i, j) in solution:
                    print("*", end="")  # Path
                else:
                    print(" ", end="")  # Empty space
            print()
        print()

    # Returns all neighbors of a given state
    def neighbors(self, state):
        row, col = state
        candidates = [
            ("up", (row - 1, col)),
            ("down", (row + 1, col)),
            ("left", (row, col - 1)),
            ("right", (row, col + 1))
        ]

        # Ensure actions are within bounds and valid (not walls)
        result = []
        for action, (r, c) in candidates:
            try:
                if not self.walls[r][c]:
                    result.append((action, (r, c)))
            except IndexError:
                continue
        return result

    # Solves the maze using DFS
    def solve(self):
        """Finds a solution to the maze, if one exists."""

        # Keep track of number of states explored
        self.num_explored = 0

        # Initialize frontier to just the starting position
        start = Node(state=self.start, parent=None, action=None)
        frontier = StackFrontier()
        frontier.add(start)

        # Initialize an empty explored set
        self.explored = set()

        # Keep looping until a solution is found
        while True:

            # If nothing left in frontier, then no path
            if frontier.empty():
                raise Exception("No solution")

            # Choose a node from the frontier
            node = frontier.remove()
            self.num_explored += 1

            # If node is the goal, then we have a solution
            if node.state == self.goal:
                actions = []
                cells = []

                # Follow parent nodes to find the solution
                while node.parent is not None:
                    actions.append(node.action)
                    cells.append(node.state)
                    node = node.parent

                actions.reverse()
                cells.reverse()
                self.solution = (actions, cells)
                return

            # Mark node as explored
            self.explored.add(node.state)

            # Add neighbors to frontier
            for action, state in self.neighbors(node.state):
                if not frontier.contains_state(state) and state not in self.explored:
                    child = Node(state=state, parent=node, action=action)
                    frontier.add(child)

    # Generate a PNG image of the maze
    def generate_image(self, filename="maze_solution.png"):
        maze_array = np.zeros((self.height, self.width, 3), dtype=np.uint8)

        for i in range(self.height):
            for j in range(self.width):
                if self.walls[i][j]:
                    maze_array[i, j] = [0, 0, 0]  # Black for walls
                elif (i, j) == self.start:
                    maze_array[i, j] = [0, 255, 0]  # Green for start
                elif (i, j) == self.goal:
                    maze_array[i, j] = [255, 0, 0]  # Red for goal
                elif self.solution is not None and (i, j) in self.solution[1]:
                    maze_array[i, j] = [255, 255, 0]  # Yellow for path
                else:
                    maze_array[i, j] = [255, 255, 255]  # White for empty space

        plt.imshow(maze_array)
        plt.axis('off')  # Turn off axis
        plt.savefig(filename, bbox_inches='tight', pad_inches=0)
        plt.close()

# Example usage
if __name__ == "__main__":
    maze = Maze("maze1.txt")
    print("Initial Maze:")
    maze.print()
    maze.solve()
    print("Solved Maze:")
    maze.print()
    print(f"States Explored: {maze.num_explored}")
    maze.generate_image("maze_solution.png")
    print("Maze image saved as 'maze_solution.png'.")
