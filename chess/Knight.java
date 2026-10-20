package lab4.chess;
//knight class inherits from Figure
public class Knight extends Figure {
    //default constructor
    Knight(){
        super(PieceName.KNIGHT, PieceColor.WHITE,LocationX.A,1);
    }

    //normal constructor/will all params (name, color, X, Y)
    Knight(PieceName name,PieceColor color,LocationX X,int Y){
        super(name, color, X, Y);
    }

    //verify knight movement
    public boolean moveTo(LocationX X,int Y){
        //temp holders for chars
        char tempTargetX=X.name().charAt(0);
        char tempX=getX().name().charAt(0);

        int colDiff=Math.abs(tempTargetX-tempX);
        int rowDiff=Math.abs(Y-getY());

        if(colDiff==0 && rowDiff==0){
            return false;
        }

        return ((colDiff==2 && rowDiff==1) || (colDiff==1 && rowDiff==2));
    }

    @Override
    //override toString to print specific values
    public String toString(){
        return "This "+getName().name()+" is "+getColor().name()+
        ", and is at column "+getX().name()+", and row "+getY();
    }
}
