package lab4.chess;
//ChesBoard class implements the IntChessBoard interface
public class ChessBoard implements IntChessBoard {
    public static final int MAX_ROW=8;
    public static final int MIN_ROW=1;

    public boolean verifyCoordinate(LocationX X,int Y){
        if (Y<MIN_ROW || Y>MAX_ROW){
            return false;
        }
        return true;
    }
}
