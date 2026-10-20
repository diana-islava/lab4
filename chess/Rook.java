package lab4.chess;
//rook class inherits from Figure
public class Rook extends Figure{
    //default constructor
    Rook(){
        super(PieceName.ROOK, PieceColor.WHITE,LocationX.A,1);
    }

    //normal constructor/will all params (name, color, X, Y)
    Rook(PieceName name,PieceColor color,LocationX X,int Y){
        super(name, color, X, Y);
    }

    //verify rook movement
    public boolean moveTo(LocationX X,int Y){
        //check if move changes location
        if(X==getX() && Y==getY()){
            return false;
        }
        //check if move changes direction and remains at the same col/row
        return X==getX() || Y==getY();
    }

    @Override
    //override toString to print specific values
    public String toString(){
        return "This "+getName().name()+" is "+getColor().name()+
        ", and is at column "+getX().name()+", and row "+getY();
    }
}
