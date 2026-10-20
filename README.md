# Lab 4- Interfaces, Exceptions and Packages

### Files Needed
- `IntFigure.java` (interface)
- `Figure.java` (abstract class, implements IntFigure)
- `Pawn.java` (inherits from Figure)
- `Rook.java` (inherits from Figure)
- `Knight.java` (inherits from Figure)
- `IntBishop.java` (interface)
- `Bishop.java` (implements IntBishop)
- `Queen.java` (inherits from Rook, implements IntBishop
- `King.java` (inherits from Queen)
- `IntChessBoard.java` (interface)
- `ChessBoard.java` (implements IntChessBoard)
- Enum Types (can be seperate files)
  - `LocationX.java`
  - `PieceName.java`
  - `PieceColor.java`
 
### Base class (Figure) attributes & methods
- `protected PieceName name;`
- `protected PieceColor color;`
- `protected LocationX X;`
- `protected int Y;`
- `public Figure()`
- `public Figure(PieceName name,PieceColor color,LocationX X,int Y)`
- `public PieceName getName()`
- `public PieceColor getColor()`
- `public LocationX getX()`
- `public int getY()`
- `public void setX(LocationX X)`
- `public void setRow(int Y)`
- `public abstract boolean moveTo(LocationX X,int Y)`

### Package
Files related to chess figures should begin with `package src.lab4.chess` (not main file which should instead import it)
