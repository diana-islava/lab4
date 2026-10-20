package src.lab4.chess;
//pawn class inherits from Figure
public class Pawn extends Figure{
    //default constructor
    Pawn(){
        super(PieceName.PAWN, PieceColor.WHITE,LocationX.A,1);
    }

    //normal constructor/will all params (name, color, X, Y)
    Pawn(PieceName name,PieceColor color,LocationX X,int Y){
        super(name, color, X, Y);
    }

    //verify pawn movement
    public boolean moveTo(LocationX X,int Y){
        //check if move remains in same col
        if(getX()!=X){
            return false;
        }
    
        //verify move depending on color
        if(getColor()==PieceColor.WHITE){
            return X.name().charAt(0)==getName().name().charAt(0)+1;
        } else if(getColor()==PieceColor.BLACK){
            return X.name().charAt(0)==getName().name().charAt(0)-1;
        }

        return false;
    }

    @Override
    //override toString to print specific values
    public String toString(){
        return "This "+getName().name()+" is "+getColor().name()+
        ", and is at column "+getX().name()+", and row "+getY();
    }
}
