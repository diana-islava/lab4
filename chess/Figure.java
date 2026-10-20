package lab4.chess;
//abstract class, implements intfigure
public abstract class Figure implements IntFigure {
    private PieceName name;
    private PieceColor color;
    private LocationX X;
    private int Y;

    //default constructor
    //TODO: decide what should de default name val for Figure
    Figure(){
        this.name=PieceName.PIECE; this.color=PieceColor.WHITE;
        this.X=LocationX.A; this.Y=1;
    }

    //normal constructor/will all attributes (name,color,X,Y)
    Figure(PieceName name,PieceColor color,LocationX X,int Y){
        this.name=name; this.color=color;
        this.X=X; this.Y=Y;
    }

    //partial implementation of moveTo method
    public abstract boolean moveTo(LocationX X,int Y);

    //getters
    PieceName getName(){
        return this.name;
    }
    PieceColor getColor(){
        return this.color;
    }
    LocationX getX(){
        return this.X;
    }
    int getY(){
        return this.Y;
    }

    //setters
    void setX(LocationX X){
        this.X=X;
    }
    void setY(int Y){
        this.Y=Y;
    }
}

//TODO:delete if enums are a seperate file
enum PieceName{
    PIECE,
    PAWN,KNIGHT,ROOK,
    BISHOP,QUEEN,KING
}

enum PieceColor{
    WHITE,BLACK
}
